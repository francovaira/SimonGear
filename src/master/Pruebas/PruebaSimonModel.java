package master.Pruebas;


import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

import master.Modelo.Clasico;
import master.Modelo.SimonModel;

public class PruebaSimonModel {
	
	SimonModel simon = new Clasico();
	ArrayList<master.Importante.Botones> secuencia = simon.getSecuencia();
	
	/**
	 * Comprueba que el ArrayList contiene un elemento cuando se crea.
	 */
	@Test
	public void generarsecuenciaTest1(){
		
		assertEquals(secuencia.size(), 1);
	}
	
	
	/**
	 * Se generar secuencia se llama N veces, el Arraylist debe contener N+1 elementos
	 */
	@Test
	public void generarsecuenciaTest2(){
		
		simon.generarSecuencia();
		simon.generarSecuencia();
		simon.generarSecuencia();
		simon.generarSecuencia();
		
		assertEquals(secuencia.size(), 5);
	}
	
	/**
	 * Comprueba que los elementos en el ArrayList pertenecen a los elementos definidos como botones.
	 */
	@Test
	public void generarsecuenciaTest3(){
		
		for(int i = 0; i < secuencia.size(); i++){
			
			master.Importante.Botones valor = secuencia.get(i);
			
			if(master.Importante.Botones.AMARILLO.equals(valor) == false && master.Importante.Botones.VERDE.equals(valor) == false && 
					master.Importante.Botones.AZUL.equals(valor) == false && master.Importante.Botones.ROJO.equals(valor) == false){
				
				fail("ERROR el boton no coincide");
			}
		}
		
	}
	
	/**
	 * Prueba del metodo nuevaSecuencia.
	 */
	@Test
	public void generarsecuenciaTest4(){
		
		simon.nuevaSecuencia();
		assertEquals(secuencia.size(), 1);
	}
	
	/*
	 * Comprueba que el metodo retorna true cuando se le pasa un elemento correcto
	 */
	@Test
	public void esDeLaSecuenciaTest1(){
		
		assertEquals(simon.esDeLaSecuencia(0, secuencia.get(0)), true);
	}
	
	@Test
    public void esDeLaSecuenciaTest2(){
		
		assertEquals(simon.esDeLaSecuencia(secuencia.size() - 1, 
				secuencia.get(secuencia.size() - 1)), true);
	}
	
	/**
	 * Comprueba que el metodo no deja buscar un elemento en una posicion inexistente.
	 */
	@Test
    public void esDeLaSecuenciaTest3(){
		
		master.Importante.Botones valor = master.Importante.Botones.VERDE;
		int index = 1000;
		
		try{
			
			assertEquals(simon.esDeLaSecuencia(index, valor), false);
		}catch(IndexOutOfBoundsException e){
			
			System.out.println("EsdeLaSecuenciaTest3()."
					+ " Se capturo la excepcion con exito");
		}
	}
}

