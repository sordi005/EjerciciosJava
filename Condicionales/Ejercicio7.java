//Ejercicio 7: Sistema de Recomendación de Actividades
//Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
//recomiende una actividad basada en su estado de ánimo

import java.util.Scanner;

public class Ejercicio7 {

    public static String conseguirNombreEstado(int opcion){
        String feliz = "Feliz";
        String triste = "Triste";
        String energetico = "Energético";
        String relajado = "Relajado";
        String estadoDeAnimo;

        if (opcion == 1) {
            estadoDeAnimo = feliz;
        }else if (opcion == 2) {
            estadoDeAnimo = triste;
        }else if (opcion ==3 ){
            estadoDeAnimo = energetico;
        }else {
            estadoDeAnimo = relajado;
        }
        return estadoDeAnimo;
    }


    public static String[] listaDeACtividades(int opcion){
        String[] feliz = {"Salir a caminar", "Escuchar música alegre", "Pasar tiempo con amigos",
                "Hacer una actividad creativa", "Cocinar algo delicioso"};

        String[] triste = {"Ver una película triste", "Escribir en un diario", "Hablar con un amigo",
                "Escuchar música relajante", "Tomar un baño caliente"};

        String[] relajado = {"Leer un libro", "Hacer yoga", "Meditar", "Tomar una siesta", "Pasear por la naturaleza"};

        String[] energetico = {"Hacer ejercicio", "Bailar", "Jugar un deporte",
                "Salir a correr", "Participar en una actividad al aire libre"};

        String[] devolver = {};

        switch (opcion){
            case 1:
                devolver = feliz;
            case 2:
                devolver = triste;
            case 3:
                devolver = energetico;
            case 4:
                devolver = relajado;
        }
        return devolver;
    }

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int opcion;

        System.out.println("Sistema de Recomendación de Actividades");
        System.out.println("""
                Estados de Ánimo
                1)_Feliz.
                2)_Triste.
                3)_Energético.
                4)_Relajado.
                """);
        do {
            System.out.print("Ingresa el número de tu estado de animo: ");
            opcion = sc.nextInt();
            if (opcion < 1 || opcion > 4){
                System.out.println("Valor Incorrecto");
            }
        }while(opcion < 1 || opcion > 4);


        String[] listaActividades = listaDeACtividades(opcion);
        String estadoDeAnimo = conseguirNombreEstado(opcion);

        System.out.println("Actividades que puedes hacer estando "+estadoDeAnimo );
        for (String actividad: listaActividades){
            System.out.println("-"+actividad);
        }

    }
}
