
package ejercicio7;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Carrera extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private Trampas trampa;

    // Constructor: recibe la ventana Trampas
    public Carrera(Trampas trampa) {

        this.trampa = trampa;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // BARRAS DE PROGRESO

        JProgressBar progressBarCab1 = new JProgressBar();
        progressBarCab1.setBounds(227, 53, 145, 13);
        contentPane.add(progressBarCab1);

        JProgressBar progressBarCab2 = new JProgressBar();
        progressBarCab2.setBounds(227, 98, 145, 13);
        contentPane.add(progressBarCab2);

        JProgressBar progressBarCab3 = new JProgressBar();
        progressBarCab3.setBounds(227, 147, 145, 13);
        contentPane.add(progressBarCab3);

        JProgressBar progressBarCab4 = new JProgressBar();
        progressBarCab4.setBounds(227, 194, 145, 13);
        contentPane.add(progressBarCab4);

        // NOMBRES DE LOS CABALLOS

        JLabel lblCaballo1 = new JLabel("Caballo 1:");
        lblCaballo1.setBounds(61, 53, 74, 12);
        contentPane.add(lblCaballo1);

        JLabel lblCaballo2 = new JLabel("Caballo 2:");
        lblCaballo2.setBounds(61, 98, 74, 12);
        contentPane.add(lblCaballo2);

        JLabel lblCaballo3 = new JLabel("Caballo 3:");
        lblCaballo3.setBounds(61, 147, 74, 12);
        contentPane.add(lblCaballo3);

        JLabel lblCaballo4 = new JLabel("Caballo 4:");
        lblCaballo4.setBounds(61, 194, 82, 12);
        contentPane.add(lblCaballo4);

        // ETIQUETA GANADOR

        JLabel lblGanador = new JLabel("Ganador : ");
        lblGanador.setBounds(152, 10, 200, 20);
        contentPane.add(lblGanador);

        // BOTÓN EMPEZAR

        JButton btnEmpezar = new JButton("Empieza La carrera");
        btnEmpezar.setBounds(152, 243, 160, 20);
        contentPane.add(btnEmpezar);

        btnEmpezar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    // Obtener prioridades desde Trampas
                    int p1 = trampa.getPrioridad1();
                    int p2 = trampa.getPrioridad2();
                    int p3 = trampa.getPrioridad3();
                    int p4 = trampa.getPrioridad4();

                    // Comprobar prioridades válidas
                    if (p1 >= 1 && p1 <= 10 &&
                        p2 >= 1 && p2 <= 10 &&
                        p3 >= 1 && p3 <= 10 &&
                        p4 >= 1 && p4 <= 10) {

                        // Crear los caballos
                        HiloCaballo hilo1 = new HiloCaballo(
                            progressBarCab1, "Caballo 1", lblGanador);

                        HiloCaballo hilo2 = new HiloCaballo(
                            progressBarCab2, "Caballo 2", lblGanador);

                        HiloCaballo hilo3 = new HiloCaballo(
                            progressBarCab3, "Caballo 3", lblGanador);

                        HiloCaballo hilo4 = new HiloCaballo(
                            progressBarCab4, "Caballo 4", lblGanador);

                        // Crear los Threads
                        Thread caballo1 = new Thread(hilo1);
                        Thread caballo2 = new Thread(hilo2);
                        Thread caballo3 = new Thread(hilo3);
                        Thread caballo4 = new Thread(hilo4);

                        // Asignar prioridades
                        caballo1.setPriority(p1);
                        caballo2.setPriority(p2);
                        caballo3.setPriority(p3);
                        caballo4.setPriority(p4);

                        // Iniciar la carrera
                        caballo1.start();
                        caballo2.start();
                        caballo3.start();
                        caballo4.start();

                        // Evitar empezar dos veces
                        btnEmpezar.setEnabled(false);

                    } else {
                        JOptionPane.showMessageDialog(
                            Carrera.this,
                            "Las prioridades deben estar entre 1 y 10");
                    }

                } catch (NumberFormatException ex) {

                    JOptionPane.showMessageDialog(
                        Carrera.this,
                        "Introduce números válidos");
                }
            }
        });
    }
}
