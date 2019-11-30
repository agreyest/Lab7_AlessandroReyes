package lab7_alessandroreyes;

import javax.swing.JProgressBar;
import javax.swing.JSpinner;

public class AdministrarRuta extends Thread{
    private JProgressBar progBar_d;
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    private double velocidad;
    private boolean avanzar;
    private boolean vive;

    public AdministrarRuta() {
    
    }

    public AdministrarRuta(JProgressBar progBar_d, double x1, double x2, double y1, double y2, double velocidad) {
        this.progBar_d = progBar_d;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.velocidad = velocidad;
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
                int x = ((int)Distancia(x1, x2, y1, y2, velocidad) );
                progBar_d.setValue(x);
                progBar_d.setString(Integer.toString(progBar_d.getValue()) + "Kilometros");
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
    public double Distancia(double x1, double x2, double y1, double y2, double velocidad){
        double d=0;
        d= (Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2))) /velocidad;
        return d;
    }
}
