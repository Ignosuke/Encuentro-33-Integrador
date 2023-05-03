package Integrador.Servicios;

import java.util.ArrayList;
import java.util.Scanner;

import Integrador.Entidades.Estudiante;

public class EstudianteService {
    private Scanner leer = new Scanner(System.in);
    private ArrayList<Estudiante> e = new ArrayList<Estudiante>();
    private ArrayList<Estudiante> eMayorPromedio = new ArrayList<Estudiante>();
    private double promedio = 0;

    public void cargarEstudiantes() {
        System.out.print("Ingrese cantidad de estudiantes: ");
        int totalEstudiantes = leer.nextInt();
        System.out.println("\n-----------------------------------------\n");
        for (int i = 0; i < totalEstudiantes; i++) {
            System.out.println("Ingrese nombre del alumno " + (i+1));
            leer.nextLine();
            String nombre = leer.nextLine();
            System.out.println("Ingrese nota del alumno " + (i+1));
            double nota = leer.nextDouble();

            e.add(new Estudiante(nombre, nota));
            promedio += nota;
            System.out.println("\n-----------------------------------------\n");
        }
        promedio /= totalEstudiantes;
        System.out.println("El promedio de notas del curso es: " + promedio + "\n");
        promediosMayores();
    }

    public void promediosMayores() {
        for (int i = 0; i < e.size(); i++) {
            if (e.get(i).getNotaFinal() >= promedio) {
                eMayorPromedio.add(i, new Estudiante(e.get(i).getNombre(), e.get(i).getNotaFinal()));
            }
        }
    }

    public void mostrarPromediosMayores() {
        System.out.println("Los estudiantes con nota mayor al promedio son: \n");
        System.out.println(eMayorPromedio);
    }


}
