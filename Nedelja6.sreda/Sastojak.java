package Nedelja6;

public class Sastojak {

    private String ime;
    private double cena;

    public Sastojak(String ime, double cena) {
        this.ime = ime;
        this.cena = cena;
    }

    public Sastojak() {
        this.ime = "";
        this.cena = 0.0;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sastojak je: ").append(ime).append('\n');
        sb.append("Cena u dinarima: ").append(cena).append("\n");
        return sb.toString();
    }

}
