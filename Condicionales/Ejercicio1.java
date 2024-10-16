//Ejercicio 1: Sistema de Recomendación de Películas
//Escribe un programa que pida al usuario su género de película favorito (acción, comedia, drama,
//ciencia ficción) y luego recomiende una película basada en su elección.

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
public class Ejercicio1 {
    public static String[] listasDePelículas(int opcion){
        String[] accion = {"Mad Max: Fury Road", "John Wick", "Die Hard", "Gladiator",
            "The Dark Knight", "Inception", "The Avengers", "Mission: Impossible – Fallout", "Furious 7", "Black Panther"};

        String[] comedia = {"Superbad", "Groundhog Day", "Bridesmaids", "The Hangover",
            "Mean Girls", "Step Brothers", "Crazy, Stupid, Love.", "Hot Fuzz", "The 40-Year-Old Virgin", "Palm Springs"};

        String[] drama = {"The Shawshank Redemption", "Forrest Gump", "Parasite", "The Godfather",
            "Fight Club", "12 Years a Slave", "A Beautiful Mind", "The Pursuit of Happyness", "Moonlight", "The Social Network"};

        String[] cienciaFiccion = {"Blade Runner 2049", "Interstellar", "The Matrix", "Inception",
            "Ex Machina", "Arrival", "Star Wars: Episode IV - A New Hope", "Eternal Sunshine of the Spotless Mind",
            "District 9", "The Fifth Element"};

        String[] generoElegido = null;

        switch (opcion){
            case 1:
             generoElegido = accion;
             break;
            case 2:
                generoElegido = comedia;
             break;
            case 3:
                generoElegido = drama;
                break;
            case 4:
                generoElegido = cienciaFiccion;
                break;
            default:
                System.out.println("Valor incorrecto");
                return new String[0];
    }

        return generoElegido;

}

    public static String nombreDeGenero(int opcion){

        String nombreElegido;

        switch (opcion){
            case 1:
                nombreElegido = "Acción";
                break;
            case 2:
                nombreElegido = "Comedia";
                break;
            case 3:
                nombreElegido = "Drama";
                break;
            case 4:
                nombreElegido = "Ciencia Ficción";
                break;
            default:
                System.out.println("Valor incorrecto");
                return nombreElegido = "";


        }
        return nombreElegido;
    }


    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Generos
                   1_ Acción.
                   2_Comedia.
                   3_Drama
                   4_Cinencia Ficción
                   Ingresa Un Género:
                """);
        int opcion = scanner.nextInt();

        String[] listaPeliculas = listasDePelículas(opcion);
        String nombre = nombreDeGenero(opcion);
        System.out.println("Peliculas recomendadas del genero: "+nombre);
        for(String pelicula:listaPeliculas){
            System.out.println("-"+pelicula);
        }

    }

}
