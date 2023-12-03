package view;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controller.Logica;
import controller.Participante;

import java.awt.event.*;
import java.awt.Toolkit;
import java.awt.Font;
import java.util.List;

public class Ventana extends JFrame {

	private DefaultTableModel modeloTabla;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	// hago atributos a los elementos de la ventana
	// para poder llamarlos en otras clases

	private JButton btnPuntaje;
	private JLabel titulo;

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

	public Ventana() {

		setTitle("ProdeSoft");
		setIconImage(Toolkit.getDefaultToolkit().getImage("src\\main\\resources\\img\\icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		titulo = new JLabel("ProDeSoft");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Arial Black", Font.BOLD, 30));
		titulo.setBounds(94, 10, 245, 31);
		contentPane.add(titulo);

		JLabel descripcionPrincipal = new JLabel("Software de pronósticos deportivos (ProDe)");
		descripcionPrincipal.setHorizontalAlignment(SwingConstants.CENTER);
		descripcionPrincipal.setBounds(75, 46, 285, 13);
		contentPane.add(descripcionPrincipal);

		btnPuntaje = new JButton("Ver puntajes");
		btnPuntaje.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnPuntaje.setBounds(160, 69, 115, 30);
		contentPane.add(btnPuntaje);

		/////////////////////// tabla ///////////////////////////

		modeloTabla = new DefaultTableModel(new Object[] { "Participante", "Puntos", "Aciertos" }, 0);

		JTable tablaResultados = new JTable(modeloTabla);

		JScrollPane scrollPane = new JScrollPane(tablaResultados);
		scrollPane.setBounds(10, 110, 414, 140);
		contentPane.add(scrollPane);

		///////////////// area de la logica /////////////////////

		btnPuntaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// al presionar el boton, llama al metodo para mostrar los resultados en la
				// tabla
				mostrarResultadosEnTabla();
			}
		});

	}

	private void mostrarResultadosEnTabla() {

		modeloTabla.setRowCount(0);

		List<Participante> participantes = obtenerListaDeParticipantes();

		for (Participante participante : participantes) {

			modeloTabla.addRow(
					new Object[] { participante.getNombre(), participante.getPuntos(), participante.getAciertos() });
		}
	}

	// metodo para obtener la lista de participantes desde la logica //
	private List<Participante> obtenerListaDeParticipantes() {
		Logica logica = null;
		return logica.getParticipantes();

	}

}
