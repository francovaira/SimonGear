package master.Vistas;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;

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
		lblNewLabel.setBackground(new Color(0, 102, 204));
		lblNewLabel.setIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\SMenuWindow.png"));
		lblNewLabel.setBounds(0, 0, 790, 700);
		add(lblNewLabel);
		
		jugar = new JButton("Volver a Jugar");
		jugar.setBackground(new Color(0, 102, 153));
		jugar.setIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\btnVJugar.jpg"));
		jugar.setBounds(244, 487, 317, 60);
		add(jugar);
		
		salir = new JButton("Salir");
		salir.setBackground(new Color(0, 102, 153));
		salir.setIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\btnVMenu.jpg"));
		salir.setBounds(244, 586, 317, 60);
		add(salir);
	}
	
	public void jugarAddListener(ActionListener action){
		
		jugar.addActionListener(action);
    }
	
	public void salirAddListener(ActionListener action){
		
		salir.addActionListener(action);
    }

}
