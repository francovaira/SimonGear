package master.Vistas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.TextArea;
import java.awt.BorderLayout;
import java.awt.Font;

public class GuiaWindow extends JFrame {
	
	private String[] ultimosElementos;
	TextArea textArea;
	TextArea textArea_1;
	TextArea textArea_2;
	
	public GuiaWindow() {
		
		this.ultimosElementos = new String[3];
		
		this.setBounds(0,0,136,226);
		getContentPane().setLayout(null);
		
		textArea = new TextArea();
		textArea.setFont(new Font("DialogInput", Font.BOLD, 20));
		textArea.setBounds(0, 132, 110, 60);
		textArea.setEditable(false);
		
		getContentPane().add(textArea);
		
		textArea_1 = new TextArea();
		textArea_1.setBounds(0, 66, 110, 60);
		textArea_1.setFont(new Font("DialogInput", Font.BOLD, 20));
		textArea_1.setEditable(false);
		getContentPane().add(textArea_1);
		
		textArea_2 = new TextArea();
		textArea_2.setBounds(0, 0, 110, 60);
		textArea_2.setFont(new Font("DialogInput", Font.BOLD, 20));
		textArea_2.setEditable(false);
		getContentPane().add(textArea_2);
	}
	
	private static final long serialVersionUID = 1L;

	public void imprimir() {
		
		this.textArea.setText(this.ultimosElementos[0]);
		this.textArea_1.setText(this.ultimosElementos[1]);
		this.textArea_2.setText(this.ultimosElementos[2]);
		
		/*this.textArea.setText(boton.toString());*/
		
	}
	
	public void llenarArray(master.Importante.Botones boton, int index){
		
		this.ultimosElementos[index] = boton.toString();
	}
}
