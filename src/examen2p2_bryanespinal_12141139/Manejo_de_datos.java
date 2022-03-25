/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_bryanespinal_12141139;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author bryan
 */
public class Manejo_de_datos {

    ArrayList<cientificos> cienti = new ArrayList();
    ArrayList<planetas> pla = new ArrayList();
    File archivo = null;

    public Manejo_de_datos(String path) {
        archivo = new File(path);
        pla.add(new terrestres(5000,13000,"Mercurio",400,300));
        pla.add(new terrestres(100000,15000,"Venus",640,260));
        pla.add(new terrestres(140000,17000,"Tierra",760,570));
        pla.add(new terrestres(90000,12000,"Marte",360,360));
        pla.add(new terrestres(400000,40000,"Jupiter",340,310));
        pla.add(new terrestres(300000,30000,"Saturno",560,450));
        pla.add(new terrestres(200000,20000,"Urano",670,690));
        pla.add(new terrestres(200000,20000,"Neptuno",840,900));
    }

    public ArrayList<cientificos> getCienti() {
        return cienti;
    }

    public void setCienti(cientificos cienti) {
        this.cienti.add(cienti);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<planetas> getPla() {
        return pla;
    }

    public void setPla(ArrayList<planetas> pla) {
        this.pla = pla;
    }

    public void cargarArchivo() {
        try {
            cientificos cientifico;
            cienti = new ArrayList();
            if (archivo.exists()) {
                FileInputStream en = new FileInputStream(archivo);
                ObjectInputStream ob = new ObjectInputStream(en);
                try {
                    while ((cientifico = (cientificos) ob.readObject()) != null) {
                        cienti.add(cientifico);
                    }
                } catch (EOFException e) {
                }
                ob.close();
                en.close();
            }
        } catch (Exception ex) {

        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (cientificos C : cienti) {
                bw.writeObject(C);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

    public void cargarArchivopublicos() {
        try {
            planetas plas;
            pla = new ArrayList();
            if (archivo.exists()) {
                FileInputStream en = new FileInputStream(archivo);
                ObjectInputStream ob = new ObjectInputStream(en);
                try {
                    while ((plas = (planetas) ob.readObject()) != null) {
                        pla.add(plas);
                    }
                } catch (EOFException e) {
                }
                ob.close();
                en.close();
            }else{
            }
        } catch (Exception ex) {

        }
    }
    public void escribirArchivo2() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (planetas plass : pla) {
                bw.writeObject(plass);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

}
