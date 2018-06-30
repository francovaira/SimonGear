package master.Vistas;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class SMenuWindow extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private JButton jugar;
	private JButton salir;
	
	public SMenuWindow() {
		setBounds(275, 20, 800, 700);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Franco\\Documents\\Materias\\Ingenieria de Software\\TP Final - SimonGear\\Multimedia\\Imagen\\SMEnu_2.png"));
		lblNewLabel.setBounds(0, 5, 788, 700);
		add(lblNewLabel);
		
		jugar = new JButton("Volver a Jugar");
		jugar.setIcon(new ImageIcon("C:\\Users\\Franco\\Documents\\Materias\\Ingenieria de Software\\TP Final - SimonGear\\Multimedia\\Imagen\\btnVolverJugar.jpg"));
		jugar.setVisible(true);
		jugar.setBounds(272, 450, 250, 60);
		add(jugar);
		
		salir = new JButton("Salir");
		salir.setIcon(new ImageIcon("C:\\Users\\Franco\\Documents\\Materias\\Ingenieria de Software\\TP Final - SimonGear\\Multimedia\\Imagen\\btnMenu2.jpg"));
		salir.setBounds(272, 540, 250, 60);
		add(salir);
	}
	
	public void jugarAddListener(ActionListener action){
		
		jugar.addActionListener(action);
    }
	
	public void salirAddListener(ActionListener action){
		
		salir.addActionListener(action);
    }

}
