package master.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import master.Importante.Botones;
import master.Modelo.Clasico;
import master.Modelo.ModoDesafio;
import master.Modelo.SimonModel;
import master.Observer.*;
import master.Vistas.*;

public class SimonController {
	
	private static SimonController controller;
	
	private int modoDeJuego;
	private SimonModel modelo;
	private Clasico clasico;
	private ModoDesafio desafio;
	
	private JuegoWindow jWindow;
	private AyudaWindow aWindow;
	private PartidaWindow pWindow;
	private SMenuWindow smWindow;
	private GuiaWindow guia;
	private SimonView simonView;
	
	private SimonController() {
		
		controller = null;
		
		modelo = null;
		clasico = new Clasico();
		desafio = new ModoDesafio();
		
		
		this.pWindow = new PartidaWindow();
		this.aWindow = new AyudaWindow();
		this.jWindow = new JuegoWindow();
		this.guia = new GuiaWindow();
		this.smWindow = new SMenuWindow();
		
		this.simonView = new SimonView(jWindow, aWindow, pWindow, smWindow);
		
		clasico.registerObserver(new ObserverJuego(pWindow));
		clasico.registerObserver(new ObserverGuia(guia));
		
		desafio.registerObserver(new ObserverJuego(pWindow));
		desafio.registerObserver(new ObserverGuia(guia));
		
		pWindow.rojoAddListener(new RojoAction());
		pWindow.verdeAddListener(new VerdeAction());
		pWindow.azulAddListener(new AzulAction());
		pWindow.amarilloAddListener(new AmarilloAction());
		pWindow.ayudaAddListener(new PartidaAyudaAction());
		pWindow.salirAddListener(new VolverAlMenuAction());
		pWindow.perdisteAddListener(new PerdisteAction());
		
		jWindow.salirAddListener(new SalirAction());
		jWindow.ayudaAddListener(new AyudaAction());
		jWindow.jugarAddListener(new JugarAction());
		jWindow.desafioAddListener(new ModoDesafioAction());
		
		smWindow.jugarAddListener(new VolverAJugarAction());
		smWindow.salirAddListener(new VolverAlMenuAction());
		
		aWindow.backMenuAddListener(new VolverAlMenuAction());
		
		simonView.setVisible(true);

	}
	
	public static SimonController singleton(){
		
		if(controller == null){
			
			controller = new SimonController();
			
			return controller;
		}else {
			
			return controller;
		}
	}
	
    public void arrancar(int modoDeJuego){
		
    	if(modoDeJuego == 0){
    		
    		this.modelo = clasico;
    		
    	}else if(modoDeJuego == 1){
    		
    		this.modelo = desafio;    		
    	}
    	
    	this.modelo.resetPosicion();
		this.modelo.resetContador();
		this.guia.clearAyuda();
		this.modelo.nuevaSecuencia();
		
		this.modelo.notifyObserver(true);
	}

    
    //Listeners para la vista del juego
    
   class RojoAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Runnable miRunnable = new Runnable(){
				
		         public void run()
		         {
		        	 modelo.jugar(Botones.ROJO);
		         }
			};
			
			new Thread(miRunnable).start();
		}
	}
	
    class VerdeAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Runnable miRunnable = new Runnable(){
				
		         public void run()
		         {
		        	 modelo.jugar(Botones.VERDE);
		         }
			};
			
			new Thread(miRunnable).start();
		}
	}
    
    class AzulAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Runnable miRunnable = new Runnable(){
				
		         public void run()
		         {
		        	 modelo.jugar(Botones.AZUL);
		         }
			};
			
			new Thread(miRunnable).start();
		}
	}
    
    class AmarilloAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Runnable miRunnable = new Runnable(){
				
		         public void run()
		         {
		        	 modelo.jugar(Botones.AMARILLO);
		         }
			};
			
			new Thread(miRunnable).start();
		}
	}
    
    class PerdisteAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			modelo.resetContador();
			Reproductor.play_que_te_paso();
			pWindow.setVisible(false);
			smWindow.setVisible(true);
		}
    	
    }
    
    class PartidaAyudaAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			jWindow.setVisible(false);
			//simonView.setVisible(false);
			aWindow.setVisible(false);
			smWindow.setVisible(false);
			guia.setVisible(true);
			
		}
    	
    }
    
    
    //Listeners para la vista principal
    
    class JugarAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			modoDeJuego = 0;
			
			Runnable runnable = new Runnable(){

				@Override
				public void run() {
					jWindow.setVisible(false);
					aWindow.setVisible(false);
					guia.setVisible(false);
					smWindow.setVisible(false);
					pWindow.setVisible(true);
					
					simonView.getReproductor().stop_mainTheme();
					simonView.getReproductor().play_background();
					arrancar(modoDeJuego);					
				}	
			};

			
			new Thread(runnable).start();
		}
	}
    
    class AyudaAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			jWindow.setVisible(false);
			guia.setVisible(false);
			smWindow.setVisible(false);
			pWindow.setVisible(false);
			aWindow.setVisible(true);
		}
	}
    
    class SalirAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			System.exit(0);
		}
	}

    class ModoDesafioAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			modoDeJuego = 1;
			
			Runnable miRunnable = new Runnable() {

				@Override
				public void run() {
					
					jWindow.setVisible(false);
					aWindow.setVisible(false);
					guia.setVisible(false);
					smWindow.setVisible(false);
					pWindow.setVisible(true);
					
					simonView.getReproductor().stop_mainTheme();
					simonView.getReproductor().play_background();
					arrancar(modoDeJuego);	
				}
				
				
			};
			
			new Thread(miRunnable).start();
		}
    }
    
    
    //Listeners para la vista que se muersta cuando perdiste
    
    class VolverAlMenuAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			aWindow.setVisible(false);
			guia.setVisible(false);
			smWindow.setVisible(false);
			pWindow.setVisible(false);
			jWindow.setVisible(true);
			
			simonView.getReproductor().stop_background();
			simonView.getReproductor().stop_mainTheme();
			simonView.getReproductor().play_mainTheme();
		}
	}
    
    class VolverAJugarAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Runnable runnable = new Runnable(){

				@Override
				public void run() {
					
					jWindow.setVisible(false);
					aWindow.setVisible(false);
					guia.setVisible(false);
					smWindow.setVisible(false);
					pWindow.setVisible(true);
					
					arrancar(modoDeJuego);
					simonView.getReproductor().stop_mainTheme();
					simonView.getReproductor().play_background();
				}	
			};

			new Thread(runnable).start();
		}
	}
}
