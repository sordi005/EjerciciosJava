//Ejercicio 5: Cálculo de horas extras
//Una empresa desea calcular las horas extras trabajadas por sus empleados.
// Si un empleado trabaja más de 40 horas en la semana,
// las horas adicionales se consideran horas extras.
//Instrucciones:
//Pide al usuario ingresar el número de empleados.
//Usa un bucle para ingresar las horas trabajadas por cada empleado.
//Si un empleado trabajó más de 40 horas, calcula y muestra las horas extras

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {

    public static ArrayList<String> listaNombres(int cantidad){
        Scanner sc = new Scanner(System.in);
        String nombre;
        ArrayList<String>listaNombres = new ArrayList<>();
        System.out.println("Ingrese los nombres de los Empleados");
        for (int i = 0; i<cantidad; i++){
            System.out.print("Empleado "+(i+1)+": ");
            nombre = sc.nextLine();
            listaNombres.add(nombre);
        }
        System.out.println("¡¡¡Nombres Guardados Correctamente!!!");
        return listaNombres;
    }

    public static ArrayList<Integer> listaHoras (ArrayList<String>nombres){
        Scanner sc = new Scanner(System.in);
        int horas;
        int contador = 1;
        ArrayList<Integer>listaHoras = new ArrayList<>();
        System.out.println("Ingrese las Horas trabajadas de los Empleados");
        for ( String nombre : nombres){
            System.out.println("Empleado "+(contador)+": "+ nombre);
            System.out.print("Horas: ");
            horas = sc.nextInt();
            listaHoras.add(horas);
        }
        System.out.println("¡¡¡Horas Guardadas Correctamente!!!");
        return listaHoras;
    }

    public static void horasExtras(int cantidad,ArrayList<String>nombres,ArrayList<Integer>horas){
        int horasLaborales = 40;

        System.out.println("Empleados que Trabajaron Horas Extra");
        for (int i = 0; i< cantidad; i++){
            if (horas.get(i) > horasLaborales){
                System.out.println("Empleado: "+ nombres.get(i));
                System.out.println("Horas extras : "+ (horas.get(i)-horasLaborales));
            }
        }
    }


    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int comenzar;
        int cantEmpleados;
        ArrayList<String> listaNombresEmpleados = new ArrayList<>();
        ArrayList<Integer> listaHorasTrabajadas = new ArrayList<>();

        System.out.println("Sistema Gestión De Empleados");
        System.out.print("Ingrese el número 1 para comenzar: ");

        while (true){
            comenzar = sc.nextInt();
            if (comenzar == 1 ){
                break;}}

        System.out.print("Ingresa Cuantos Empleado va a ingresar: ");
        cantEmpleados = sc.nextInt();
        listaNombresEmpleados = listaNombres(cantEmpleados);

        System.out.println("Ingrese el numero 1 para guardar las horas: ");
        while (true){
            comenzar = sc.nextInt();
            if (comenzar == 1 ){
                break;}}
        listaHorasTrabajadas = listaHoras(listaNombresEmpleados);

        System.out.println("Ingrese el numero 1 para ver quienes hicieron horas extras: ");
        while (true){
            comenzar = sc.nextInt();
            if (comenzar == 1 ){
                break;}}
        horasExtras(cantEmpleados,listaNombresEmpleados,listaHorasTrabajadas);

    }
}
