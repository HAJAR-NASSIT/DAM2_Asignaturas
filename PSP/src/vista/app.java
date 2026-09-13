package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;


public class app extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					app frame = new app();
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
	public app() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(153, 211, 125, 23);
		contentPane.add(btnSalir);
		
		JButton btnImprimir = new JButton("imprimir mensajes");
		btnImprimir.setBounds(153, 177, 125, 23);
		contentPane.add(btnImprimir);
		
		JButton btnCargar = new JButton("Cargar mensajes");
		btnCargar.setBounds(153, 143, 125, 23);
		contentPane.add(btnCargar);
		
		JButton btnGuardar = new JButton("Guardar mensajes");
		btnGuardar.setBounds(153, 109, 125, 23);
		contentPane.add(btnGuardar);
		
		JButton btnAnadir = new JButton("Añadir mensajes");
		btnAnadir.setBounds(153, 75, 125, 23);
		contentPane.add(btnAnadir);

	}
}
