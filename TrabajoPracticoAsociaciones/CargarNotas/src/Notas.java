public class Notas {
    private String catedra;
    private double notaExamen;

    public Notas(String catedra, double notaExamen) {
        this.catedra = catedra;
        this.notaExamen = notaExamen;
    }

    public String getCatedra() {
        return catedra;
    }

    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }

    public double getNotaExamen() {
        return notaExamen;
    }

    public void setNotaExamen(double notaExamen) {
        this.notaExamen = notaExamen;
    }

    @Override
    public String toString() {
        return "Cátedra: " + catedra + ", Nota: " + notaExamen;
    }
}




