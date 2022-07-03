package datos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaUsuario extends JFrame{
    public JPanel panel;
    public JTextField cajaDeTexto;
    public JButton boton;

    public VentanaUsuario(){
        setSize(400,400);
        setTitle("Datos de Usuario");
        setLocationRelativeTo(null);
        agregarPartes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void agregarPartes(){
        colocarPanel();
        colocarEtiquetas();
        colocarCajasDeTexto();
        colocarBotones();
    }

    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    private void colocarEtiquetas(){
        JLabel etiqueta0 = new JLabel();
        etiqueta0.setText("Ingrese sus datos:");
        etiqueta0.setBounds(30,30,150,20);
        panel.add(etiqueta0);
        etiqueta0.setOpaque(true);

        JLabel etiqueta1 = new JLabel();
        etiqueta1.setText("Usuario:");
        etiqueta1.setBounds(30,80,100,20);
        panel.add(etiqueta1);
        etiqueta1.setOpaque(true);

        JLabel etiqueta2 = new JLabel();
        etiqueta2.setText("Contraseña:");
        etiqueta2.setBounds(30,120,100,20);
        panel.add(etiqueta2);
        etiqueta2.setOpaque(true);
    }

    private void colocarCajasDeTexto(){
        JTextField cajaDeTexto1 = new JTextField();
        cajaDeTexto1.setBounds(150,80,100,25);
        panel.add(cajaDeTexto1);

        JPasswordField cajaDeTexto2 = new JPasswordField();
        cajaDeTexto2.setBounds(150,120,100,25);
        panel.add(cajaDeTexto2);
    }

    private void colocarBotones(){
        JButton boton1 = new JButton();
        boton1.setText("Aceptar");
        boton1.setBounds(40,300,100,20);
        panel.add(boton1);

        JButton boton2 = new JButton();
        boton2.setText("Salir");
        boton2.setBounds(250,300,100,20);
        panel.add(boton2);

        /*JLabel responder = new JLabel();
        responder.setBounds();

        ActionListener respuesta = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };*/
    }
}