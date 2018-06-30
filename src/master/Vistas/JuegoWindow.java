package master.Vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

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
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\Principa_nuevo.png"));
		lblNewLabel.setBounds(0, 0, 790, 665);
		add(lblNewLabel);
		
		
		btnJugar = new JButton("Jugar");
		btnJugar.setBounds(318, 400, 150, 40);
		btnJugar.setIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\btnJugar.jpg"));
		add(btnJugar);
		
		btnDesafio = new JButton("Modo Desafio");
		btnDesafio.setBounds(318, 460, 150, 40);
		add(btnDesafio);
		
		btnAyuda = new JButton("Ayuda");
		btnAyuda.setBounds(318, 520, 150, 40);
		btnAyuda.setIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\btnAyuda.jpg"));
		add(btnAyuda);
		
		btnExit = new JButton("Salir");
		btnExit.setBounds(318, 580, 150, 40);
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
