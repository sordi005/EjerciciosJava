//Ejercicio 4: Generador de Listas de Reproducción
//Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
//genere una lista de reproducción con canciones sugeridas para ese estado de ánimo.

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class GeneradorDeListasDeReproduccion {
    public static ArrayList<String> listaDeCanciones(int opcion){

        ArrayList<String> listaFeliz = new ArrayList<>(Arrays.asList(
                "Happy - Pharrell Williams","Walking on Sunshine - Katrina and the Waves","Good Vibrations - The Beach Boys",
                "Uptown Funk - Mark Ronson ft. Bruno Mars","Can't Stop the Feeling! - Justin Timberlake"));

        ArrayList<String> listaTriste = new ArrayList<>(Arrays.asList(
                "Happy - Pharrell Williams", "Walking on Sunshine - Katrina and the Waves", "Good Vibrations - The Beach Boys",
                "Uptown Funk - Mark Ronson ft. Bruno Mars", "Can't Stop the Feeling! - Justin Timberlake"));

        ArrayList<String> listaEnergetico = new ArrayList<>(Arrays.asList(
                "Eye of the Tiger - Survivor", "Can't Hold Us - Macklemore & Ryan Lewis", "Lose Yourself - Eminem",
                "Stronger - Kanye West", "Titanium - David Guetta ft. Sia"));

        ArrayList<String> listaRelajado = new ArrayList<>(Arrays.asList(
                "Weightless - Marconi Union", "Sunset Lover - Petit Biscuit", "Banana Pancakes - Jack Johnson",
                "Breathe Me - Sia", "River Flows in You - Yiruma"));

        if (opcion == 1 ){
            return listaFeliz;
        } else if (opcion == 2 ) {
            return listaTriste;

        } else if (opcion == 3 ) {
            return listaEnergetico;

        } else if (opcion == 4 ) {
            return listaRelajado;

        }
        else {
            return new ArrayList<>();
        }
    }



    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("""
Estados de ánimo: 
1 - Feliz
2 - Triste
3 - Energético
4 - Relajado

""");
        System.out.print("Ingrese una opcion: ");
        int opcionIngresada = scanner.nextInt();
        if (opcionIngresada > 0 && opcionIngresada < 5){
            ArrayList<String> listaDeCanciones = listaDeCanciones(opcionIngresada);
            int contador = 1;
            for(String cancion : listaDeCanciones){
                System.out.print(contador +")_"+cancion+"\n");
                contador += 1 ;
            }
        }

    }
}
