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
