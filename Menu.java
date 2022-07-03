package guis;

import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Image;

public class Menu extends JFrame{
    public JPanel panel2;

    public Menu() throws IOException {
        setSize(1000,680);
        setTitle("Menú de Opciones");
        setLocationRelativeTo(null);
        añadirPartes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void añadirPartes() throws IOException {
        añadirPanel();
        añadirBotonesSeleccionadores();
        añadorBotonesOpcionales();
    }

    private void añadirPanel(){
        panel2 = new JPanel();
        panel2.setLayout(null);
        this.getContentPane().add(panel2);
        panel2.setBackground(Color.ORANGE);
    }

    private void añadirBotonesSeleccionadores(){
        JButton boton2 = new JButton();
        boton2.setText("Seleccionar");
        boton2.setBounds(50,100,120,20);
        boton2.setHorizontalAlignment(SwingConstants.CENTER);
        panel2.add(boton2);
        boton2.setOpaque(true);
        boton2.setBackground(Color.LIGHT_GRAY);

        JButton boton3 = new JButton();
        boton3.setText("Seleccionar");
        boton3.setBounds(290,100,120,20);
        boton3.setHorizontalAlignment(SwingConstants.CENTER);
        panel2.add(boton3);
        boton3.setOpaque(true);
        boton3.setBackground(Color.LIGHT_GRAY);

        JButton boton4 = new JButton();
        boton4.setText("Seleccionar");
        boton4.setBounds(540,100,120,20);
        boton4.setHorizontalAlignment(SwingConstants.CENTER);
        panel2.add(boton4);
        boton4.setOpaque(true);
        boton4.setBackground(Color.LIGHT_GRAY);

        JButton boton5 = new JButton();
        boton5.setText("Seleccionar");
        boton5.setBounds(790,100,120,20);
        boton5.setHorizontalAlignment(SwingConstants.CENTER);
        panel2.add(boton5);
        boton5.setOpaque(true);
        boton5.setBackground(Color.LIGHT_GRAY);

        JButton boton6 = new JButton();
        boton6.setText("Seleccionar");
        boton6.setBounds(50,250,120,20);
        boton6.setHorizontalAlignment(SwingConstants.CENTER);
        panel2.add(boton6);
        boton6.setOpaque(true);
        boton6.setBackground(Color.LIGHT_GRAY);

        JButton boton7 = new JButton();
        boton7.setText("Seleccionar");
        boton7.setBounds(290,250,120,20);
        boton7.setHorizontalAlignment(SwingConstants.CENTER);
        panel2.add(boton7);
        boton7.setOpaque(true);
        boton7.setBackground(Color.LIGHT_GRAY);

        JButton boton8 = new JButton();
        boton8.setText("Seleccionar");
        boton8.setBounds(540,250,120,20);
        boton8.setHorizontalAlignment(SwingConstants.CENTER);
        panel2.add(boton8);
        boton8.setOpaque(true);
        boton8.setBackground(Color.LIGHT_GRAY);

        JButton boton9 = new JButton();
        boton9.setText("Seleccionar");
        boton9.setBounds(790,250,120,20);
        boton9.setHorizontalAlignment(SwingConstants.CENTER);
        panel2.add(boton9);
        boton9.setOpaque(true);
        boton9.setBackground(Color.LIGHT_GRAY);
    }

    private void añadorBotonesOpcionales(){
        JButton Boton1 = new JButton();
        Boton1.setText("Imagen Seleccionada");
        Boton1.setBounds(355,410,250,50);
        Boton1.setFont(new Font("arial", Font.BOLD,20));
        panel2.add(Boton1);

        JButton Boton2 = new JButton();
        Boton2.setText("Establecer como");
        Boton2.setBounds(100,570,200,20);
        panel2.add(Boton2);

        JButton Boton3 = new JButton();
        Boton3.setText("Importar Imagen");
        Boton3.setBounds(380,570,200,20);
        panel2.add(Boton3);

        JButton Boton4 = new JButton();
        Boton4.setText("Descargar");
        Boton4.setBounds(660,570,200,20);
        panel2.add(Boton4);
    }
}
