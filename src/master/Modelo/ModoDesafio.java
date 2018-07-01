package master.Modelo;

import master.Importante.Botones;

public class ModoDesafio extends SimonModel {
	
	private int posicion=0;
	private int contador=0;
	private int i=0;

	public ModoDesafio() {
		super();
	}

	@Override
	public void jugar(Botones boton) {
		
		if(this.esDeLaSecuencia(posicion, boton)){
			
			if(posicion < secuencia.size()){
				
				posicion++;
				
				if(posicion == secuencia.size()){ // se llego al final de la secuencia
					
					for(i=0; i<this.contador+1; i++)
					{
						this.generarSecuencia();
					}
					
					contador++;
					resetPosicion();
					
					this.notifyObserver(true);
				}
			}
			
		}else{
			
			this.resetContador();
			this.notifyObserver(false);
		}
	}
	
	@Override
	public void resetPosicion() {
		
		this.posicion=0;
	}
	
	public void resetContador()
	{
		contador=0;
	}
	
}
