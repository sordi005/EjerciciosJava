//Ejercicio 3: Generador de Rutinas de Ejercicio
//Escribe un programa que pida al usuario su nivel de condición física (principiante, intermedio,
//avanzado) y luego genere una rutina de ejercicio semanal con diferentes tipos de ejercicios y
//duraciones.

import java.util.Scanner;
public class GeneradorRutinaEjercicios {

    public static String rutinas(int opcion){
        String rutinaElegida = "";
        if (opcion == 1){
            rutinaElegida ="""
                            NIVEL PRINCIPIANTE
                            
                            Día 1:
                             -Cuerpo Completo
                            Calentamiento (5-10 minutos)
                                                
                            -Marcha en el lugar o caminata rápida.
                            Circuito (3 rondas)
                            -Sentadillas: 3 series de 10 repeticiones.
                            -Flexiones de pared (o flexiones de rodillas): 3 series de 8-10 repeticiones.
                            -Puente de glúteos: 3 series de 10 repeticiones.
                            -Plancha (sobre las rodillas si es necesario): 3 series de 15-20 segundos.
                            -Abdominales clásicos: 3 series de 12 repeticiones.
                            -Cardio suave (15 minutos)
                            -Caminata rápida o bicicleta estática.
                            
                            Día 2: 
                            -Resistencia y Fuerza
                            -Calentamiento (5-10 minutos)
                            -Marcha en el lugar.
                            -Entrenamiento de fuerza (3 rondas)
                            -Estocadas hacia atrás: 3 series de 8-10 repeticiones por pierna.
                            -Flexiones de rodillas: 3 series de 6-8 repeticiones.
                            -Remo con mancuernas (o sin peso para empezar): 3 series de 10 repeticiones por brazo.
                            -Superman (para fortalecer la espalda baja): 3 series de 12 repeticiones.
                            -Cardio (20 minutos)
                            -Caminar, nadar o andar en bicicleta a ritmo moderado.
                            
                            Día 3: 
                            -Cardio y Core
                            -Calentamiento (5-10 minutos)
                            -Saltar a la cuerda o marcha en el lugar.
                            -Circuito de cardio (3 rondas)
                            -Burpees modificados: 10 repeticiones.
                            -Mountain climbers (escaladores): 15 repeticiones por pierna.
                            -Plancha con toques de hombros: 3 series de 12 repeticiones por lado.
                            -Enfriamiento y estiramientos (5-10 minutos)
                    """;
        }
        else if (opcion == 2) {
            rutinaElegida="""
                    NIVEL INTERMEDIO
                                        
                    Día 1: Piernas y Cardio
                    Calentamiento (5-10 minutos)
                    - Saltar a la cuerda o trote ligero.
                                        
                    Entrenamiento de piernas (4 rondas)
                    - Sentadillas con salto: 3 series de 12 repeticiones.
                    - Estocadas caminando: 3 series de 10 pasos por pierna.
                    - Puente de glúteos con una pierna: 3 series de 10 repeticiones por pierna.
                    - Plancha lateral: 3 series de 20-30 segundos por lado.
                                        
                    Cardio intervalado (20-30 minutos)
                    - Alterna entre sprints de 30 segundos y caminar durante 1 minuto.
                                        
                    Día 2: Cuerpo Superior
                    Calentamiento (5-10 minutos)
                    - Saltar a la cuerda.
                                        
                    Entrenamiento de fuerza (4 rondas)
                    - Flexiones: 4 series de 10-12 repeticiones.
                    - Remo con mancuernas: 4 series de 12 repeticiones.
                    - Press de hombros con mancuernas: 4 series de 12 repeticiones.
                    - Planchas con toques de hombros: 3 series de 15 toques por lado.
                                        
                    Cardio (15 minutos)
                    - Remo o bicicleta estática.
                                        
                    Día 3: Core y Abs
                    Calentamiento (5-10 minutos)

                    - Círculos de brazos y rotaciones de tronco.
                                        
                    Entrenamiento de core (4 rondas)
                    - Plancha: 4 series de 30-45 segundos.
                    - Crunch con piernas elevadas: 4 series de 15 repeticiones.
                    - Levantamiento de piernas acostado: 4 series de 12 repeticiones.
                    - Mountain climbers: 3 series de 15 repeticiones por pierna.
                                        
                    Día 4: Cardio + Fuerza Total
                    Calentamiento (5-10 minutos)
                    - Trote ligero o saltos de tijera.
                                        
                    Circuito de cuerpo completo (5 rondas)
                    - Burpees: 10 repeticiones.
                    - Sentadilla con press de hombros: 12 repeticiones.
                    - Mountain climbers: 15 repeticiones por pierna.
                    - Planchas: 30 segundos.
                                        
                    Cardio (15 minutos)
                    - Intervalos de sprint y caminar.        
                    
                    
                    """;
        }
        else{
            rutinaElegida = """
                                NIVEL AVANZADO
                                
                    Día 1: Piernas
                    Calentamiento (5-10 minutos)
                    - Saltos de tijera y sentadillas.
                                
                    Entrenamiento de piernas (5 rondas)
                    - Sentadilla con barra: 4 series de 10-12 repeticiones.
                    - Peso muerto rumano: 4 series de 8-10 repeticiones.
                    - Estocadas con salto: 3 series de 12 repeticiones.
                    - Elevaciones de pantorrilla: 4 series de 15 repeticiones.
                                
                    Día 2: Cuerpo Superior
                    Calentamiento (5-10 minutos)
                    - Círculos de brazos y estiramientos dinámicos.
                                
                    Entrenamiento de fuerza (5 rondas)
                    - Press de banca: 4 series de 8-10 repeticiones.
                    - Dominadas: 4 series de 8-10 repeticiones.
                    - Press de hombros con barra: 4 series de 10 repeticiones.
                    - Fondos en paralelas: 3 series de 12 repeticiones.
                                
                    Día 3: Cardio HIIT
                    Calentamiento (5-10 minutos)
                    - Trote ligero.
                                
                    HIIT (Intervalos de alta intensidad) (30 minutos)
                    - 1 minuto de sprint seguido de 1 minuto de caminata, repetir por 20-30 minutos.
                                
                    Día 4: Core y Abs
                    Entrenamiento de core avanzado (5 rondas)
                    - Plancha con rotación: 4 series de 20 segundos.
                    - V-Ups: 4 series de 15 repeticiones.
                    - Russian twists con peso: 4 series de 15 repeticiones por lado.
                                
                    Día 5: Cuerpo Completo + Cardio
                    Entrenamiento de fuerza y cardio (5 rondas)
                    - Burpees con salto alto: 10 repeticiones.
                    - Kettlebell swings: 15 repeticiones.
                    - Push press: 12 repeticiones.
                                
                    Cardio continuo (20-30 minutos)
                    - Correr, nadar o andar en bicicleta a ritmo moderado.
                                
                    Descanso:
                    Para ambas rutinas, es recomendable tomar 1-2 días de 
                    descanso activo (ej. caminatas ligeras o estiramientos) a la 
                    semana para permitir la recuperación muscular.        """;
        }

        return rutinaElegida;

    }

    public static  void  main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print(
           """
           Generador De Rutinas de Ejercicio
             Niveles De Condicion Fisica
             1)_ Principiante: 
                    -Nunca se ejercita.
             2)_ Intermedio:
                    -Se ejercita 1 o 2 veces por semana.
             3)_ Avanzado: 
                    -Se ejercita 3 o mas veces por semana.
                
             Ingrese su Nivel(1-2-3):    
                           
           """);
        int nivelIngreado =  scanner.nextInt();
        if (nivelIngreado > 0 && nivelIngreado<4) {
            String rutina = rutinas(nivelIngreado);
            System.out.print(rutina);

        }

    }
}
