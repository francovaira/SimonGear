package master.Vistas;

import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.JTextPane;
import java.awt.CardLayout;
import javax.swing.JPopupMenu;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class GuiaWindow extends JPanel {
	public GuiaWindow() {
		setBackground(Color.RED);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 450, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 300, Short.MAX_VALUE)
		);
		setLayout(groupLayout);
	}
	
	private static final long serialVersionUID = 1L;

	public void imprimir(master.Importante.Botones boton) {
		
		//System.out.println(boton);
	}
}
