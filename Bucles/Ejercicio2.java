//Ejercicio 2: Cálculo de salarios semanales
//Una empresa desea calcular el salario semanal de sus empleados basándose en las horas trabajadas y una tarifa fija por hora.
//Instrucciones:
//Pide al usuario ingresar la cantidad de empleados.
//Para cada empleado, pide ingresar las horas trabajadas.
//Usa un bucle para calcular el salario de cada empleado (suponiendo una tarifa fija de $15 por hora).

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

    public static ArrayList<Integer> calcularSalario(ArrayList<Integer>horasTrabajadas){
        int tarifaXhora = 15;
        ArrayList<Integer> listaSalario = new ArrayList<>();
        for (int horas: horasTrabajadas){
            int salario = horas * tarifaXhora;
            listaSalario.add(salario);

        }
        return listaSalario;

    }


    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int cantEmpleados;
        ArrayList<String> nombresEmpleados = new ArrayList<>();
        ArrayList<Integer> horasTrabajadas = new ArrayList<>();

        System.out.println("Calculadora De Salarios Semanalaes");
        System.out.println("""
                .................................................
                Debe Ingresar: 
                -Cantidad De empleados que va a ingresar.
                -Ingresar las horas trabajadas de cada empleados.
                .................................................
                """);
        System.out.print("Cuantos Empleados va a Ingresar: ");
        cantEmpleados = sc.nextInt();

        sc.nextLine();

        System.out.println("Ingrese Los nombres y las horas trabajas de cada empleado");
        for (int i = 0; i< cantEmpleados; ++i ){

            System.out.println("Empleado "+(i+1)+": ");
            String nombreEmpleado = sc.nextLine();
            nombresEmpleados.add(nombreEmpleado);

            System.out.print("Horas Trabajadas: ");
            int horaTrabajada = sc.nextInt();
            horasTrabajadas.add(horaTrabajada);

            sc.nextLine();

        }

        ArrayList<Integer> salarios = calcularSalario(horasTrabajadas);
        System.out.println("-------------------------------");
        System.out.println("Salarios Semanales");
        System.out.println("-------------------------------");

        for (int i = 0; i<cantEmpleados; i++){

            System.out.println("Empleado "+(i+1)+":"+ nombresEmpleados.get(i)+"hs");
            System.out.println("Horas Trabajadas: "+horasTrabajadas.get(i)+"hs");
            System.out.println("Salario Semanal $"+salarios.get(i));
            System.out.println("-------------------------------");
        }
    }
}


