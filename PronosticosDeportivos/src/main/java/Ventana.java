import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JCheckBox;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	// hago atributos a los elementos de la ventana
	// para poder llamarlos en otras clases 
	private JButton Boton1;
	private JLabel TitBoton1;
	private JLabel TitBoton2;
	private JButton Boton2;
	private JLabel Titulo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Boton1 = new JButton("Opcion1");
		Boton1.setBounds(71, 133, 85, 21);
		contentPane.add(Boton1);
		
		TitBoton1 = new JLabel("Texto1");
		TitBoton1.setBounds(89, 68, 45, 13);
		contentPane.add(TitBoton1);
		
		TitBoton2 = new JLabel("Texto2");
		TitBoton2.setBounds(307, 68, 45, 13);
		contentPane.add(TitBoton2);
		
		Boton2 = new JButton("Opcion2");
		Boton2.setBounds(289, 133, 85, 21);
		contentPane.add(Boton2);
		
		Titulo = new JLabel("BIENVENIDO");
		Titulo.setBounds(189, 30, 97, 13);
		contentPane.add(Titulo);
	}
}
