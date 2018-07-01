package master.Observer;

import java.util.ArrayList;

import master.Importante.Botones;
import master.Vistas.PartidaWindow;

public class ObserverJuego implements Observer {
	
	private PartidaWindow vista;
	
	public ObserverJuego(PartidaWindow vista){
		
		this.vista = vista;
	}

	@Override
	public void uptdate(ArrayList<Botones> secuencia, boolean operacion) {
		
		if(operacion == true){
			
			for(Botones boton: secuencia){
				
				try{
					
	    			Thread.sleep(300);
	    		}catch(InterruptedException e){}
				
				vista.parpadeo(boton);
			}
		}else{
			
			//Reproductor.play_que_te_paso();
			vista.perdiste();
		}
		
	}
	
	

}
