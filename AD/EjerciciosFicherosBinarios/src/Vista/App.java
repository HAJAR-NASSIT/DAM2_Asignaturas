package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class App extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
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
	public App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEquipoLocal = new JLabel("Equipo Local");
		lblEquipoLocal.setBounds(10, 14, 86, 14);
		contentPane.add(lblEquipoLocal);
		
		JLabel lblEquipoVisitante = new JLabel("Equipo visitante");
		lblEquipoVisitante.setBounds(10, 47, 113, 14);
		contentPane.add(lblEquipoVisitante);
		
		JLabel lblGolesl = new JLabel("Goles Locales");
		lblGolesl.setBounds(10, 83, 86, 14);
		contentPane.add(lblGolesl);
		
		JLabel lblGolesv = new JLabel("Goles Visitante");
		lblGolesv.setBounds(10, 119, 86, 14);
		contentPane.add(lblGolesv);
		
		JLabel lblLugar = new JLabel("Lugar");
		lblLugar.setBounds(10, 150, 46, 14);
		contentPane.add(lblLugar);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(10, 181, 46, 14);
		contentPane.add(lblFecha);
		
		textField = new JTextField();
		textField.setBounds(173, 11, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(173, 44, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(173, 80, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(173, 116, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(173, 147, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(173, 178, 86, 20);
		contentPane.add(textField_5);
		
		JButton btnAñadir = new JButton("Añadir");
		btnAñadir.setBounds(34, 225, 89, 23);
		contentPane.add(btnAñadir);
		
		JButton btnCargar = new JButton("Cargar");
		btnCargar.setBounds(170, 225, 89, 23);
		contentPane.add(btnCargar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(302, 225, 89, 23);
		contentPane.add(btnGuardar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 2, 2);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBounds(0, 0, 1, 1);
		contentPane.add(table);

	}
}
