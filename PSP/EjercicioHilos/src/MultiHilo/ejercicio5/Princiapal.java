package ejercicio5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Princiapal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private HiloContador hilo1 ;
	private HiloContador hilo2 ;
	private HiloContador hilo3 ;
	
	private Thread h1 ;
	private Thread h2 ;
	private Thread h3 ;

	private JLabel lblPri1;
	private JLabel lblPri2;
	private JLabel lblPri3;
	
	private JLabel lblHilo1;
	private JLabel lblHilo2;
	private JLabel lblHilo3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Princiapal frame = new Princiapal();
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
	public Princiapal() {
		
		 hilo1 = new HiloContador();
		 hilo2 = new HiloContador();
		 hilo3 = new HiloContador();
		
		 h1 = new Thread(hilo1);
		 h2 = new Thread(hilo2);
		 h3 = new Thread(hilo3);
		 
		 h1.setPriority(Thread.NORM_PRIORITY);
		 h2.setPriority(Thread.NORM_PRIORITY);
		 h3.setPriority(Thread.NORM_PRIORITY);
		
		h1.start();
		h2.start();
		h3.start();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMenos = new JButton("---");
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h1.setPriority(Thread.MIN_PRIORITY);
				lblPri1.setText("Pri : " + h1.getPriority());
			}
		});
		btnMenos.setBounds(10, 37, 84, 20);
		contentPane.add(btnMenos);
		
		JButton btnFinHilo1 = new JButton("Fin hilo1");
		btnFinHilo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hilo1.finalizar();
			}
		});
		btnFinHilo1.setBounds(144, 37, 84, 20);
		contentPane.add(btnFinHilo1);
		
		JButton btnMas = new JButton("+++");
		btnMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h1.setPriority(Thread.MAX_PRIORITY);
				lblPri1.setText("Pri : " + h1.getPriority());
			}
		});
		btnMas.setBounds(286, 37, 84, 20);
		contentPane.add(btnMas);
		
		JButton btnMenos2 = new JButton("---");
		btnMenos2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h2.setPriority(Thread.MIN_PRIORITY);
				lblPri2.setText("Pri : " + h2.getPriority());
			}
		});
		btnMenos2.setBounds(10, 83, 84, 20);
		contentPane.add(btnMenos2);
		
		JButton btnFinhilo2 = new JButton("Fin hilo 2 ");
		btnFinhilo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hilo2.finalizar();
			}
		});
		btnFinhilo2.setBounds(144, 83, 84, 20);
		contentPane.add(btnFinhilo2);
		
		JButton btnMas2 = new JButton("+++");
		btnMas2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h2.setPriority(Thread.MAX_PRIORITY);
				lblPri2.setText("Pri : " + h2.getPriority());
			}
		});
		btnMas2.setBounds(286, 83, 84, 20);
		contentPane.add(btnMas2);
		
		JButton btnMenos3 = new JButton("---");
		btnMenos3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h3.setPriority(Thread.MIN_PRIORITY);
				lblPri3.setText("Pri : " + h3.getPriority());
			}
		});
		btnMenos3.setBounds(10, 129, 84, 20);
		contentPane.add(btnMenos3);
		
		JButton btnFinhilo3 = new JButton("Fin hilo 3");
		btnFinhilo3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hilo3.finalizar();
			}
		});
		btnFinhilo3.setBounds(144, 129, 84, 20);
		contentPane.add(btnFinhilo3);
		
		JButton btnMas3 = new JButton("+++");
		btnMas3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				h3.setPriority(Thread.MAX_PRIORITY);
				lblPri3.setText("Pri : " + h3.getPriority());
			}
		});
		btnMas3.setBounds(286, 129, 84, 20);
		contentPane.add(btnMas3);
		
		JButton btnfinalizarTodos = new JButton("Finalizar todos");
		btnfinalizarTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hilo1.finalizar();
				hilo2.finalizar();
				hilo3.finalizar();
			}
		});
		
		btnfinalizarTodos.setBounds(122, 182, 136, 20);
		contentPane.add(btnfinalizarTodos);
		
		 lblHilo1 = new JLabel("Hilo 1 :" +hilo1.getContador());
		lblHilo1.setBounds(70, 240, 84, 12);
		contentPane.add(lblHilo1);
		
		 lblHilo2 = new JLabel("Hilo 2 : " +hilo2.getContador());
		lblHilo2.setBounds(70, 282, 84, 12);
		contentPane.add(lblHilo2);
		
		 lblHilo3 = new JLabel("Hilo 3 :" +hilo3.getContador());
		lblHilo3.setBounds(70, 323, 84, 12);
		contentPane.add(lblHilo3);
		
		
		 lblPri1 = new JLabel("Pri :"+ h1.getPriority());
		lblPri1.setBounds(224, 240, 84, 12);
		contentPane.add(lblPri1);
		
		 lblPri2 = new JLabel("Pri :" +h2.getPriority());
		lblPri2.setBounds(224, 282, 84, 12);
		contentPane.add(lblPri2);
		
		 lblPri3 = new JLabel("Pri :" +h3.getPriority());
		lblPri3.setBounds(224, 323, 95, 12);
		contentPane.add(lblPri3);
		
		javax.swing.Timer timer = new javax.swing.Timer(1000, e -> {
		    
		    lblHilo1.setText("Hilo 1 : " + hilo1.getContador());
		    lblHilo2.setText("Hilo 2 : " + hilo2.getContador());
		    lblHilo3.setText("Hilo 3 : " + hilo3.getContador());
		    
		});

		timer.start();

	}
}
