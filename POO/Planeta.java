public class Planeta {
    // Atributos
    private String nombre = null;
    private int satelites = 0;
    private double masaKg = 0;
    private double volumenKm3 = 0;
    private int diametroKm = 0;
    private int distanciaMediaSolMillonesKm = 0;
    private TipoPlaneta tipoPlaneta = null;
    private boolean esObservable = false;
    private int periodoOrbital = 0;
    private int periodoDeRotacion  = 0;

    // Enum para el tipo de planeta
    public enum TipoPlaneta {
        GASEOSO,
        TERRESTRE,
        ENANO
    }

    // Constructor
    public Planeta(String nombre, int satelites, double masaKg, double volumenKm3,
                   int diametroKm, int distanciaMediaSolMillonesKm, TipoPlaneta tipoPlaneta, boolean esObservable,int periodoOrbital,int periodoDeRotacion) {
        this.nombre = nombre;
        this.satelites = satelites;
        this.masaKg = masaKg;
        this.volumenKm3 = volumenKm3;
        this.diametroKm = diametroKm;
        this.distanciaMediaSolMillonesKm = distanciaMediaSolMillonesKm;
        this.tipoPlaneta = tipoPlaneta;
        this.esObservable = esObservable;
        this.periodoOrbital = periodoOrbital;
        this.periodoDeRotacion = periodoDeRotacion;
    }

    //  mostrar información del planeta
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Satélites: " + satelites);
        System.out.println("Masa (kg): " + masaKg);
        System.out.println("Volumen (km³): " + volumenKm3);
        System.out.println("Diámetro (km): " + diametroKm);
        System.out.println("Distancia media al Sol (millones de km): " + distanciaMediaSolMillonesKm);
        System.out.println("Tipo de planeta: " + (tipoPlaneta != null ? tipoPlaneta : "No definido"));
        System.out.println("Observable a simple vista: " + (esObservable ? "Sí" : "No"));
        System.out.println("Periodo Orbital: "+ periodoOrbital + " Años ");
        System.out.println("Periodo De Rotación : "+ periodoDeRotacion + "Horas ");
    }

    // calcular la densidad
    public double calcularDensidad() {
        if (volumenKm3 == 0) {
            return 0.0; // Evitar división por cero
        }
        return masaKg / volumenKm3;
    }

    // determinar si el planeta es exterior
    public void determinarExterioridad() {
        double distanciaUA = (distanciaMediaSolMillonesKm * 1_000_000) / 149_597_870.0;
        if (distanciaUA > 3.4) {
            System.out.println("El planeta " + nombre + " es un planeta exterior.");
        } else if (distanciaUA >= 2.1) {
            System.out.println("El planeta " + nombre + " está en el cinturón de asteroides.");
        } else {
            System.out.println("El planeta " + nombre + " no es un planeta exterior.");
        }
    }

    public static void main(String[] args) {
        // Crear dos planetas
        Planeta tierra = new Planeta("Tierra", 1, 5.97 * Math.pow(10, 24),
                1.083 * Math.pow(10, 12), 12742, 149, TipoPlaneta.TERRESTRE, true,1, 24);

        Planeta jupiter = new Planeta("Júpiter", 79, 1.898 * Math.pow(10, 27),
                1.43 * Math.pow(10, 15), 139820, 778, TipoPlaneta.GASEOSO, true,12,9);

        // Mostrar información de los planetas
        System.out.println(" Información de la Tierra ");
        tierra.mostrarInformacion();
        System.out.println("Densidad: " + tierra.calcularDensidad() + " kg/km³");
        tierra.determinarExterioridad();

        System.out.println("\nInformación de Júpiter");
        jupiter.mostrarInformacion();
        System.out.println("Densidad: " + jupiter.calcularDensidad() + " kg/km³");
        jupiter.determinarExterioridad();
    }
}
