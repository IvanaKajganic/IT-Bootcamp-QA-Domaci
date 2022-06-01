package Nedelja6;

public class SastojakRecepta extends Sastojak{

    private double kolicina;

    public SastojakRecepta(String ime, double cena, double kolicina) {
        super(ime, cena);
        this.kolicina = kolicina;
    }

    public SastojakRecepta(double kolicina) {
        this.kolicina = kolicina;
    }

    public SastojakRecepta() {

    }

    public double getKolicina() {
        return kolicina;
    }

    public void setKolicina(double kolicina) {
        this.kolicina = kolicina;
    }

    public double ukupnaCena() {
        return kolicina * getCena();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("Potrebna kolicina je: ").append(kolicina).append("\n");
        return sb.toString();
    }
}
