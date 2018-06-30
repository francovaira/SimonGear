package master.Vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class AyudaWindow extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public AyudaWindow() {
		setBounds(275, 20, 800, 700);
		setLayout(null);
		
		JLabel lblAyudawindow = new JLabel("AyudaWindow");
		lblAyudawindow.setIcon(new ImageIcon("C:\\Program Files\\SimonGear\\img\\fondo_Instruccion.jpg"));
		lblAyudawindow.setBounds(0, 0, 800, 700);
		add(lblAyudawindow);

	}

}
