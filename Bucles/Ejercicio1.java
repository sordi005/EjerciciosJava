//Cálculo del tiempo dedicado a cada actividad
//Un alumno quiere medir el tiempo total que dedica a sus actividades académicas y personales durante el día.
//Instrucciones:
//Pide al usuario que ingrese las horas dedicadas a cada actividad: estudiar, hacer ejercicios, leer, y tiempo libre.
//Usa un bucle para registrar las horas y luego calcula el tiempo total dedicado.

import java.util.Scanner;

public class Ejercicio1 {

    public static Double calcularHorasDespierto(double horasDormido){
        int horasDia = 24;
        double horasDespieto = horasDia - horasDormido;

        return horasDespieto;
    }
    public  static Double calcularPorcentajeHorasDespierto(double horasDespieto){
        int horasDia = 24;
        double porcentajeHorasDespierto = (horasDespieto/horasDia)*100;
        return porcentajeHorasDespierto;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculo del tiempo dedicado a cada Actividad");
        System.out.println("""
                -----------------------------------------------------------------
                Como funciona: 
                ---------------
                -- Necesitamos saber cuantas horas promedio duerme.
                -- Calculamos el porcentaje que pasa despierto que pasa despierto.
                --  Con sus datos de Actividades calculamos el porcentaje.
                -----------------------------------------------------------------
                """);
        System.out.print("Cuantas horas promedio duerme: ");
        double horasDormido = sc.nextDouble();

        System.out.println("Ingresa las horas");
        System.out.print("Estudio: ");
        double horasEstudiando = sc.nextDouble();

        System.out.print("Ejercicio: ");
        double horasEjercicio = sc.nextDouble();



        System.out.print("Leer: ");
        double horasLeer = sc.nextDouble();

        System.out.print("Tiempo Libre: ");
        double horasLibre = sc.nextDouble();


        double horasDespierto =  calcularHorasDespierto(horasDormido);
        double porcentajeHorasDespieto = calcularPorcentajeHorasDespierto(horasDespierto);

        Double[] listaActividades = {horasEstudiando,horasEjercicio,horasLeer,horasLibre};
        Double totalDeHoras = 0.0;
        for (double actividad:listaActividades){
             totalDeHoras += actividad;
        }
        double porcentajeTotalDehorasActividades = (totalDeHoras/horasDespierto) * 100;

        System.out.println("----------------------------------------");
        System.out.println("Tiempo total:");
        System.out.printf("--Pasa %.0f horas promedio despierto al día%n", horasDespierto);
        System.out.printf("--Un %.1f%% de horas despierto al día%n", porcentajeHorasDespieto);
        System.out.println("----------------------------------------");
        System.out.printf("--Pasa %.0f horas promedio haciendo actividades al día%n", totalDeHoras);
        System.out.printf("--Pasa un %.1f%% de horas haciendo actividades cuando está despierto.%n", porcentajeTotalDehorasActividades);

    }





}
