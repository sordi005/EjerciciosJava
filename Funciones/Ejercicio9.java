//Ejercicio 9: Calcular el precio final con descuentos
//Una empresa quiere calcular el precio final de sus productos después de aplicar un descuento general del 10%.

//**Instrucciones**:
//- Crea un arreglo `preciosOriginales` que almacene el precio original de varios productos.
//- Escribe una función `calcularPrecioFinal` que aplique el descuento a cada producto y devuelva el precio final.

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio9 {

    public static void calcularPrecioFinal (ArrayList<Integer>id,ArrayList<Double>precios){

        double descuento = 0.10;

        System.out.println("--------------------------------------------");
        System.out.println("Productos Calculados con el 10% de Descuento");
        System.out.println("--------------------------------------------");
        for (int i = 0; i< id.size();i++){
            System.out.println("PRODUCTO:");
            System.out.println("ID = "+ id.get(i));
            System.out.println("Precio Final: "+ (  precios.get(i)-precios.get(i)*descuento));
            System.out.println("--------------------------------------------");



        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Variables
        int cantidad;
        int idProducto;
        double precioProducto;

        //listas
        ArrayList<Integer> listaIdProdcutos = new ArrayList<>();
        ArrayList<Double> listaPrecioProdcutos = new ArrayList<>();


        System.out.println("-----------------------------------------");
        System.out.println("            CALCULAR DESCUENTOS          ");
        System.out.println("-----------------------------------------");
        System.out.println("Debe Ingresar: ");
        System.out.println("-----------------------------------------");
        System.out.println("-- Cantidad de Productos");
        System.out.println("-- Id del Prodcutos ");
        System.out.println("-- Precio del producto ");
        System.out.println("-----------------------------------------");
        System.out.print("Cantidad de Productos: ");
        cantidad = sc.nextInt();
        System.out.println("-----------------------------------------");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("PRODUCTO: ");
            System.out.print("Id: ");
            idProducto = sc.nextInt();
            System.out.print("Precio: ");
            precioProducto = sc.nextDouble();
            System.out.println("-----------------------------------------");
            listaIdProdcutos.add(idProducto);
            listaPrecioProdcutos.add(precioProducto);
        }
        calcularPrecioFinal(listaIdProdcutos,listaPrecioProdcutos);
    }
}