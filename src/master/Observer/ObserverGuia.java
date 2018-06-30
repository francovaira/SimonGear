package master.Observer;

import java.util.ArrayList;

public class ObserverGuia implements Observer {
	
	private master.Vistas.GuiaWindow vistaGuia;
	
	public ObserverGuia(master.Vistas.GuiaWindow vistaGuia){
		
		this.vistaGuia = vistaGuia;
	}
	
	@Override
	public void uptdate(ArrayList<master.Importante.Botones> secuencia, boolean operacion) {
		
		int contador = secuencia.size() - 1;
		
		while(contador >= secuencia.size() - 4 && contador >= 0) {
			
			
		}
		
	}
	
	
}
