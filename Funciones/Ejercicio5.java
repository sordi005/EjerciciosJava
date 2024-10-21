// Ejercicio 5: Promedio de satisfacción del cliente
//Una empresa desea conocer el promedio de satisfacción de sus clientes basado en encuestas de calificación de 1 a 5.
//**Instrucciones**:
//- Crea un arreglo `calificaciones` con las puntua los clienteciones de satisfacción des.
//- Escribe una función `calcularPromedioSatisfaccion` que recorra el arreglo y calcule el promedio de satisfacción.

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

    public static Double calcularPromedio(ArrayList<Integer>nivelesElegidos){
        int contador = 0;
        int total = nivelesElegidos.size();
        double resultado;

        for(int i = 0; i<nivelesElegidos.size(); i++){
            contador += nivelesElegidos.get(i);}
        resultado = contador / total;
        return  resultado;
    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        //variables
        int cantClientes;
        String nombre;
        int nivel;

        //listas
        ArrayList<Integer>nivelSatisaccion = new ArrayList<>();

        System.out.print(
                """
                -----------------------------------------------
                ----- Promedio De Satisfacción Del Cliente ----
                -----------------------------------------------
                1_ Ingrese Cantidad De EMPLEADOS. 
                2_ Ingrese el nivel de satisfacción de cada Cliente(En un nivel de 1 a 5). 
                -----------------------------------------------
                -- Cantidad De Empleados : """);

        cantClientes = sc.nextInt();

        System.out.println("---------------------------------");
        System.out.println("Ingrese Nivel de Satisfacción");
        for(int i = 0; i<cantClientes;i++){
            System.out.println("Cliente"+(i+1));

            System.out.print("Nivel de Satisfacción(1-5): ");
            nivel = sc.nextInt();

            System.out.println("---------------------------------");

            nivelSatisaccion.add(nivel);
        }
        Double promedioSatisfaccion = calcularPromedio(nivelSatisaccion);
        System.out.println("Promedio De Satisfacción = "+ promedioSatisfaccion);

    }

}
