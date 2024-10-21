// Ejercicio 2: Generar reportes de inventario
// Una tienda de electrónica necesita un informe del inventario,
// mostrando los productos que tienen menos de 5 unidades en stock.
// **Instrucciones**:
//- Crea un arreglo `productos` que almacene los nombres de los productos y otro arreglo `stocks` que
//  almacene la cantidad de stock de cada producto.
//- Escribe una función `generarReporteBajoStock` que imprima los productos con menos de 5 unidades.

import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicio2{

    public static void comprobrarProductos(ArrayList<String>nombres, ArrayList<Integer>cantidad){
        int contador = 0;

        if (nombres.isEmpty()) {
            System.out.println("Todavia no se agrega ningún producto al inventario");
        }else {
            System.out.println("Es necesario Realizar nuevos pedidos de los productos:");
            System.out.println("Productos | Unidades");

            for (int i = 0; i < nombres.size(); i++) {

                if (cantidad.get(i) < 5) {
                    System.out.println("- Producto: " + nombres.get(i) + " | -Unidades: " + cantidad.get(i));

                } else {
                    contador += 1;
                }
                if (contador == nombres.size()) {
                    System.out.println("Tienes todos los productos con mas de 5 unidades ");

                }
            }
        }

    }

    public static void mostrarInventario (ArrayList<String> listaNombres, ArrayList<Integer> listaCantidad){
        Scanner sc = new Scanner(System.in);
        if (listaNombres.isEmpty()){
            System.out.println("Todavia no se agrega ningún producto al inventario");
        }else {
            System.out.println(" Inventario ");
            System.out.println("""
                    Producto    |    Unidades """);
            for(int i = 0; i < listaNombres.size(); i++){
                System.out.println("-----------------------------------");
                System.out.println("- Producto: "+listaNombres.get(i));
                System.out.println("- Unidades: "+listaCantidad.get(i));
            }
        }
        System.out.println("-----------------------------------");

        System.out.print("Presion 1 Si desea volver al menu: ");
        while (true) {
            int opcion = sc.nextInt();
            if (opcion == 1){
                break;
            }
        }
    }

    public static String ingresarNombres (){
        String producto;
        Scanner sc = new Scanner(System.in);
        System.out.print("Producto: ");
        producto = sc.nextLine();
        return producto;
    }
    public static Integer ingresarCantidadUnidades (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad De Unidades: ");
        int unidades = sc.nextInt();
        return unidades;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcionIngresada = 5;
        ArrayList<String> listaNombreProductos = new ArrayList<>();
        ArrayList<Integer> listaCantidadUnidades = new ArrayList<>();
        String nombreProducto;
        int unidades;
        while(opcionIngresada != 0){

            System.out.println("""
                    -----------------------
                    Control De Inventario""");
            System.out.println("""
                -----------------------
                1) -- Ingresa Los productos.
                2) -- Ver Inventario.
                3) -- Recomendación.
                0) -- Salir.  
                -----------------------
                """);

            while (true) {

                System.out.print("Opcion: ");
                opcionIngresada = sc.nextInt();

                if (opcionIngresada >= 0 && opcionIngresada < 4) {
                    if (opcionIngresada == 1) {
                        System.out.print("Cuantos productos vas a ingresar: ");
                        int cantDeProductos = sc.nextInt();
                        System.out.println("Ingrea los Productos y la cantidad De unidades");
                        for (int i = 0; i < cantDeProductos; i++) {
                            nombreProducto = ingresarNombres();
                            listaNombreProductos.add(nombreProducto);
                            unidades = ingresarCantidadUnidades();
                            listaCantidadUnidades.add(unidades);
                        }
                        System.out.println("Productos Guardados Correctamente");
                        while (true) {
                            System.out.print("Presion 1 Si desea volver al menu: ");
                            int opcion = sc.nextInt();
                            if (opcion == 1){
                                break;
                            }}
                        break;
                    } else if(opcionIngresada == 2){
                        mostrarInventario(listaNombreProductos,listaCantidadUnidades);
                        break;
                    }else if (opcionIngresada == 3) {
                        comprobrarProductos(listaNombreProductos,listaCantidadUnidades);
                        System.out.print("Presion 1 Si desea volver al menu: ");
                        while (true) {
                            int opcion = sc.nextInt();
                            if (opcion == 1){
                                break;
                            }}break;
                    }else {
                        opcionIngresada = 0;
                        break;
                    }

                } else {
                    System.out.println("Opcion Incorrecta, Ingresala de nuevo");
                }
            }
        }
    }
}
