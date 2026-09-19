package MultiProcesos;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class VentanaProcesos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	// Componentes de la interfaz gráfica (Cajas de texto, Etiquetas y Áreas)
	private JTextField txtCmd1, txtCmd2, txtCmd3;
	private JLabel lblPid1, lblPid2, lblPid3;
	private JLabel lblPadre1, lblPadre2, lblPadre3;
	private JTextArea areaResultado2, areaResultado3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaProcesos frame = new VentanaProcesos();
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
	public VentanaProcesos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Aumentamos un poco el tamaño (ancho, alto) para que quepan bien las columnas de texto
		setBounds(100, 100, 600, 550); 
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.setLayout(new BorderLayout(10, 10));
		setContentPane(contentPane);

		// 1. PANEL SUPERIOR: 3 Columnas con campos de texto y botones "Start"
		JPanel panelSuperior = new JPanel(new GridLayout(1, 3, 15, 0));
		
		// Columna 1 (Programa de sistema)
		JPanel col1 = new JPanel(new BorderLayout(0, 5));
		txtCmd1 = new JTextField("taskmgr");
		JButton btnStart1 = new JButton("Start");
		btnStart1.addActionListener(e -> ejecutarProceso1());
		col1.add(txtCmd1, BorderLayout.NORTH);
		col1.add(btnStart1, BorderLayout.SOUTH);
		
		// Columna 2 (Comando CMD)
		JPanel col2 = new JPanel(new BorderLayout(0, 5));
		txtCmd2 = new JTextField("ipconfig");
		JButton btnStart2 = new JButton("Start");
		btnStart2.addActionListener(e -> ejecutarProceso2());
		col2.add(txtCmd2, BorderLayout.NORTH);
		col2.add(btnStart2, BorderLayout.SOUTH);
		
		// Columna 3 (Programa Java Hijo lanzado 5 veces)
		JPanel col3 = new JPanel(new BorderLayout(0, 5));
		txtCmd3 = new JTextField("Prueba");
		JButton btnStart3 = new JButton("Start");
		btnStart3.addActionListener(e -> ejecutarProceso3());
		col3.add(txtCmd3, BorderLayout.NORTH);
		col3.add(btnStart3, BorderLayout.SOUTH);

		panelSuperior.add(col1);
		panelSuperior.add(col2);
		panelSuperior.add(col3);
		contentPane.add(panelSuperior, BorderLayout.NORTH);

		//  2. PANEL CENTRAL: Rejilla para mostrar PID y PID Padre alineados
		JPanel panelInfo = new JPanel(new GridLayout(2, 4, 10, 10));
		lblPid1 = new JLabel("-"); lblPid2 = new JLabel("-"); lblPid3 = new JLabel("-");
		lblPadre1 = new JLabel("-"); lblPadre2 = new JLabel("-"); lblPadre3 = new JLabel("-");

		panelInfo.add(new JLabel("PID:"));
		panelInfo.add(lblPid1); panelInfo.add(lblPid2); panelInfo.add(lblPid3);
		
		panelInfo.add(new JLabel("PID Padre:"));
		panelInfo.add(lblPadre1); panelInfo.add(lblPadre2); panelInfo.add(lblPadre3);

		//  3. PANEL INFERIOR: Visualización de los resultados de texto (Columnas 2 y 3)
		JPanel panelResultados = new JPanel(new GridLayout(1, 3, 15, 10));
		areaResultado2 = new JTextArea(); areaResultado2.setEditable(false);
		areaResultado3 = new JTextArea(); areaResultado3.setEditable(false);
		
		panelResultados.add(new JLabel("Resultado: ", SwingConstants.LEFT));
		panelResultados.add(new JScrollPane(areaResultado2));
		panelResultados.add(new JScrollPane(areaResultado3));

		// Estructuramos el centro uniendo la información de PIDs y los cuadros de resultado
		JPanel panelCentralContenedor = new JPanel(new BorderLayout(10, 15));
		panelCentralContenedor.add(panelInfo, BorderLayout.NORTH);
		panelCentralContenedor.add(panelResultados, BorderLayout.CENTER);
		
		contentPane.add(panelCentralContenedor, BorderLayout.CENTER);
	}

	// =========================================================================
	// LÓGICA BOTÓN 1: Arranca un programa independiente de Windows (.exe)
	// =========================================================================
	private void ejecutarProceso1() {
		try {
			String programa = txtCmd1.getText().trim();
			// Si el usuario no escribe la extensión .exe se la añadimos automáticamente
			if (!programa.endsWith(".exe")) {
				programa += ".exe";
			}
			ProcessBuilder pb = new ProcessBuilder(programa);
			Process p = pb.start();
			
			lblPid1.setText(String.valueOf(p.pid()));
			lblPadre1.setText(String.valueOf(ProcessHandle.current().pid()));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "No se pudo abrir el programa indicado.");
		}
	}

	// =========================================================================
	// LÓGICA BOTÓN 2: Ejecuta un comando interno en la consola CMD y lee la salida
	// =========================================================================
	private void ejecutarProceso2() {
		areaResultado2.setText(""); // Limpiamos la pantalla anterior
		try {
			ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", txtCmd2.getText().trim());
			Process p = pb.start();

			lblPid2.setText(String.valueOf(p.pid()));
			lblPadre2.setText(String.valueOf(ProcessHandle.current().pid()));

			BufferedReader lector = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String linea;
			while ((linea = lector.readLine()) != null) {
				areaResultado2.append(linea + "\n");
			}
			lector.close();
		} catch (Exception e) {
			areaResultado2.setText("Error al ejecutar el comando en la consola.");
		}
	}

	// =========================================================================
	// LÓGICA BOTÓN 3: Lanza 5 instancias del programa hijo enviando texto por tubería
	// =========================================================================
	private void ejecutarProceso3() {
		areaResultado3.setText(""); // Limpiamos pantalla anterior
		StringBuilder pidsAcumulados = new StringBuilder();
		String textoAEnviar = txtCmd3.getText();

		// Bucle de 5 repeticiones como exige la práctica
		for (int i = 0; i < 5; i++) {
			try {
				// ⚠️ REVISIÓN: Asegúrate de que tu clase 'EjemploLectura' esté guardada en el paquete 'MultiProcesos'
				ProcessBuilder pb = new ProcessBuilder("java", "-cp", "bin", "MultiProcesos.EjemploLectura");
				Process p = pb.start();

				// Guardamos el PID separado por espacios
				pidsAcumulados.append(p.pid()).append(" ");

				// Pasamos el texto al teclado invisible del proceso hijo
				BufferedWriter escritor = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
				escritor.write(textoAEnviar);
				escritor.newLine();
				escritor.flush();
				escritor.close();

				// Añadimos el texto informativo y leemos lo que responde el hijo
				areaResultado3.append("Introduce una cadena...\n");
				BufferedReader lector = new BufferedReader(new InputStreamReader(p.getInputStream()));
				String linea;
				while ((linea = lector.readLine()) != null) {
					areaResultado3.append(linea + "\n");
				}
				lector.close();
				p.waitFor();

			} catch (Exception e) {
				areaResultado3.append("Error al comunicar con el proceso hijo " + (i + 1) + "\n");
			}
		}

		lblPid3.setText(pidsAcumulados.toString().trim());
		lblPadre3.setText(String.valueOf(ProcessHandle.current().pid()));
	}
}
