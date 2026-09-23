package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.GestionFicheros;
import Modelo.Partido;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class App extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textEquipoLocal;
	private JTextField textEquipoVisitante;
	private JTextField textGolesLocales;
	private JTextField textGolesVisitantes;
	private JTextField textLugar;
	private JTextField textFecha;
	private JTable table;
	private DefaultTableModel modeloTabla;
	private ArrayList<Partido> listaPartidos = new ArrayList<>();
	private GestionFicheros gestionFicheros = new GestionFicheros();
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
		setBounds(100, 100, 529, 525);
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
		
		textEquipoLocal = new JTextField();
		textEquipoLocal.setBounds(173, 11, 86, 20);
		contentPane.add(textEquipoLocal);
		textEquipoLocal.setColumns(10);
		
		textEquipoVisitante = new JTextField();
		textEquipoVisitante.setColumns(10);
		textEquipoVisitante.setBounds(173, 44, 86, 20);
		contentPane.add(textEquipoVisitante);
		
		textGolesLocales = new JTextField();
		textGolesLocales.setColumns(10);
		textGolesLocales.setBounds(173, 80, 86, 20);
		contentPane.add(textGolesLocales);
		
		textGolesVisitantes = new JTextField();
		textGolesVisitantes.setColumns(10);
		textGolesVisitantes.setBounds(173, 116, 86, 20);
		contentPane.add(textGolesVisitantes);
		
		textLugar = new JTextField();
		textLugar.setColumns(10);
		textLugar.setBounds(173, 147, 86, 20);
		contentPane.add(textLugar);
		
		textFecha = new JTextField();
		textFecha.setColumns(10);
		textFecha.setBounds(173, 178, 86, 20);
		contentPane.add(textFecha);
		
		JButton btnAñadir = new JButton("Añadir");
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				anadirPartidos();
			}

			
		});
		btnAñadir.setBounds(34, 225, 89, 23);
		contentPane.add(btnAñadir);
		
		JButton btnCargar = new JButton("Cargar");
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			listaPartidos =	gestionFicheros.cargarPartidos();
			modeloTabla= (DefaultTableModel) table.getModel();
			modeloTabla.setRowCount(0);
			
			for ( Partido partido : listaPartidos) {
				modeloTabla.addRow(new Object[] {
						partido.getEquipoLocal(),
						partido.getEquipoVisitante(),
						partido.getGolesLocal(),
						partido.getGolesVisitante(),
						partido.getLugar(),
						partido.getFecha()
				});
			}
			JOptionPane.showMessageDialog(null,"Los partidos se han cargado correctamente");
			}
		});
		btnCargar.setBounds(170, 225, 89, 23);
		contentPane.add(btnCargar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gestionFicheros.guardarPartidos(listaPartidos);
				JOptionPane.showMessageDialog(null, "Los partidos se han guardado correctamente");
			}
		});
		btnGuardar.setBounds(302, 225, 89, 23);
		contentPane.add(btnGuardar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 289, 493, 95);

		table = new JTable();
		
		modeloTabla=new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						  "Equipo Local", "Equipo Visitante", "Goles Local", "Goles Visitante", "Lugar", "Fecha"
				});
		table.setModel(modeloTabla);
		table.setBounds(10, 289, 10, 10);
		
		scrollPane.setViewportView(table);
		contentPane.add(scrollPane);
		
	}
	
	
	private void anadirPartidos() {
		String txtLocal = textEquipoLocal.getText().trim();
		String txtVis =  textEquipoVisitante.getText().trim();
		String txtGlesLocal =textGolesLocales.getText().trim();
		String txtGlesVis = textGolesVisitantes .getText().trim();
		String txtLugar =textLugar.getText().trim();
		String txtFecha = textFecha.getText().trim();
		
		String regexTextos = "^[a-zA-Z0-9 ]{1,20}$";
		String regexGoles = "^[1-9]{1,2}$";
		 String regexFecha = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/[0-9]{2}$";
		 
		 if(!txtLocal.matches(regexTextos) || !txtVis.matches(regexTextos) || !txtLugar.matches(regexTextos)) {
			 JOptionPane.showMessageDialog(null, "Hay que introducir valores De 1 a 20 caracteres y números");
			 return;
		 }
		 if(!txtGlesLocal.matches(regexGoles) || !txtGlesVis.matches(regexGoles)) {
			 JOptionPane.showMessageDialog(null, "Hay que introducir valores Números de 1 a 2 dígitos.");
			 return;
		 }
		 if(!txtFecha.matches(regexFecha)) {
			 JOptionPane.showMessageDialog(null, "el formato de la fecha es dd/MM/yy");
			 return;
		 }
		 
		 int golesL = Integer.parseInt(txtGlesLocal);
		 int golesVis=Integer.parseInt(txtGlesVis);
		  java.time.format.DateTimeFormatter formateador = java.time.format.DateTimeFormatter.ofPattern("d/M/yy");
		    LocalDate fecha = LocalDate.parse(txtFecha, formateador);
		 
		 Partido nuevoPartido = new Partido(txtLocal,txtVis,golesL,golesVis,txtLugar,fecha);
		 listaPartidos.add(nuevoPartido);
		 
		 modeloTabla.setRowCount(0);
		 for (Partido p : listaPartidos) {
			 Object[] fila = {
		                p.getEquipoLocal(),
		                p.getEquipoVisitante(),
		                p.getGolesLocal(),
		                p.getGolesVisitante(),
		                p.getLugar(),
		                p.getFecha()
		            };
			 modeloTabla.addRow(fila);
			 
			// 5. Blanquear/Limpiar los campos de texto
			 textEquipoLocal.setText("");
			 textEquipoVisitante.setText("");
			 textGolesLocales.setText("");
			 textGolesVisitantes.setText("");
			 textLugar.setText("");
			 textFecha.setText("");
		        
		        JOptionPane.showMessageDialog(null, "Partido añadido correctamente.");
		}
		 
		 
		 
		 
		 
		 
	}
}
