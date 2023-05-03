package Integrador.Entidades;

public class Estudiante {
    private String nombre;
    private double notaFinal;
    
    public Estudiante() {
    }

    public Estudiante(String nombre, double notaFinal) {
        this.nombre = nombre;
        this.notaFinal = notaFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return "[" + nombre + ", " + notaFinal + "]";
    }    
}
