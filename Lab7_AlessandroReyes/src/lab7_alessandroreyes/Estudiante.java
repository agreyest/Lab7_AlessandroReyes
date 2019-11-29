package lab7_alessandroreyes;

public class Estudiante {
    private String nombre;
    private int edad;
    private int cuenta;
    private Parada parada;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, int cuenta, Parada parada) {
        this.nombre = nombre;
        this.edad = edad;
        this.cuenta = cuenta;
        this.parada = parada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public Parada getParada() {
        return parada;
    }

    public void setParada(Parada parada) {
        this.parada = parada;
    }

    @Override
    public String toString() {
        return nombre + ", " + cuenta + ", " + parada;
    }
    
}
