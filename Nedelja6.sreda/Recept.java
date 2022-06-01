package Nedelja6;

import java.util.ArrayList;

public class Recept {

    private String naziv;
    private int kategorija;
    private ArrayList<SastojakRecepta> potrebniSastojci;


    public Recept(String naziv, int kategorija, ArrayList<SastojakRecepta> potrebniSastojci) {
        this.naziv = naziv;
        this.kategorija = kategorija;
        if (potrebniSastojci == null)
            this.potrebniSastojci = new ArrayList<>();
        else
            this.potrebniSastojci = potrebniSastojci;
    }

    public Recept() {
        potrebniSastojci = new ArrayList<>();
    }

    public String getIme(int i) {
        return naziv;
    }

    public void setIme(String naziv) {
        this.naziv = naziv;
    }

    public int getKategorija() {
        return kategorija;
    }

    public void setKategorija(int kategorija) {
        this.kategorija = kategorija;
    }

    public ArrayList<SastojakRecepta> getPotrebniSastojci() {
        return potrebniSastojci;
    }

    public void setPotrebniSastojci(ArrayList<SastojakRecepta> potrebniSastojci) {
        this.potrebniSastojci = potrebniSastojci;
    }

    public void dodajSastojak(SastojakRecepta sastojak) {
        potrebniSastojci.add(sastojak);
    }

    public void dodajSastojakNaIndex(SastojakRecepta sastojak, int i) {
        if (i >= 0 && i <= potrebniSastojci.size()) {
            potrebniSastojci.add(i, sastojak);
        }
        else {
            System.out.println("Uneli ste negativan index.");
        }
    }

    private boolean daLiSuIsti(SastojakRecepta s1, SastojakRecepta s2) {
        if (s1.getIme().equals(s2.getIme())
        && s1.getKolicina() == s2.getKolicina()
        && s1.getCena() == s2.getCena())
            return true;
        return false;
    }

    public void ukloniSastojak (SastojakRecepta sastojak) {
        for (int i = 0; i < potrebniSastojci.size(); i++) {
            SastojakRecepta trenutni = potrebniSastojci.get(i);
            if (daLiSuIsti(trenutni, sastojak)) {
                potrebniSastojci.remove(i);
                return;
            }
        }
    }

    public String postaviKategoriju (int kategorija){
        switch (kategorija) {
            case 1:
                return "pocetni nivo";
            case 2:
                return "lak nivo";
            case 3:
                return "srednji nivo";
            case 4:
                return "tezak nivo";
            case 5:
                return "majstorski nivo";
            default:
                return "Nevalidan unos.";
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(naziv).append('\n');
        sb.append("Tezina: ").append(postaviKategoriju(kategorija)).append('\n');
        sb.append("Sastojci: ");
        for(SastojakRecepta sr :potrebniSastojci){
            sb.append(sr.getIme()).append(", ");
        }
        return sb.toString();
    }
}
