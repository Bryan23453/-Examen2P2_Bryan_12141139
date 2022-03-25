/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_bryanespinal_12141139;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author bryan
 */
public class cientificos implements Serializable{
    String nombre;
    ArrayList<planetas> pla=new ArrayList();

    public cientificos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<planetas> getPla() {
        return pla;
    }

    public void setPla(planetas pla) {
        this.pla.add(pla);
    }
    
    
}
