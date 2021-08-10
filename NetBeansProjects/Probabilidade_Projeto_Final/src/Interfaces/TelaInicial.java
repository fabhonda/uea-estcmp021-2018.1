/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import org.opencv.core.Core;

/**
 *
 * @author CLIENTE
 */
public class TelaInicial extends JFrame {
    
    private JLabel label1;
    private JLabel label2;
    private JButton botao1;
    
    public TelaInicial(){
        super("Tela Inicial");
        //System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        setLayout(null);
        label1 = new JLabel("Sistema de Reconhecimento de Imagens");
        label1.setBounds(570,-50, 300, 500);
        add(label1);
        
        Icon uea = new ImageIcon(getClass().getResource("UEA200.png"));
        label2 = new JLabel(uea);
        label2.setBounds(600,10, 150, 150);
        add(label2);
        
               
        botao1 = new JButton("Selecionar Imagem");
        botao1.setBounds(600,500, 150, 50);
        add(botao1);
        
        botao1.addActionListener(new ActionListener() {   
            public void actionPerformed(ActionEvent e) {
        Preditor pred = new Preditor();
        pred.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pred.setSize(1920, 1080);
        pred.setVisible(true);
            }
        });
             
    }
    
      
}
