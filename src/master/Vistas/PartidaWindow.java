package master.Vistas;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JSlider;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Button;
import javax.swing.border.TitledBorder;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import java.awt.event.ActionEvent;
import java.awt.ComponentOrientation;
import java.awt.Rectangle;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.SwingConstants;

public class PartidaWindow extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6145301589258112057L;
	/**
	 * Create the panel.
	 */
	JButton btnVerde;
	JButton btnRojo;
	JButton btnAzul;
	JButton btnAmarillo;
	JButton perdiste;
	JButton btnPartidaSalir;
	JButton btnPartidaAyuda;
	
	
	public PartidaWindow() {
		setPreferredSize(new Dimension(786, 652));
		setMinimumSize(new Dimension(0, 0));
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setBounds(new Rectangle(0, 0, 50, 0));
		
		perdiste = new JButton();
			setLayout(null);
			
			//Botones
			btnVerde = new JButton("Verde");
			btnVerde.setBounds(0, 0, 393, 310);
			add(btnVerde);
			
			btnVerde.setIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\Green-dark.jpg"));
			btnVerde.setDisabledIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\Green-dark.jpg"));
			btnVerde.setPressedIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\Green-.jpg"));
			btnVerde.setSelectedIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\Green-.jpg"));
			
			btnRojo = new JButton("Rojo");
			btnRojo.setBounds(393, 0, 393, 310);
			add(btnRojo);
			
			btnRojo.setIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\Red-dark.jpg"));
			btnRojo.setDisabledIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\Red-dark.jpg"));
			btnRojo.setPressedIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\Red-.jpg"));
			btnRojo.setSelectedIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\Red-.jpg"));
			
			btnAzul = new JButton("Azul");
			btnAzul.setBounds(0, 310, 393, 310);
			add(btnAzul);
			
			btnAzul.setIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\Blue-dark.jpg"));
			btnAzul.setDisabledIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\Blue-dark.jpg"));
			btnAzul.setPressedIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\Blue-.jpg"));
			btnAzul.setSelectedIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\Blue-.jpg"));
			
			btnAmarillo = new JButton("Amarillo");
			btnAmarillo.setBounds(393, 310, 393, 310);
			add(btnAmarillo);
			
			btnAmarillo.setIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\Yellow-dark.jpg"));
			btnAmarillo.setDisabledIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\Yellow-dark.jpg"));
			btnAmarillo.setPressedIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\Yellow-.jpg"));
			btnAmarillo.setSelectedIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\Yellow-.jpg"));
			
			btnPartidaSalir = new JButton("Salir");
			btnPartidaSalir.setBounds(new Rectangle(393, 617, 393, 35));
			add(btnPartidaSalir);
			
			btnPartidaAyuda = new JButton("Ayuda");
			btnPartidaAyuda.setBounds(0, 617, 393, 35);
			add(btnPartidaAyuda);
	}
	
	public void rojoAddListener(ActionListener action){
		
		btnRojo.addActionListener(action);
	}
	
    public void verdeAddListener(ActionListener action){
		
		btnVerde.addActionListener(action);
	}
    
    public void azulAddListener(ActionListener action){
		
		btnAzul.addActionListener(action);
	}
	
    public void amarilloAddListener(ActionListener action){
		
		btnAmarillo.addActionListener(action);
	}
    
    public void ayudaAddListener(ActionListener action){
		
		btnPartidaAyuda.addActionListener(action);
	}
    
    public void salirAddListener(ActionListener action){
		
		btnPartidaSalir.addActionListener(action);
	}
    
    public void perdisteAddListener(ActionListener action){
    	
    	perdiste.addActionListener(action);
    }

    public void parpadeo(master.Importante.Botones boton){
    	
    	switch(boton){
    	case ROJO:
    		btnRojo.setIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\Red-.jpg"));
    		
    		try{
    			Thread.sleep(500);
    		}catch(InterruptedException e){
    			
    		}
    		
    		btnRojo.setIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\Red-dark.jpg"));
    		break;
    		
    	case VERDE:
            btnVerde.setIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\Green-.jpg"));
    		
    		try{
    			Thread.sleep(500);
    		}catch(InterruptedException e){
    			
    		}
    		
    		btnVerde.setIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\Green-dark.jpg"));
    		break;
    		
    	case AZUL:
            btnAzul.setIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\Blue-.jpg"));
    		
    		try{
    			Thread.sleep(500);
    		}catch(InterruptedException e){
    			
    		}
    		
    		btnAzul.setIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\Blue-dark.jpg"));
    		break;
    		
    	case AMARILLO:
            btnAmarillo.setIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\Yellow-.jpg"));
    		
    		try{
    			Thread.sleep(500);
    		}catch(InterruptedException e){
    			
    		}
    		
    		btnAmarillo.setIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\Yellow-dark.jpg"));
    		break;
    		
    	}
    }

	public void perdiste() {
		
		//Reproductor.play_que_te_paso();
		perdiste.doClick();
	}
	
	public void asd()
	{}
}
