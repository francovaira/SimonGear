package master.Vistas;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;

public class GuiaWindow extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private String[] ultimosElementos;
	private JTextField[] textFields;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	private boolean flag=false;
	private int auxiliar=0;
	private int contador=0;
	
	public GuiaWindow() {
		getContentPane().setBackground(new Color(102, 102, 255));
		
		setVisible(false);
		
		this.ultimosElementos = new String[3];
		this.textFields=new JTextField[3];
		
		this.setBounds(0,0,180,200);
		getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(12, 13, 110, 36);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(12, 62, 110, 36);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(12, 111, 110, 31);
		getContentPane().add(textField_3);
		
		this.textFields[0]=textField_1;
		this.textFields[1]=textField_2;
		this.textFields[2]=textField_3;
	}

	public void imprimir() {
		
		if(contador>=3)
		{
			flag=true;
		}
		
		else
		{
			this.textField_1.setText(this.ultimosElementos[0]);
			this.textField_2.setText(this.ultimosElementos[1]);
			this.textField_3.setText(this.ultimosElementos[2]);
			
			flag=false;
			contador++;
		}
		
		if(flag==true)
		{			
			if(auxiliar==0)
			{
				this.textFields[0].setText(this.ultimosElementos[1]);
				this.textFields[1].setText(this.ultimosElementos[2]);
				this.textFields[2].setText(this.ultimosElementos[0]);
			}
			
			if(auxiliar==1)
			{
				this.textFields[0].setText(this.ultimosElementos[2]);
				this.textFields[1].setText(this.ultimosElementos[0]);
				this.textFields[2].setText(this.ultimosElementos[1]);
			}
			
			if(auxiliar==2)
			{
				this.textFields[0].setText(this.ultimosElementos[0]);
				this.textFields[1].setText(this.ultimosElementos[1]);
				this.textFields[2].setText(this.ultimosElementos[2]);
			}
			
			auxiliar++;
			
			if(auxiliar>2)
			{
				auxiliar=0;
			}
			
			/*this.textFields[0].setText(this.ultimosElementos[1]);
			this.textFields[1].setText(this.ultimosElementos[2]);
			this.textFields[2].setText(this.ultimosElementos[0]);*/
			
			/*this.textField_1.setText(this.ultimosElementos[0]);
			this.textField_2.setText(this.ultimosElementos[1]);
			this.textField_3.setText(this.ultimosElementos[2]);*/
		}
	}
	
	public void guardarEnArray(master.Importante.Botones boton, int index){
		
		this.ultimosElementos[index] = boton.toString() + " " + index;
	}
	
	public void clearAyuda()
	{
		for(int i=0; i<3; i++)
		{
			this.ultimosElementos[i]="";
		}
	}
}