// Ejercicio 1: Cálculo de ingresos mensuales
//n arreglo. Una pequeña tienda registra sus ventas diarias en uSe necesita escribir una función que use un bucle para calcular los ingresos totales mensuales.
//**Instrucciones**:
//- Crea un arreglo `ventas` que almacene las ventas diarias de una tienda durante 30 días.
//- Escribe una función `calcularIngresosMensuales` que recorra el arreglo y sume las ventas.
//- Imprime el total de ingresos mensuales.


import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

    public  static Integer calculosIngresosMensuales(ArrayList<Integer>listaVentas){
        int ventasTotales = 0;

        for(int venta: listaVentas){
            ventasTotales += venta;
        }
        return ventasTotales;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Variables
        int opcionIngresar ;
        ArrayList<Integer> listaVentadDiarias = new ArrayList<>();
        int cantDias;
        int ventaTotalDia;
        int ventasTotalesDelMes;

        System.out.println("----------------------------------------------");
        System.out.print("""
        Calcular Ingresos Mensuales
        1)_ Ingresar ventas diarias de los ultimos 30 dias.
        ----------------------------------------------
        -- Ingrese el numero 1 para Comenzar: """);


        while (true) {
            opcionIngresar = sc.nextInt();
            if (opcionIngresar == 1 ){
                break;
            }else {
                System.out.print("Opcion Invalida");
            }
        }
        System.out.println("----------------------------------------------");
        System.out.println("Cantidad de dias: ");
        System.out.print("Dias: ");
        cantDias = sc.nextInt();
        System.out.println("----------------------------------------------");

        System.out.println("Ingresa las ventas diarias");
        for (int i = 0; i < cantDias; i++) {
            System.out.print("Venta total del dia "+(i+1) + ":");
            ventaTotalDia = sc.nextInt();
            listaVentadDiarias.add(ventaTotalDia);

        }
        System.out.println("----------------------------------------------");
        ventasTotalesDelMes = calculosIngresosMensuales(listaVentadDiarias);

        System.out.println("Ingresos totales del mes: $"+ventasTotalesDelMes);
        System.out.println("----------------------------------------------");
    }
}