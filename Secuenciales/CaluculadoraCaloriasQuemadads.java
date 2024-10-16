//Ejercicio 2: Calculadora de Calorías Quemadas
//Escribe un programa que pida al usuario su peso en kilogramos, la duración del ejercicio en
//minutos y el tipo de ejercicio (correr, nadar, andar en bicicleta), y luego calcule e imprima las
//calorías quemadas. Utiliza diferentes tasas de calorías quemadas por minuto para cada tipo de
//ejercicio.

import java.util.Scanner;

public class CaluculadoraCaloriasQuemadads {

    public static double calcular(int opcion,double kg, double min){
        double metCorrer = 8.3;
        double metNadar =  7.0;
        double metBicicleta = 6.8;
        double minutosAhoras = min/60;
        double caloriasQuemadas = 0;

        if (opcion == 1){
            caloriasQuemadas = metCorrer * kg * minutosAhoras;

        }
        else if (opcion == 2) {
            caloriasQuemadas = metNadar * kg * minutosAhoras;
        }
        else {
            caloriasQuemadas = metBicicleta * kg * minutosAhoras;

        }
        return caloriasQuemadas;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese sus Kilogrmamos ");
        float kgIngresados = scanner.nextFloat();
        System.out.print(
                """
                Ingrese el Ejercicio: 
                
                1)_Correr 
                
                2)_Nadar
              
                3)_Bicicleta
                
                --Ejercicio: 
                """);

        int opcionIngresada = scanner.nextInt();

        System.out.print("Ingrese los minutos trabajados: ");
        double minutos = scanner.nextDouble();

        double caloriasQuemadas = 0;

        if (opcionIngresada == 1 || opcionIngresada == 2 || opcionIngresada ==3){
             caloriasQuemadas = calcular(opcionIngresada,kgIngresados,minutos);
        }else {
            System.out.print("Opcion Incorrecta");

        }

        System.out.print("Calorias Quemadas: "+caloriasQuemadas);
    }


}
