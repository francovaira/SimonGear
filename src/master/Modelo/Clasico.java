package master.Modelo;

import master.Importante.Botones;

public class Clasico extends SimonModel {
	
	private int posicion;
	
	public Clasico() {
		
		super();
		posicion = 0;
	}
	

	@Override
	public void jugar(Botones boton) {
		
		
		if(this.esDeLaSecuencia(posicion, boton)){
			
			if(posicion < secuencia.size()){
				
				posicion++;
				
				if(posicion == secuencia.size()){ // se llego al final de la secuencia
					
					this.generarSecuencia();
					resetPosicion();
					
					this.notifyObserver(true);
				}
			}
			
		}else{
			
			this.notifyObserver(false);
		}
	}
	
	public void resetPosicion(){
		
		this.posicion = 0;
	}
}


