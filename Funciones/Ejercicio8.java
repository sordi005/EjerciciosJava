// Ejercicio 8: Control de horas trabajadas
//Una empresa de servicios necesita llevar el control de las horas trabajadas por sus empleados durante una semana.
//**Instrucciones**:
//- Crea un arreglo `empleados` con los nombres de los empleados y otro arreglo `horasTrabajadas` con las horas trabajadas en la semana.
//- Escribe una función `calcularPagoSemanal` que calcule el pago semanal (a razón de $15 por hora trabajada).

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {

    public static void calcularPagoSemanala(ArrayList<Integer>id,ArrayList<Integer>horas){

        int pagoXhora = 15;
        System.out.println("Pago semanal de Empleados");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < id.size(); i++){
            System.out.println("Empleado:");
            System.out.println("ID: "+id.get(i));
            System.out.println("Pago: "+ (horas.get(i)*pagoXhora) );
            System.out.println("-----------------------------------------");

        }

    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        //Variables
        int cantidad;
        int id;
        int horasTrabajadas;

        //listas
        ArrayList<Integer> listaID= new ArrayList<>();
        ArrayList<Integer> listaHoras = new ArrayList<>();


        System.out.println("-----------------------------------------");
        System.out.println(" SISTEMA CONTROLADOR DE HORAS TRABAJADAS ");
        System.out.println("-----------------------------------------");
        System.out.println("Debe Ingresar: ");
        System.out.println("-----------------------------------------");
        System.out.println("-- Cantidad de empleados");
        System.out.println("-- Id del empleado que va a registrar ");
        System.out.println("-- Cantidad De horas trabajadas en la semana ");
        System.out.println("-----------------------------------------");
        System.out.print("Cantidad de Empleados: ");
        cantidad = sc.nextInt();
        System.out.println("-----------------------------------------");
        for (int i = 0; i < cantidad; i++){
            System.out.print("Id Empleado: ");
            id = sc.nextInt();
            System.out.print("Horas: ");
            horasTrabajadas = sc.nextInt();
            System.out.println("-----------------------------------------");
            listaID.add(id);
            listaHoras.add(horasTrabajadas);
        }
        calcularPagoSemanala(listaID,listaHoras);



    }
}
