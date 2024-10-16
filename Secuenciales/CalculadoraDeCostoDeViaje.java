//Ejercicio 5: Calculadora de Costo de Viaje
//Escribe un programa que pida al usuario la distancia del viaje en kilómetros, el consumo de
//combustible del vehículo en litros por kilómetro y el precio del combustible por litro, y luego
//calcule e imprima el costo total del viaje.

import java.util.Scanner;



public  class  CalculadoraDeCostoDeViaje {

    public static double calcularCosto(double kl, double litros, double precio){
        double costoTotal = kl*litros*precio;
        return  costoTotal;
    }

    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Costo De Viaje\n");

        System.out.print(""" 
            ----------Debe Ingresar:---------- 
            - Distancia del viaje en kilometro.
            - Consumo de combustible del vehículo en litros X Kilometros.
            - Precio del cumbustible x Litro.\n""");


        System.out.print("kilometros:\n");
        double distanciaIngresada = scanner.nextFloat();

        System.out.print("Consumo de conbustible:\n");
        double consumoCombustible = scanner.nextFloat();

        System.out.print("Precio de combustible:\n");
        double combustibleXlitro = scanner.nextDouble();
        double costoTotal = calcularCosto(distanciaIngresada,consumoCombustible,combustibleXlitro);
        System.out.print("Costo total del viaje: "+costoTotal);


    }
}
