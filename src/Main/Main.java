package Main;

import Servicios.EmpleadoService;

public class Main {
    public static void main(String[] args) {
        EmpleadoService es = new EmpleadoService();
        es.cargarEmpleados();
        es.salariosMayores();
    }
}
