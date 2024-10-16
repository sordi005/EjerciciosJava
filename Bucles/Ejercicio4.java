//Ejercicio 4: Registro de ventas diarias
//Una tienda desea registrar las ventas realizadas cada día durante una semana.
// El programa debe calcular el total de ventas al final de la semana.
//Instrucciones:
//Usa un bucle para registrar las ventas diarias durante 7 días.
//Al final del bucle, muestra el total de ventas de la semana.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empezar;
        int contador = 0;
        int ventas;
        ArrayList<String> listaDias = new ArrayList<>(Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sabado", "Domingo"));
        System.out.print("""
                ------------------------------------
                    Sistema De Registros De Ventas
                ------------------------------------
                -Debe ingresa las Ventas diaras.
                -- Ingrese el número 1 para ingresar:
                """);
        while (true) {
            empezar = sc.nextInt();
            if (empezar == 1) {
                for (String dia : listaDias) {
                    System.out.print(dia + ":");
                    ventas = sc.nextInt();
                    contador += ventas;}
                break;}}
        System.out.println("Ventas Totales = "+contador);
    }
}

