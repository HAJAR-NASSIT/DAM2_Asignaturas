
package ejercicio7;

import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

public class HiloCaballo implements Runnable {

    private JProgressBar barra;
    private String caballo;
    private JLabel ganador;
    private volatile boolean ejecutando = true;

    // Constructor
    public HiloCaballo(JProgressBar barra, String caballo, JLabel ganador) {
        this.barra = barra;
        this.caballo = caballo;
        this.ganador = ganador;
    }

    @Override
    public void run() {

        Random r = new Random();
        int valor = 0;

        // Repetir mientras el caballo no llegue a la meta
        while (ejecutando && valor < 100) {

            // Número aleatorio entre 1 y 10
            int numero = r.nextInt(10) + 1;

            // Sumar el avance al valor actual
            int suma = valor + numero;

            // No superar el máximo de la barra
            valor = Math.min(suma, 100);

            int progreso = valor;

            // Actualizar la barra en el hilo de Swing
            SwingUtilities.invokeLater(() -> {
                barra.setValue(progreso);
            });

            // Esperar un segundo
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                ejecutando = false;
            }
        }

        // Mostrar el primer caballo que llega a la meta
        if (ejecutando && valor >= 100) {

            SwingUtilities.invokeLater(() -> {

                if (ganador.getText().equals("Ganador : ")) {
                    ganador.setText("Ganador : " + caballo);
                }

            });
        }
    }

    // Terminar el hilo
    public void terminar() {
        ejecutando = false;
    }
}
