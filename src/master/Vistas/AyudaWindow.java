package master.Vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class AyudaWindow extends JPanel {

	private JButton btnBackMenu;
	
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public AyudaWindow() {
		setBounds(275, 20, 800, 700);
		setLayout(null);
		
		JLabel lblAyudawindow = new JLabel("AyudaWindow");
		lblAyudawindow.setIcon(new ImageIcon("C:\\Users\\tolay\\OneDrive\\Escritorio\\IMAGENES SIMON GEAR\\AyudaWindow.png"));
		lblAyudawindow.setBounds(0, 0, 800, 700);
		add(lblAyudawindow);

		btnBackMenu = new JButton("Volver al Menu");
		btnBackMenu.setBounds(335, 597, 157, 60);
		btnBackMenu.setIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\btnMenu.jpg"));
		add(btnBackMenu);
	}

	 public void backMenuAddListener(ActionListener action){
			
			btnBackMenu.addActionListener(action);
	}
}
