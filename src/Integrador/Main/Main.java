package Integrador.Main;

import Integrador.Servicios.EstudianteService;

public class Main {
    public static void main(String[] args) {
        EstudianteService es = new EstudianteService();
        es.cargarEstudiantes();
        es.mostrarPromediosMayores();
    }
}
