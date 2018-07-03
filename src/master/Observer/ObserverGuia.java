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
		
		while(contador >= secuencia.size() - 3 && contador >= 0) {
			
			vistaGuia.llenarArray(secuencia.get(contador), contador%3);
			//System.out.println(secuencia.get(contador));
			
			contador--;
		}
		
		vistaGuia.imprimir();
		//System.out.println("------------------------------------");
		
	}
	
	
}