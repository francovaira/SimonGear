package master.Vistas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.TextArea;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class GuiaWindow extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private String[] ultimosElementos;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	public GuiaWindow() {
		
		this.ultimosElementos = new String[3];
		
		this.setBounds(1075,20,147,155);
		getContentPane().setLayout(null);
		this.setResizable(false);
		
		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(0, 102, 153));
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setEditable(false);
		textField.setBounds(6, 5, 145, 30);
		getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(255, 255, 255));
		textField_1.setBackground(new Color(0, 102, 153));
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setEditable(false);
		textField_1.setBounds(6, 45, 145, 30);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(255, 255, 255));
		textField_2.setBackground(new Color(0, 102, 153));
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.setEditable(false);
		textField_2.setBounds(6, 85, 145, 30);
		getContentPane().add(textField_2);
	}

	public void imprimir() {
		
		this.textField.setText(this.ultimosElementos[0]);
		this.textField_1.setText(this.ultimosElementos[1]);
		this.textField_2.setText(this.ultimosElementos[2]);
		
	}
	
	public void llenarArray(master.Importante.Botones boton, int index){
		
		this.ultimosElementos[index] = "  " + boton.toString();
	}
	
	public void clearAyuda()
	{
		for(int i=0; i<3; i++)
		{
			this.ultimosElementos[i]="";
		}
	}
}
