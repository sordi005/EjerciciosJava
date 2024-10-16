//Ejercicio 6: Evaluador de Hábitos Saludables
//Escribe un programa que pida al usuario cuántas horas al día duerme, cuántas horas al día hace
//ejercicio y cuántas comidas saludables consume al día. Luego, imprime una evaluación de sus
//hábitos saludables basada en estos datos.


import java.util.Scanner;

public class Ejercicio6 {
    public static String evaluarHabitos(double dormir, int ejercicio, int comida){
       double horasParaDormirRecomendadas = 7.45;
       int diasEjerciciosRecomendados = 3;
       int comidasPorDiasRecomendadas = 2;
       String resultado = "";
       if(dormir >= horasParaDormirRecomendadas && ejercicio >= diasEjerciciosRecomendados && comida >= comidasPorDiasRecomendadas ){
           resultado = "Exelente";
       } else if (dormir >= 6.30 && ejercicio >= 2 && comida>= 1) {
           resultado = "Bien";
       } else if (dormir >= 6 && ejercicio >= 1 && comida >= 1) {
           resultado = "Medio";
       } else if (dormir<6 && ejercicio< 1 && comida< 1) {
           resultado = "Bajo";
       }
        return resultado;

    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("""
        Evaluador de Hábitos Saludables
              Medidas:
                -Bajo.
                -Medio.
                -Bien.
                -Exelente.
        """);
        System.out.print("Ingresa cuantas horas durmes promedio:");
        double horasDormirIngresado = sc.nextDouble();
        System.out.print("Ingresa cuuantos dias a la semana haces ejercicios:");
        int diasEjercicosIngresado = sc.nextInt();
        System.out.print("Ingresa cuuantas comidas saludables comes al día:");
        int comidasIngresado = sc.nextInt();

        System.out.println("--------------------------------------------");
        String resultado = evaluarHabitos(horasDormirIngresado,diasEjercicosIngresado,comidasIngresado);
        System.out.println("Tu condicion es : "+resultado);
        System.out.println("--------------------------------------------");
        System.out.println("Recomendaciones: ");
        if (resultado != "Exelente") {
            if (horasDormirIngresado < 7.45) {
                System.out.println("-Dormir entre 7 a 8 horas.");
            }
            if (diasEjercicosIngresado < 2) {
                System.out.println("-Hacer mínimo 2 veces ejercicio por semana.");
            }
            if (comidasIngresado < 2) {
                System.out.println("-Comer saludable minimo 1 vez al dia");
            }
        }else {System.out.println("Nada que recomendar...");}


    }


}
