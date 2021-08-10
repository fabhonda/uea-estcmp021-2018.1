/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import com.googlecode.javacv.cpp.opencv_core;
import static com.googlecode.javacv.cpp.opencv_core.cvGet2D;
import static com.googlecode.javacv.cpp.opencv_highgui.cvLoadImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author CLIENTE
 */
public class TelaComparacao extends JFrame {
    
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JButton botaocomparar;
    private JLabel imagem;
    
    TelaInicial telainicial = new TelaInicial();
    
    public TelaComparacao(){
        super("Tela Comparação");
        setLayout(null);
        label1 = new JLabel("Chances de ser o Bart: ");
        label1.setBounds( 600,-210,300,500);
        add(label1);
        
        label2 = new JLabel("Chances de ser o Homer: ");
        label2.setBounds( 1100,-210,300,500);
        add(label2);
        
        label3 = new JLabel("Cor da Camisa: ");
        label3.setBounds( 600,-150,300,500);
        add(label3);
        
        label4 = new JLabel("Cor do Calção: ");
        label4.setBounds( 600,-100,300,500);
        add(label4);
        
        label5 = new JLabel("Estilo de Cabelo: ");
        label5.setBounds( 600,-50,300,500);
        add(label5);
        
        label6 = new JLabel("Cor do Sapato: ");
        label6.setBounds( 600,0,300,500);
        add(label6);
        
         label7 = new JLabel("Cor da Camisa: ");
        label7.setBounds( 1100,-150,300,500);
        add(label7);
        
        label8 = new JLabel("Cor do Calção: ");
        label8.setBounds( 1100,-100,300,500);
        add(label8);
        
        label9 = new JLabel("Estilo de Cabelo: ");
        label9.setBounds( 1100,-50,300,500);
        add(label9);
        
        label10 = new JLabel("Cor do Sapato: ");
        label10.setBounds( 1100,0,300,500);
        add(label10);
        
        botaocomparar = new JButton("Comparar");
        botaocomparar.setBounds(800, 500, 100, 30);
        add(botaocomparar);
        
        imagem = new JLabel();
        imagem.setBounds( 100,-150,1000,1000);
        imagem.setIcon(selectFile());
        add(imagem);
        
        botaocomparar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
        Preditor pred = new Preditor();
        pred.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pred.setSize(1920, 1080);
        pred.setVisible(true);
                
                
            }
        });
        
    }
    
    public float[] extrairCaracteristicasImagem(String caminho) {
        float laranjaCamisaBart = 0, azulCalcaoBart = 0, azulSapatoBart = 0;
        float azulCalcaHomer = 0, marromBocaHomer = 0, cinzaSapatoHomer = 0;
        double red, green, blue;
        float[] caracteristicas = new float[7];

        opencv_core.IplImage imagem = cvLoadImage(caminho);

        for (int altura = 0; altura < imagem.height(); altura++) {
            for (int largura = 0; largura < imagem.width(); largura++) {

                // Extração do RGB de cada pixel da imagem
                opencv_core.CvScalar scalarExtraiRgb = cvGet2D(imagem, altura, largura);
                blue = scalarExtraiRgb.val(0);
                green = scalarExtraiRgb.val(1);
                red = scalarExtraiRgb.val(2);

                // Camisa laranja do Bart                    
                if (blue >= 11 && blue <= 22
                        && green >= 85 && green <= 105
                        && red >= 240 && red <= 255) {
                    laranjaCamisaBart++;
                }

                // Calção azul do Bart (metade de baixo da imagem)
                if (altura > (imagem.height() / 2)) {
                    if (blue >= 125 && blue <= 170 && green >= 0 && green <= 12 && red >= 0 && red <= 20) {

                        azulCalcaoBart++;
                    }
                }

                // Sapato do Bart (parte inferior da imagem)
                if (altura > (imagem.height() / 2) + (imagem.height() / 3)) {
                    if (blue >= 125 && blue <= 140 && green >= 3 && green <= 12 && red >= 0 && red <= 20) {

                        azulSapatoBart++;
                    }
                }

                // Calça azul do Homer
                if (blue >= 150 && blue <= 180 && green >= 98 && green <= 120 && red >= 0 && red <= 90) {

                    azulCalcaHomer++;
                }

                // Boca do Homer (pouco mais da metade da imagem)
                if (altura < (imagem.height() / 2) + (imagem.height() / 3)) {
                    if (blue >= 95 && blue <= 140 && green >= 160 && green <= 185 && red >= 175 && red <= 200) {

                        marromBocaHomer++;
                    }
                }

                // Sapato do Homer (parte inferior da imagem)
                if (altura > (imagem.height() / 2) + (imagem.height() / 3)) {
                    if (blue >= 25 && blue <= 45 && green >= 25 && green <= 45 && red >= 25 && red <= 45) {

                        cinzaSapatoHomer++;
                    }
                }
            }
        }

        laranjaCamisaBart = (laranjaCamisaBart / (imagem.height() * imagem.width())) * 100;
        azulCalcaoBart = (azulCalcaoBart / (imagem.height() * imagem.width())) * 100;
        azulSapatoBart = (azulSapatoBart / (imagem.height() * imagem.width())) * 100;
        azulCalcaHomer = (azulCalcaHomer / (imagem.height() * imagem.width())) * 100;
        marromBocaHomer = (marromBocaHomer / (imagem.height() * imagem.width())) * 100;
        cinzaSapatoHomer = (cinzaSapatoHomer / (imagem.height() * imagem.width())) * 100;

        caracteristicas[0] = laranjaCamisaBart;
        caracteristicas[1] = azulCalcaoBart;
        caracteristicas[2] = azulSapatoBart;
        caracteristicas[3] = azulCalcaHomer;
        caracteristicas[4] = marromBocaHomer;
        caracteristicas[5] = cinzaSapatoHomer;

        return caracteristicas;
    }
    
      private ImageIcon selectFile() {
        ImageIcon conteudo = null;
        String caminho = null;
        try {
            JFileChooser jFileChooser = new JFileChooser();
             FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "BMP Images", "bmp","jpg","png");
             jFileChooser.setFileFilter(filter);
            int ok = jFileChooser.showOpenDialog(null);
            if (ok == JFileChooser.APPROVE_OPTION) {
                caminho = jFileChooser.getCurrentDirectory().getPath() + "\\" + jFileChooser.getSelectedFile().getName(); // caminho do arquivo
                conteudo = new ImageIcon(caminho);
                System.out.println(conteudo);
            } else {
                jFileChooser.cancelSelection();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conteudo;
    }
      
    
}
