// Ejercicio 6: Cálculo de impuestos
//Una pequeña empresa debe calcular el impuesto de venta para cada una de las facturas emitidas.
//
//**Instrucciones**:
//- Crea un arreglo `facturas` con los montos de las facturas de los clientes.
//- Escribe una función `calcularImpuesto` que aplique un 21% de impuesto a cada factura.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {

    public static void calcularImpuesto(ArrayList<Double>lista){

        double facturaCalculada;

        System.out.println("-----------------------------------");
        System.out.println("Facturas con impuestos Agregados");
        System.out.println("-----------------------------------");
        for (int i= 0; i< lista.size(); i++){

            facturaCalculada = lista.get(i) * 0.21 + lista.get(i);

            System.out.println("Cliente "+(i+1)+":");
            System.out.printf("--Factura: $%.1f%n",facturaCalculada);
            System.out.println("-----------------------------------");


        }


    }


    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

       //variables
        double montoFactura;
        int cantClientes;
        //lista
        ArrayList<Double> listaFacturas = new ArrayList<>();
        System.out.println("-----------------------------------");
        System.out.println("        Cálculo De impuestos       ");
        System.out.println("-----------------------------------");
        System.out.print("Cantidad de Facturas: ");
        cantClientes = sc.nextInt();

        for (int i = 0; i<cantClientes; i++){
            System.out.println("Cliente "+(i+1)+": ");
            System.out.print("Factura: ");
            montoFactura = sc.nextDouble();

            listaFacturas.add(montoFactura);

        }
        calcularImpuesto(listaFacturas);
    }

}
