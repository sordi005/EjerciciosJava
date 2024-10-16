//Ejercicio 5: Juego de Piedra, Papel o Tijera
//Escribe un programa que pida al usuario que elija entre piedra, papel o tijera. Luego, el programa
//elige una opción al azar y determina quién gana. Imprime el resultado del juego.


import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

    public static boolean comprobarSiusuarioGano(String usuario,String maquina){
        String piedra = "Piedra";
        String papel = "Papel";
        String tijera = "Tijera";
        boolean ganoPunto = false;

        if (usuario == papel && maquina == piedra){
            ganoPunto = true;
        } else if (usuario == piedra && maquina == tijera) {
            ganoPunto = true;
        } else if (usuario == tijera && maquina == papel) {
            ganoPunto = true;

        }
        return ganoPunto;


    }



    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //Instancia de clase Random
        Random random = new Random();

        String[] variantesDejuego = {"Piedra","Papel","Tijera"};
        int puntosUsuario= 0;
        int puntosMaquina = 0;
        int opcion;
        String opcionElegida = "";
        System.out.println("Piedra,Papel o Tijera");
        System.out.println("1-Piedra // 2-Papel // 3-Tijera ");
        System.out.println("Ingresa el numero de lo que quieres elegir:");
        System.out.println("Comienza el Juego..");
        do {
            do {
                System.out.print("TU: ");
                opcion = sc.nextInt();
                if (opcion < 1 || opcion > 3){
                    System.out.println("Ingrese una opción Correcta");
                }
            }while (opcion < 1 || opcion > 3);
            if (opcion == 1){
                 opcionElegida = "Piedra";
            } else if (opcion == 2) {
                opcionElegida = "Papel";
            } else  {
                opcionElegida = "Tijera";
            }

            int elementoRandom = random.nextInt(variantesDejuego.length);
            String opcionRandom = variantesDejuego[elementoRandom];

            System.out.println("Maquina: "+ opcionRandom);
            boolean ganoUsuario = comprobarSiusuarioGano(opcionElegida,opcionRandom);

            if (opcionElegida != opcionRandom){
                if (ganoUsuario){
                    puntosUsuario +=1;
                    System.out.println("Punto para ti");
                }  else {
                    System.out.println("Punto para la máquina.");
                    puntosMaquina += 1;
                }
            }else{
                System.out.println("Empate");
            }

            System.out.println("------------------------------");
            System.out.println("Puntos"  );
            System.out.println("Usuario :"+puntosUsuario);
            System.out.println("Maquina :"+ puntosMaquina);
            System.out.println("------------------------------");
            if (puntosUsuario == 3){
                System.out.println("GANASTE :)");
            }else if (puntosMaquina == 3){
                System.out.println("Perdite :( ");
            }
        }while(puntosUsuario < 3 && puntosMaquina < 3);


    }
}
