package lab7_alessandroreyes;

import javax.swing.JProgressBar;
import javax.swing.JSpinner;

public class AdministrarRuta {
    private JProgressBar progBar_d;
    private boolean avanzar;
    private boolean vive;

    public AdministrarRuta() {
    
    }

    public AdministrarRuta(JProgressBar progBar_d) {
        this.progBar_d = progBar_d;
        avanzar = true;
        vive = true;
    }

    public JProgressBar getProgBar_d() {
        return progBar_d;
    }

    public void setProgBar_d(JProgressBar progBar_d) {
        this.progBar_d = progBar_d;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    public void run(){
        while(vive){
            if(avanzar){
                progBar_d.setValue(Math.round());
                progBar_d.setString(Integer.toString(progBar_d.getValue()) + "Kilometros");
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}
