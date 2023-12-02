package view;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import controller.Logica;

import java.awt.event.*;
import java.awt.Toolkit;
import java.awt.Font;
import view.VisorConsola;


public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	// hago atributos a los elementos de la ventana
	// para poder llamarlos en otras clases 
	private JButton btnConsola;
	private JLabel titBoton1;
	private JLabel titBoton2;
	private JButton btnVentana;
	private JLabel titulo;

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
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("src\\main\\resources\\img\\icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnConsola = new JButton("Ver por consola");
		btnConsola.setFont(new Font("Tahoma", Font.PLAIN, 11));

		btnConsola.setBounds(47, 134, 115, 30);
		contentPane.add(btnConsola);
		
		titBoton1 = new JLabel("Texto1");
		titBoton1.setBounds(89, 111, 45, 13);
		contentPane.add(titBoton1);
		
		titBoton2 = new JLabel("Texto2");
		titBoton2.setBounds(307, 111, 45, 13);
		contentPane.add(titBoton2);
		
		btnVentana = new JButton("Ver por ventana");
		btnVentana.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnVentana.setBounds(269, 134, 115, 30);
		contentPane.add(btnVentana);
		
		titulo = new JLabel("ProDeSoft");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		titulo.setBounds(135, 10, 160, 31);
		contentPane.add(titulo);
		
		JLabel descripcionPrincipal = new JLabel("Software de pronosticos deportivos (ProDe)");
		descripcionPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		descripcionPrincipal.setBounds(75, 46, 285, 13);
		contentPane.add(descripcionPrincipal);
		
		
///////////////// area de la logica /////////////////////
		
		
		
		btnConsola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
////////////////////////////////////////////////////////////////////////////////////
				Logica logic = new Logica();
				
				VisorConsola.mostrarResultados(logic.getParticipantes());
				
////////////////////////////////////////////////////////////////////////////////////
				
			}
		});
	}
}
