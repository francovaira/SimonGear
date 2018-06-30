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
	
	public SimonController() {
		
		modelo = null;
		clasico = new Clasico();
		desafio = new ModoDesafio();
		
		this.pWindow = new PartidaWindow();
		this.aWindow = new AyudaWindow();
		this.jWindow = new JuegoWindow();
		this.guia = new GuiaWindow();
		this.smWindow = new SMenuWindow();
		
		this.simonView = new SimonView(jWindow, aWindow, pWindow, smWindow);
		
		pWindow.rojoAddListener(new RojoAction());
		pWindow.verdeAddListener(new VerdeAction());
		pWindow.azulAddListener(new AzulAction());
		pWindow.amarilloAddListener(new AmarilloAction());
		pWindow.ayudaAddListener(new PartidaAyudaAction());
		pWindow.salirAddListener(new VolverAlMenuAction());
		pWindow.perdisteAddListener(new PerdisteAction());
		
		simonView.salirAddListener(new SalirAction());
		simonView.ayudaAddListener(new AyudaAction());
		simonView.jugarAddListener(new JugarAction());
		simonView.backMenuAddListener(new VolverAlMenuAction());
		simonView.desafioAddListener(new ModoDesafioAction());
		
		smWindow.jugarAddListener(new VolverAJugarAction());
		smWindow.salirAddListener(new VolverAlMenuAction());
		
		
		
		simonView.setVisible(true);
		
	}
	
    public void arrancar(int modoDeJuego){
		
    	if(modoDeJuego == 0){
    		
    		this.modelo = clasico;
    		
    		this.clasico.resetPosicion();
        	this.modelo.nuevaSecuencia();
    	}else if(modoDeJuego == 1){
    		
    		this.modelo = desafio;
    		
    		this.desafio.resetPosicion();
        	this.modelo.nuevaSecuencia();
    		
    	}
    	
    	modelo.registerObserver(new ObserverJuego(pWindow));
		modelo.registerObserver(new ObserverGuia(guia));
		
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
			
			Reproductor.play_que_te_paso();
			pWindow.setVisible(false);
			smWindow.setVisible(true);
		}
    	
    }
    
    class PartidaAyudaAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
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
			
			aWindow.setVisible(true);
			jWindow.setVisible(false);
		}
	}
    
    class SalirAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			System.exit(0);
		}
	}
    
    class BackMenuAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			jWindow.setVisible(true);
			aWindow.setVisible(false);
			pWindow.setVisible(false);
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
			
			smWindow.setVisible(false);
			jWindow.setVisible(true);
			pWindow.setVisible(false);
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
