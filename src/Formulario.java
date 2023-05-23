import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Formulario  extends JFrame{
    IngresarAlumno ingresarAlumno = new IngresarAlumno();
    MostrarAlumos mostrarAlumos = new MostrarAlumos();
    private JFrame frame;
    private JPanel paneliz, panelde, paneliz2, panelde2, panelButton, panelForm, panelContainer;
    private JLabel nombre, apellidos, telefono, ine, nombre2, apellidos2, telefono2, ine2;
    private JTextField text1, text2, text3, text4, text5, text6, text7, text8;
    private JButton boton1, boton2;
    public Formulario() {
        EventClick eventClick = new EventClick();

        frame = new JFrame();
        paneliz = new JPanel();
        panelde = new JPanel();
        paneliz2 = new JPanel();
        panelde2 = new JPanel();
        panelButton = new JPanel();
        panelForm = new JPanel();
        panelContainer = new JPanel();
        nombre = new JLabel();
        apellidos = new JLabel();
        telefono = new JLabel();
        ine = new JLabel();

        nombre2 = new JLabel();
        apellidos2 = new JLabel();
        telefono2 = new JLabel();
        ine2 = new JLabel();


        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
        text4 = new JTextField();
        text5 = new JTextField();
        text6 = new JTextField();
        text7 = new JTextField();
        text8 = new JTextField();

        boton1 = new JButton();
        boton2 = new JButton();


        setTitle("Formulario");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(500, 200);

        nombre.setText("Nombre");
        apellidos.setText("Apellidos");
        telefono.setText("Telefono");
        ine.setText("INE");

        nombre2.setText("Nombre2");
        apellidos2.setText("Apellidos2");
        telefono2.setText("Telefono2");
        ine2.setText("INE2");

        boton1.setText("Aceptar");
        boton2.setText("Cancelar");



        paneliz.setLayout(new GridLayout(4, 0));
        paneliz.add(nombre);
        paneliz.add(apellidos);
        paneliz.add(telefono);
        paneliz.add(ine);

        paneliz2.setLayout(new GridLayout(4, 0));
        paneliz2.add(nombre2);
        paneliz2.add(apellidos2);
        paneliz2.add(telefono2);
        paneliz2.add(ine2);

        panelde.setLayout(new GridLayout(4, 0));
        panelde.add(text1);
        panelde.add(text2);
        panelde.add(text3);
        panelde.add(text4);

        panelde2.setLayout(new GridLayout(4, 0));
        panelde2.add(text5);
        panelde2.add(text6);
        panelde2.add(text7);
        panelde2.add(text8);


        panelForm.setLayout(new GridLayout(1, 4));
        panelForm.setPreferredSize(new Dimension(450, 100));
        panelForm.add(paneliz);
        panelForm.add(panelde);
        panelForm.add(paneliz2);
        panelForm.add(panelde2);

        panelButton.setLayout(new FlowLayout());
        panelButton.setPreferredSize(new Dimension(250, 50));
        panelButton.add(boton1);
        boton1.addActionListener(eventClick);

        panelButton.add(boton2);
        boton2.addActionListener(e -> {
                    text1.setText(" ");
                    text2.setText(" ");
                    text3.setText(" ");
                    text4.setText(" ");
                    text5.setText(" ");
                    text6.setText(" ");
                    text7.setText(" ");
                    text8.setText(" ");
                }
        );


        panelContainer.setLayout(new GridLayout(2, 0));
        panelContainer.add(panelForm);
        panelContainer.add(panelButton);
        frame.add(panelContainer);

        }


    public class EventClick implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nombre = text1.getText();
            String apellidos = text2.getText();
            String telefono = text3.getText();
            String ine = text4.getText();

            String nombre2 = text5.getText();
            String apellidos2 = text6.getText();
            String telefono2 = text7.getText();
            String ine2 = text8.getText();

            ingresarAlumno.ingresar(ingresarAlumno.getAlumnos(),nombre,apellidos,telefono,ine);

            ingresarAlumno.ingresar(ingresarAlumno.getAlumnos(),nombre2,apellidos2,telefono2,ine2);

            mostrarAlumos.mostrar(ingresarAlumno.getAlumnos());
            }
        }
}