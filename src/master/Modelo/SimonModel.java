package master.Modelo;

import java.util.ArrayList;
import java.util.Random;

import master.Importante.Botones;
import master.Observer.Observer;
import master.Observer.Subject;

public abstract class SimonModel implements Subject {
	
	protected ArrayList<Botones> secuencia; 
	private ArrayList<Observer> observers;
	private Random random;
	
	public SimonModel() {
		
		secuencia = new ArrayList<Botones>();
		observers = new ArrayList<Observer>();
		random = new Random(System.currentTimeMillis());
		
		this.generarSecuencia();
	}
	
	
	/**
	 * Genera numeros pseudo aleatorios con un rango que va desde 1 (inclusive)
	 * hasta 4 (inclusive) y los agrega a la secuencia.
	 */
	public void generarSecuencia(){
		
        int valor = random.nextInt(4) + 1;
		
		secuencia.add(this.generarEnum(valor));
		
		return;
	}
	
	
	private Botones generarEnum(int valor) {
        
        if(valor == Botones.ROJO.getValor()){
			return Botones.ROJO;
			
		}else if(valor == Botones.VERDE.getValor()){
			return Botones.VERDE;
			
		}else if(valor == Botones.AZUL.getValor()){
			return Botones.AZUL;
			
		}else{
			return Botones.AMARILLO;
		}
	}


	/**
	 * Genera una nueva secuencia de numeros pseudo aleatorios.
	 */
	public void nuevaSecuencia(){
		
		secuencia.clear();
		this.generarSecuencia();
	}
	
	
	/**
	 * Comprueba que un valor pertenece a la secuencia.
	 * @param index
	 * @param boton
	 * @return tru si el valor pertenece a la secuencia, false si lo anterior no se cumple.
	 */
	public boolean esDeLaSecuencia(int index, Botones boton){
		
		if(index > secuencia.size()){
			
			throw new IndexOutOfBoundsException();
		}
		
		if(boton == secuencia.get(index)){
			
			return true;
		}else{
			
			return false;
		}
	}

	@Override
	public void registerObserver(Observer o) {
		
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		
		observers.remove(o);
	}

	@Override
	public void notifyObserver(boolean operacion) {
		
		for(Observer observer: observers){
			
			observer.uptdate(this.getSecuencia(), operacion);
		}
		
	}
	
	public ArrayList<Botones> getSecuencia(){
		
		return secuencia;
	}
	
	
	public abstract void jugar(Botones boton);
	public abstract void resetPosicion();
}
