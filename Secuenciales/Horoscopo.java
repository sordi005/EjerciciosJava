import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Horoscopo {

    public static String signosMensaje(String meses, String dias) {
        String aries = "¡Eres audaz y valiente, Aries! Tu energía inagotable y espíritu competitivo te hacen destacar en cualquier desafío.";
        String tauro = "La perseverancia es tu mayor fortaleza, Tauro. Te encanta la estabilidad y trabajas duro para crear un entorno seguro y confortable.";
        String geminis = "Con tu mente rápida y curiosidad interminable, Géminis, eres el alma de las conversaciones. Siempre tienes algo interesante que compartir.";
        String cancer = "Cáncer, tu sensibilidad y empatía te hacen ser un apoyo para quienes te rodean. Tu familia y amigos valoran tu lealtad incondicional.";
        String leo = "Eres un líder natural, Leo. Tu confianza y entusiasmo contagian a todos, y brillas con luz propia en cualquier situación.";
        String virgo = "Virgo, tu atención al detalle y enfoque meticuloso son admirables. Siempre buscas la perfección en todo lo que haces.";
        String libra = "Tu búsqueda de equilibrio y armonía, Libra, te hace ser el mediador perfecto. Tienes un sentido innato de la justicia y aprecias la belleza en todas sus formas.";
        String escorpio = "Tu búsqueda de equilibrio y armonía, Libra, te hace ser el mediador perfecto. Tienes un sentido innato de la justicia y aprecias la belleza en todas sus formas.";
        String sagitario = "Sagitario, tu amor por la aventura y la libertad te llevan a explorar nuevos horizontes. Eres un optimista nato, siempre buscando el lado positivo de la vida.";
        String capricornio = "La disciplina y la responsabilidad son tus guías, Capricornio. Tu ambición te lleva a alcanzar grandes metas con determinación y paciencia.";
        String acuario = "Original e independiente, Acuario, te encanta pensar fuera de lo convencional. Tu mente abierta y visión de futuro son fuente de inspiración para muchos.";
        String piscis = "Piscis, tu naturaleza compasiva y creativa te conecta con los demás de una manera única. Tienes una intuición fuerte que te guía en todo lo que haces.";

        // Inicializamos la variable signo con un valor vacío
        String signo = "";
        int mesIngresado = Integer.parseInt(meses);
        int dia = Integer.parseInt(dias);
        // Uso de switch para asignar el mensaje según el mes y día
        switch (mesIngresado) {
            case 1:
                if (dia > 0 && dia <= 19) {
                    signo = capricornio;
                } else if (dia >= 20 && dia <= 31) {
                    signo = acuario;
                }
                break;
            case 2:
                if (dia > 0 && dia <= 18) {
                    signo = acuario;
                } else if (dia >= 19 && dia <= 29) { // Febrero puede tener 28 o 29 días
                    signo = piscis;
                }
                break;
            case 3:
                if (dia > 0 && dia <= 20) {
                    signo = piscis;
                } else if (dia >= 21 && dia <= 31) {
                    signo = aries;
                }
                break;
            case 4:
                if (dia > 0 && dia <= 19) {
                    signo = aries;
                } else if (dia >= 20 && dia <= 30) {
                    signo = tauro;
                }
                break;
            case 5:
                if (dia > 0 && dia <= 20) {
                    signo = tauro;
                } else if (dia >= 21 && dia <= 31) {
                    signo = geminis;
                }
                break;
            case 6:
                if (dia > 0 && dia <= 20) {
                    signo = geminis;
                } else if (dia >= 21 && dia <= 30) {
                    signo = cancer;
                }
                break;
            case 7:
                if (dia > 0 && dia <= 22) {
                    signo = cancer;
                } else if (dia >= 23 && dia <= 31) {
                    signo = leo;
                }
                break;
            case 8:
                if (dia > 0 && dia <= 22) {
                    signo = leo;
                } else if (dia >= 23 && dia <= 31) {
                    signo = virgo;
                }
                break;
            case 9:
                if (dia > 0 && dia <= 22) {
                    signo = virgo;
                } else if (dia >= 23 && dia <= 30) {
                    signo = libra;
                }
                break;
            case 10:
                if (dia > 0 && dia <= 22) {
                    signo = libra;
                } else if (dia >= 23 && dia <= 31) {
                    signo = escorpio;
                }
                break;
            case 11:
                if (dia > 0 && dia <= 21) {
                    signo = escorpio;
                } else if (dia >= 22 && dia <= 30) {
                    signo = sagitario;
                }
                break;
            case 12:
                if (dia > 0 && dia <= 21) {
                    signo = sagitario;
                } else if (dia >= 22 && dia <= 31) {
                    signo = capricornio;
                }
                break;
            default:
                signo = "Fecha inválida";
                break;
        }

        return signo;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su fecha de nacimiento en formato DD/MM/AA: ");
        String fechaDeNacimiento = scanner.nextLine();

        String[] partes = fechaDeNacimiento.split("/");

        String dia = partes[0];
        String mes = partes[1];

        String signo = Horoscopo.signosMensaje(mes,dia);
        System.out.print(signo);

    }




}