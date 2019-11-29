package lab7_alessandroreyes;

public class Parada {
    private String nombre;
    private int km;//km
    private double angulo;//rad
    private double coordenadax;
    private double coordenaday;

    public Parada() {
    }

    public Parada(String nombre, int km, double angulo) {
        this.nombre = nombre;
        this.km = km;
        if(angulo > 0 && angulo <= 360){
            this.angulo = Math.toRadians(angulo);
        }
        coordenadax = km * Math.cos(angulo);//cos
        coordenaday = km * Math.sin(angulo);//sin
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        if(angulo > 0 && angulo <= 360){
            this.angulo = Math.toRadians(angulo);
        }
    }

    public double getCoordenadax() {
        return coordenadax;
    }

   
    public double getCoordenaday() {
        return coordenaday;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
    
}
