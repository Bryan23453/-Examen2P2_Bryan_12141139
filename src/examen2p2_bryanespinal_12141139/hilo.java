/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_bryanespinal_12141139;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author bryan
 */
public class hilo implements Runnable{
   JProgressBar barra;
   int valor;
   JLabel a;
   JLabel b;

    public hilo(JProgressBar H,int valor,JLabel a,JLabel b) {
        this.barra = H;
        this.valor=valor;
        this.a=a;
        this.b=b;
    }
    
    @Override
    public void run() {
        int pass=0;
        System.out.println(pass+"   "+valor);
        while(pass<=valor){
            barra.setValue(barra.getValue()+1);
            pass++;
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
            }
        }
        barra.setValue(0);
        b.setVisible(false);
        a.setVisible(true);
    }
}
