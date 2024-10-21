// Ejercicio 4: Cálculo de descuentos para fidelización
//Una empresa ofrece descuentos a sus clientes dependiendo de la cantidad de compras que han realizado.
// Si han comprado más de 10 veces, reciben un 10% de descuento.

//**Instrucciones**:
//- Crea un arreglo `cliepras` que almacntes` y otro `comene la cantidad de compras de cada cliente.
//- Escribe una función `calcularDescuentos` que recorra el arreglo y aplique el descuento a los clientes que califiquen.


import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {

    public static void calculateDiscount(ArrayList<String>name,ArrayList<Integer>purchaces) {
        System.out.println("--------------------------------");
        System.out.println("Clientes con descuento del 10%");
        System.out.println("--------------------------------");
        System.out.println("Cliente: ");
        for (int i = 0; i< name.size();i++){
            if (purchaces.get(i) >= 10){
                System.out.println("- "+name.get(i));
            }

        }

    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

       //variables
        int customerQuantity;
        String customerName;
        int customerPurchace;

        //Listas
        ArrayList<String> listCustomerNames = new ArrayList<>();
        ArrayList<Integer> listCustomerPurchaces = new ArrayList<>();

        System.out.println(
                """
                --------------------------------
                Calcular Descuento fidelización
                --------------------------------
                _Ingresar Nombre Cliente.
                _Ingresar cantidad de compras.
                --------------------------------
                """);

        System.out.println("Ingrese la cantidad de clientes que va a ingresar");

        System.out.print("Cantidad: ");
        customerQuantity = sc.nextInt();

        sc.nextLine();

        System.out.println("--------------------------------");
        System.out.println("      Datos De Cliente");
        System.out.println("--------------------------------");

        for(int i = 0; i<customerQuantity; i++){

            System.out.println("Cliente "+(i+1)+": ");

            System.out.print("Nombre :");
            customerName = sc.nextLine();

            System.out.print("Cantidad de compras: ");
            customerPurchace = sc.nextInt();

            sc.nextLine();

            listCustomerNames.add(customerName);
            listCustomerPurchaces.add(customerPurchace);

            System.out.println("--------------------------------");
        }
        calculateDiscount(listCustomerNames,listCustomerPurchaces);
    }
}
