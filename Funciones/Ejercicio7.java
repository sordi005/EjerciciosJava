// Ejercicio 7: Descuento por compras grandes
//Una tienda de ropa ofrece un 15% de descuento a las compras superiores a $500.
//**Instrucciones**:
//- Crea un arreglo `compras` que almacene los montos de las compras de los clientes.
//- Escribe una función `aplicarDescuento` que aplique el descuento a las compras que superen los $500.

import java.util.ArrayList;

import java.util.Scanner;

public class Ejercicio7 {

    public static void aplicarDescuento(ArrayList<Integer>id,ArrayList<Double>monto){
        double descuento = 0.15;

        System.out.println("-----------------------------------------------");
        System.out.println("Aplicar Descuento a montos superiores a $500");
        System.out.println("-----------------------------------------------");
        System.out.println("Descuento aplicado: ");
        for (int i = 0; i< id.size();i++){
            if (monto.get(i)>= 500){

                double valor = monto.get(i);
                System.out.println("ID: "+id.get(i));
                System.out.print("Monto: "+ (valor-(valor* descuento) ));
            }
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        //variables
        int cantidad;
        int id;
        double monto;

        //listas
        ArrayList<Integer>listaId = new ArrayList<>();
        ArrayList<Double>listaMontos = new ArrayList<>();

        System.out.println("------------------------------");
        System.out.println("      Calcular Descuentos     ");
        System.out.println("------------------------------");

        System.out.println("Ingrese: ");
        System.out.println("_ Id de compra.");
        System.out.println("_ Monto");
        System.out.println("------------------------------");
        System.out.println("Cuantas compras va a registrar: ");

        cantidad = sc.nextInt();
        System.out.println("------------------------------");
        for (int i = 0; i<cantidad;i++){

            System.out.print("ID de Compra: ");
            id = sc.nextInt();

            System.out.print("Monto: ");
            monto = sc.nextDouble();

            System.out.println("------------------------------");

            listaId.add(id);
            listaMontos.add(monto);
        }
        aplicarDescuento(listaId,listaMontos);


    }

}
