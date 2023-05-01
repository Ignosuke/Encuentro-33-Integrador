package Servicios;

import java.util.Arrays;
import java.util.Scanner;

import Entidades.Empleado;

public class EmpleadoService {
    private Scanner leer = new Scanner(System.in);
    private Empleado[] empleados = new Empleado[6]; 
    private String[] salarioMayor;
    private double promedio;

    public void cargarEmpleados() {
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("\nIngrese nombre del empleado " + (i+1));
            String nombre = leer.nextLine();
            System.out.println("Ingrese su salario");
            System.out.print("$");
            double salario = leer.nextDouble();
            leer.nextLine();
            empleados[i] = new Empleado(nombre, salario);
            System.out.println("\n====================================");
        }
        promedio = salarioPromedio();
        System.out.println("\nEl salario promedio de todos los empleados es: $" + promedio);
    }

    public double salarioPromedio() {
        double suma = 0;
        for (int i = 0; i < empleados.length; i++) {
            suma += empleados[i].getSalario();
        }
        return suma/empleados.length;
    }

    public void salariosMayores() {
        int mayores = 0;
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].getSalario() >= promedio) {
                mayores++;
            }
        }
        salarioMayor = new String[mayores];
        for (int i = 0; i < salarioMayor.length; i++) {
            salarioMayor[i] = empleados[i].getNombre();
        }
        System.out.println("\nLos empleados con salarios mayores al promedio son: " + Arrays.toString(salarioMayor));
    }
}
