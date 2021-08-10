/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Execucao;

import Interfaces.TelaComparacao;
import Interfaces.TelaInicial;
import javax.swing.JFrame;


/**
 *
 * @author CLIENTE
 */
public class Execucao {
    
    public static void main(String[]args){
        
        TelaInicial telainicial = new TelaInicial();
        telainicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telainicial.setSize(1920, 1080);
        telainicial.setVisible(true);
        
        
        
    }
    
    
    
}
