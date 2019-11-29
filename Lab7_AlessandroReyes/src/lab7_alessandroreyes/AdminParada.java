package lab7_alessandroreyes;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminParada {
    private ArrayList<Parada> listaParadas = new ArrayList();
    private File archivo = null;
    
    public AdminParada(String path) {
        archivo = new File(path);
    }

    public ArrayList<Parada> getListaParadas() {
        return listaParadas;
    }

    public void setListaParadas(ArrayList<Parada> listaParadas) {
        this.listaParadas = listaParadas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setParada(Parada a){
        listaParadas.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            listaParadas = new ArrayList();
            Parada temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Parada) objeto.readObject()) != null) {
                        listaParadas.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Parada t : listaParadas) {
                bw.writeObject(t);
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
