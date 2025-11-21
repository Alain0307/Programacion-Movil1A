/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.galeria2;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author elga0
 */
public class Galeria2 extends JFrame{

JButton btnAdelante, btnAtras;
    JPanel panelbtn;
    ArrayList<ImageIcon> images;
    int ImgActual;
    JLabel etimage;

    public Galeria2() {
        setTitle("Mi Galería 2");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        images = new ArrayList<>();
        images.add(new ImageIcon(getClass().getResource("/galeria2/imagenes/tyler.jpg")));
        images.add(new ImageIcon(getClass().getResource("/galeria2/imagenes/tyler2.jpg")));
        images.add(new ImageIcon(getClass().getResource("/galeria2/imagenes/kanye.jpg")));

        etimage = new JLabel();
        showImage(ImgActual);

        btnAtras = new JButton("Atrás");
        btnAdelante = new JButton("Adelante");

        btnAtras.addActionListener(e -> showImage(ImgActual - 1));
        btnAdelante.addActionListener(e -> showImage(ImgActual + 1));

        panelbtn = new JPanel();
        panelbtn.add(btnAtras);
        panelbtn.add(btnAdelante);

        add(etimage);
        add(panelbtn);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Galeria2();
    }

    public void showImage(int nuevaPos) {
        if (nuevaPos < 0) {
            nuevaPos = images.size() - 1;
        } else if (nuevaPos >= images.size()) {
            nuevaPos = 0;
        }

        this.ImgActual = nuevaPos;
        etimage.setIcon(images.get(ImgActual));

        System.out.println("Mostrando imagen #" + ImgActual);
    }
}
