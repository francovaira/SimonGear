package master.Vistas;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class SimonView extends JFrame {

	
	private static final long serialVersionUID = 1L;
	
	
	private JPanel contentPane;
	//Referencias a las ventanas
	final static String JUEGO = "El menu del principio";
	final static String PARTIDA = "Comienza una partida";
	final static String AYUDA = "Muesta como jugar";
	final static String SMENU ="Despliega el menu dentro de partida";
	
	//Ventanas 
	private JuegoWindow jWindow;
	private AyudaWindow aWindow;
	private PartidaWindow pWindow;
	
	//ACA ESTA EL MENU SECUNDARIO
	private SMenuWindow smWindow;
	
	/*private JButton btnAyuda;
	private JButton btnBackMenu;
	private JButton btnJugar;
	private JButton btnExit;
	private JButton btnDesafio;*/
	
	private Reproductor reproductor;
	/**
	 * Launch the application.
	
	public static void lanzar(){
		 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimonView frame = new SimonView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public SimonView(JuegoWindow jWindow, AyudaWindow aWindow, PartidaWindow pWindow, SMenuWindow smWindow){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(275, 20, 800, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		//Paneles centrales
		JPanel panelesApp = new JPanel();
		
		this.jWindow = jWindow;
		this.aWindow = aWindow;
		this.pWindow = pWindow;
		this.smWindow = smWindow;
		
		
		reproductor = new Reproductor();
		
		contentPane.add(panelesApp, BorderLayout.CENTER);
		
		panelesApp.setLayout(new CardLayout(0, 0));
		panelesApp.add(jWindow, JUEGO);
		panelesApp.add(pWindow, PARTIDA);
		panelesApp.add(aWindow, AYUDA);
		panelesApp.add(smWindow, SMENU);
		aWindow.setLayout(null);
		
		// Reproductor
		reproductor.play_mainTheme();
	}
	
	public Reproductor getReproductor(){
		
		return reproductor;
	}

}
