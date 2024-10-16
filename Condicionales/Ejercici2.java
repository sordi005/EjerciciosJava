//Ejercicio 2: Calculadora de Descuentos
//Escribe un programa que pida al usuario el precio de un producto y la categoría del cliente
//(estudiante, adulto, jubilado). Aplica un descuento del 10% para estudiantes, 5% para adultos y
//15% para jubilados. Imprime el precio final después del descuento.

import java.util.Scanner;

public class Ejercici2 {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print(
                """
                Ingrese su categoria
                1)_Estudiante.
                2)_Adulto.
                3)_Jubilado.
                
                Ingrese la Opcion: 
                """);

        int opcionCategoria = scanner.nextInt();

        System.out.println("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextFloat();

        double descuento1 = ( precioProducto - precioProducto * 0.10  );
        double descuento2 = ( precioProducto -(precioProducto * 0.05) );
        double descuento3 = ( precioProducto -precioProducto * 0.15 );
        double descuentoFinal = 0;
        String categoria = "";

        switch (opcionCategoria){
            case  1:
                descuentoFinal = descuento1;
                categoria = "Estudiantes";
            case 2:
                descuentoFinal = descuento2;
                categoria = "Adultos";
            case  3:
                descuentoFinal = descuento3;
                categoria = "Jubilados";

        }

        System.out.println("Descuento para "+categoria+"// Precio Final = $" + descuentoFinal);

    }

}
