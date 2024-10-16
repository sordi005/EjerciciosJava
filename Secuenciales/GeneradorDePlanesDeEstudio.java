import java.util.Scanner;
import java.util.Random;

public class GeneradorDePlanesDeEstudio {
    public static void main(String[] args) {
        // Crear un escáner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitar la cantidad de horas diarias disponibles para estudiar
        System.out.print("¿Cuántas horas al día puedes estudiar?: ");
        int horasPorDia = sc.nextInt();

        // Definir los días de la semana
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};

        // Definir las materias a estudiar
        String[] materias = {"Arq En Sistemas", "Matemática", "Org Empresarial", "Prog Lab", "Prog Python"};

        // Crear un generador de números aleatorios
        Random rand = new Random();

        System.out.println("\nPlan de estudio semanal:");

        // Para cada día de la semana
        for (String dia : diasSemana) {
            System.out.println("\n" + dia + ":");
            int horasRestantes = horasPorDia;

            // Distribuir las horas entre las materias
            while (horasRestantes > 0) {
                // Elegir una materia aleatoria
                String materia = materias[rand.nextInt(materias.length)];

                // Elegir cuántas horas dedicar a esa materia (máximo las horas restantes)
                int horasAsignadas = rand.nextInt(horasRestantes) + 1;

                // Mostrar la asignación
                System.out.println("- " + materia + ": " + horasAsignadas + " horas");

                // Restar las horas asignadas de las horas restantes
                horasRestantes -= horasAsignadas;
            }
        }

        // Cerrar el escáner
        sc.close();
    }
}
