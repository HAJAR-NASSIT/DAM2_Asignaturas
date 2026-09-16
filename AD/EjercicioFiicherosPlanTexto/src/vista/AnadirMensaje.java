package vista;

import java.awt.EventQueue;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import modelo.Mensaje;

public class AnadirMensaje extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel contentPane;
    private JTextField txtDia;
    private JTextField txtDe;
    private JTextField txtPara;
    private JTextField txtAsunto;

    private ArrayList<Mensaje> mensajes;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AnadirMensaje frame = new AnadirMensaje(
                            new ArrayList<Mensaje>()
                    );
                    frame.setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public AnadirMensaje(ArrayList<Mensaje> mensajes) {

        this.mensajes = mensajes;

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        txtDia = new JTextField();
        txtDia.setBounds(74, 10, 56, 18);
        contentPane.add(txtDia);

        JComboBox<String> comboMes = new JComboBox<>();
        comboMes.setModel(new DefaultComboBoxModel<>(new String[] {
                "Enero", "Febrero", "Marzo", "Abril",
                "Mayo", "Junio", "Julio", "Agosto",
                "Septiembre", "Octubre", "Noviembre", "Diciembre"
        }));
        comboMes.setBounds(190, 9, 90, 20);
        contentPane.add(comboMes);

        JComboBox<String> comboAnio = new JComboBox<>();
        comboAnio.setModel(new DefaultComboBoxModel<>(
                new String[] {"2025", "2026", "2027"}
        ));
        comboAnio.setBounds(331, 9, 70, 20);
        contentPane.add(comboAnio);

        JComboBox<String> comboHora = new JComboBox<>();
        comboHora.setModel(new DefaultComboBoxModel<>(new String[] {
                "00", "01", "02", "03", "04", "05", "06",
                "07", "08", "09", "10", "11", "12", "13",
                "14", "15", "16", "17", "18", "19", "20",
                "21", "22", "23"
        }));
        comboHora.setBounds(74, 61, 47, 20);
        contentPane.add(comboHora);

        JComboBox<String> comboMinuto = new JComboBox<>();
        comboMinuto.setModel(new DefaultComboBoxModel<>(new String[] {
                "00", "05", "10", "15", "20", "25",
                "30", "35", "40", "45", "50", "55"
        }));
        comboMinuto.setBounds(194, 61, 47, 20);
        contentPane.add(comboMinuto);

        txtDe = new JTextField();
        txtDe.setBounds(74, 111, 206, 18);
        contentPane.add(txtDe);

        txtPara = new JTextField();
        txtPara.setBounds(74, 139, 206, 18);
        contentPane.add(txtPara);

        txtAsunto = new JTextField();
        txtAsunto.setBounds(74, 167, 206, 18);
        contentPane.add(txtAsunto);

        JTextArea txtContenido = new JTextArea();
        txtContenido.setBounds(74, 195, 206, 31);
        contentPane.add(txtContenido);

        JButton btnOK = new JButton("OK");
        btnOK.setBounds(295, 233, 57, 20);
        contentPane.add(btnOK);

        JButton btnCancel = new JButton("Cancelar");
        btnCancel.setBounds(352, 233, 84, 20);
        contentPane.add(btnCancel);

        JLabel lblFecha = new JLabel("Fecha");
        lblFecha.setBounds(10, 13, 44, 12);
        contentPane.add(lblFecha);

        JLabel lblHora = new JLabel("Hora");
        lblHora.setBounds(10, 65, 44, 12);
        contentPane.add(lblHora);

        JLabel lblDe = new JLabel("De");
        lblDe.setBounds(10, 114, 44, 12);
        contentPane.add(lblDe);

        JLabel lblPara = new JLabel("Para");
        lblPara.setBounds(10, 142, 44, 12);
        contentPane.add(lblPara);

        JLabel lblAsunto = new JLabel("Asunto");
        lblAsunto.setBounds(10, 170, 44, 12);
        contentPane.add(lblAsunto);

        JLabel lblContenido = new JLabel("Contenido");
        lblContenido.setBounds(10, 201, 54, 12);
        contentPane.add(lblContenido);

        JLabel lblDosPuntos = new JLabel(":");
        lblDosPuntos.setBounds(156, 65, 15, 12);
        contentPane.add(lblDosPuntos);

        btnOK.addActionListener(e -> {

            if (txtDia.getText().isBlank()
                    || txtDe.getText().isBlank()
                    || txtPara.getText().isBlank()
                    || txtAsunto.getText().isBlank()
                    || txtContenido.getText().isBlank()) {

                JOptionPane.showMessageDialog(
                        null,
                        "Todos los campos son obligatorios."
                );

            } else {

                try {
                    int dia = Integer.parseInt(txtDia.getText());
                    int mes = comboMes.getSelectedIndex() + 1;
                    int anio = Integer.parseInt(
                            comboAnio.getSelectedItem().toString()
                    );

                    int horaNumero = Integer.parseInt(
                            comboHora.getSelectedItem().toString()
                    );

                    int minuto = Integer.parseInt(
                            comboMinuto.getSelectedItem().toString()
                    );

                    LocalDate fecha = LocalDate.of(anio, mes, dia);
                    LocalTime hora = LocalTime.of(horaNumero, minuto);

                    Mensaje mensaje = new Mensaje(
                            fecha,
                            hora,
                            txtPara.getText(),
                            txtDe.getText(),
                            txtAsunto.getText(),
                            txtContenido.getText()
                    );

                    mensajes.add(mensaje);

                    JOptionPane.showMessageDialog(
                            null,
                            "Mensaje añadido correctamente."
                    );

                    dispose();

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(
                            null,
                            "La fecha introducida no es válida."
                    );
                }
            }
        });

        btnCancel.addActionListener(e -> dispose());
    }
}