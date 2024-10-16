//Ejercicio 3: Sistema de Recomendación de Libros
//Escribe un programa que pida al usuario su género de libro favorito (fantasía, misterio, romance,
//ciencia ficción) y luego recomiende un libro basado en su elección.


import java.util.Scanner;
public class Ejercicio3 {



    public static String[] obtenerListaDelibros(int opcion) {
        String[] libros = {};
        String[] fantasia = {"The Hobbit by J.R.R. Tolkien", "Harry Potter and the Sorcerer's Stone by J.K. Rowling",
                "The Name of the Wind by Patrick Rothfuss", "A Game of Thrones by George R.R. Martin", "Mistborn: The Final Empire by Brandon Sanderson"};

        String[] misterio = {"The Girl with the Dragon Tattoo by Stieg Larsson", "Gone Girl by Gillian Flynn",
                "Sherlock Holmes: The Complete Novels and Stories by Arthur Conan Doyle", "The Da Vinci Code by Dan Brown", "Big Little Lies by Liane Moriarty"};

        String[] romance = {"Pride and Prejudice by Jane Austen", "The Notebook by Nicholas Sparks",
                "Outlander by Diana Gabaldon", "Me Before You by Jojo Moyes", "The Fault in Our Stars by John Green"};

        String[] cienciaFiccion = {"Dune by Frank Herbert", "Ender's Game by Orson Scott Card",
                "The War of the Worlds by H.G. Wells", "Neuromancer by William Gibson", "Snow Crash by Neal Stephenson"};

        switch (opcion){
            case 1:
                libros = fantasia;
            case  2 :
                libros = misterio;
            case 3:
                libros = romance;
            case 4:
                libros = cienciaFiccion;

        }

        return libros;

    }


    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        String[] nombreGeneros = {"Fantasía","Misterio","Romance","Ciencia ficción"};

        System.out.println(
        """
        Sistema de Recomendación de Libros
        
        Generos:
         
            1)_Fantasía.
            2)_Misterio.
            3)_Romance.
            4)_Ciencia Ficción.
        
        Ingrese un genero:     
        """);
        int opcionIngresada = scanner.nextInt();
        String[] libros = obtenerListaDelibros(opcionIngresada);
        if (opcionIngresada > 0 && opcionIngresada <  5){
            System.out.println("Libros del género "+nombreGeneros[opcionIngresada-1]);
            for(String libro : libros){
                System.out.println("-"+ libro);
            }

        }
        else{
            System.out.println("Error.No ingreso un valor correcto.");
        }

    }


}
