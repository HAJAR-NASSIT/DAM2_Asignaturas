package vista;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import modelo.Mensaje;

public class ImprimirMensajes extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel contentPane;
    private JTable table;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ImprimirMensajes frame = new ImprimirMensajes(
                            new ArrayList<Mensaje>()
                    );
                    frame.setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ImprimirMensajes(ArrayList<Mensaje> mensajes) {

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 850, 350);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(20, 20, 795, 250);
        contentPane.add(scrollPane);

        table = new JTable();
        scrollPane.setViewportView(table);

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("De");
        modelo.addColumn("Para");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora");
        modelo.addColumn("Asunto");
        modelo.addColumn("Contenido");

        for (Mensaje m : mensajes) {

            Object datos[] = {
                    m.getDe(),
                    m.getPara(),
                    m.getFecha(),
                    m.getHora(),
                    m.getAsunto(),
                    m.getContenido()
            };

            modelo.addRow(datos);
        }

        table.setModel(modelo);
    }
}