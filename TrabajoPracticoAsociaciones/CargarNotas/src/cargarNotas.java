import java.util.ArrayList;
import java.util.Scanner;



public class cargarNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<>();

        System.out.println("¿Cuántos alumnos desea cargar?");
        int cantidadAlumnos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Ingrese el nombre completo del alumno:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el legajo del alumno:");
            long legajo = scanner.nextLong();
            scanner.nextLine(); // Consumir el salto de línea

            Alumno alumno = new Alumno(nombre, legajo);

            System.out.println("¿Cuántas notas desea cargar para " + nombre + "? (Debe ser al menos 1)");
            int cantidadNotas;
            do {
                cantidadNotas = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea
                if (cantidadNotas < 1) {
                    System.out.println("Debe ingresar al menos una nota. Intente nuevamente.");
                }
            } while (cantidadNotas < 1);

            for (int j = 0; j < cantidadNotas; j++) {
                System.out.println("Ingrese la materia de la nota " + (j + 1) + ":");
                String catedra = scanner.nextLine();

                System.out.println("Ingrese la nota del examen:");
                double notaExamen = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea

                Notas nota = new Notas(catedra, notaExamen);
                alumno.agregarNota(nota);
            }

            alumnos.add(alumno);
        }

        // Mostrar la información cargada
        System.out.println("\nInformación de los alumnos:");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
            System.out.println("Notas:");
            for (Notas nota : alumno.getNotas()) {
                System.out.println("  " + nota);
            }
        }

        scanner.close();
    }
}
