package master.Vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class JuegoWindow extends JPanel {

	/**
	 * 
	 */
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
		
		
		
	}
}
