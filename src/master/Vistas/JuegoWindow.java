package master.Vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;

public class JuegoWindow extends JPanel {
	
	private JButton btnAyuda;
	private JButton btnJugar;
	private JButton btnExit;
	private JButton btnDesafio;

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public JuegoWindow() {
		
		setBounds(275, 20, 800, 700);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 790, 665);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\Principal.png"));
		add(lblNewLabel);
		
		btnJugar = new JButton("Jugar");
		btnJugar.setBackground(new Color(0, 102, 153));
		btnJugar.setBounds(303, 293, 150, 60);
		btnJugar.setIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\btnJugar.jpg"));
		add(btnJugar);
		
		btnDesafio = new JButton("Modo Desafio");
		btnDesafio.setBackground(new Color(0, 102, 153));
		btnDesafio.setBounds(304, 394, 150, 60);
		btnDesafio.setIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\btnModoDesafio.jpg"));
		add(btnDesafio);
		
		btnAyuda = new JButton("Ayuda");
		btnAyuda.setBackground(new Color(0, 102, 153));
		btnAyuda.setBounds(303, 497, 151, 60);
		btnAyuda.setIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\btnAyuda.jpg"));
		add(btnAyuda);
		
		btnExit = new JButton("Salir");
		btnExit.setBackground(new Color(0, 102, 153));
		btnExit.setBounds(302, 590, 150, 62);
		btnExit.setIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\btnSalir.jpg"));
		add(btnExit);

	}
	
	public void jugarAddListener(ActionListener action){
		
		btnJugar.addActionListener(action);
	}
 
	public void ayudaAddListener(ActionListener action){
		
		btnAyuda.addActionListener(action);
	}
 
	public void salirAddListener(ActionListener action){
		
		btnExit.addActionListener(action);
	}
	 
	 public void desafioAddListener(ActionListener action){
		 
		 	btnDesafio.addActionListener(action);
	 }
}
