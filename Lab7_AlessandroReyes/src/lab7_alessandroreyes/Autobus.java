package lab7_alessandroreyes;

import java.awt.Color;
import java.util.ArrayList;

public class Autobus {
    private int numid;
    private String placa;
    private Color color;
    private double velocidad;
    private ArrayList<Estudiante> estudiantes = new ArrayList();

    public Autobus() {
    
    }
    public Autobus(int numid, String placa, Color color, double velocidad) {
        this.numid = numid;
        this.placa = placa;
        this.color = color;
        this.velocidad = velocidad;
    }

    public int getNumid() {
        return numid;
    }

    public void setNumid(int numid) {
        this.numid = numid;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    public void setEstudiantes(Estudiante estudiantes) {
        this.estudiantes.add(estudiantes);
    }

    @Override
    public String toString() {
        return numid + ", color= " + color;
    }
    
}
