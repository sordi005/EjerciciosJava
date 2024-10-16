//Ejercicio 4: Calculadora de IMC con Recomendaciones
//Escribe un programa que pida al usuario su peso en kilogramos y su altura en metros, y luego
//calcule su Índice de Masa Corporal (IMC). Imprime una recomendación basada en el IMC (bajo
//peso, peso normal, sobrepeso, obesidad)

import java.util.Scanner;

public class Ejercicio4 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pesoBajo = 18.5;
        double pesoNormal = 24.9;
        double sobrePeso = 29.9;


        System.out.print(
                """
                Calculadora de IMC de Calculadora
                ---------------------------------
                1)_Ingresa tu peso en Kg.
                2)_Ingresa tu altura en Metros.
                ---------------------------------                        
                -Peso:""");
        double pesoIngresado = sc.nextDouble();
        System.out.println("-Altura: ");
        double alturaIngresada = sc.nextDouble();

        double imc = pesoIngresado / (alturaIngresada * alturaIngresada);
        System.out.printf("\nSu IMC: %.2f\n", imc);
            System.out.println("Calificacón:");
        if (imc < pesoBajo) {
            System.out.print(" -Peso Bajo");
        } else if (imc < pesoNormal) {
            System.out.println("-Peso Normal");
        } else if (imc < sobrePeso) {
            System.out.println("-Sobre Peso");
        }else {System.out.println("-Obesidad");}
}
}