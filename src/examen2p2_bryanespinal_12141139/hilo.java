/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_bryanespinal_12141139;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JProgressBar;

/**
 *
 * @author bryan
 */
public class hilo implements Runnable{
   JProgressBar barra;
   int valor;

    public hilo(JProgressBar H,int valor) {
        this.barra = H;
        this.valor=valor;
    }
    
    @Override
    public void run() {
        while(true){
            
        }        
    }
}