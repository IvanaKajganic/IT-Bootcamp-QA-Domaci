package Nedelja6;

import java.util.ArrayList;

public class ReceptTest {

    public static void main(String[] args) {

        SastojakRecepta jaje = new SastojakRecepta("jaje", 12.5, 2);
        SastojakRecepta mleko = new SastojakRecepta("mleko", 0.11, 300);
        SastojakRecepta brasno = new SastojakRecepta("brasno", 0.07, 250);

        System.out.println("Ukupna cena jaja u dinarima je: " + jaje.ukupnaCena());
        System.out.println("Ukupna cena mleka u dinarima je: " + mleko.ukupnaCena());
        System.out.println("Ukupna cena brasna u dinarima je: " + brasno.ukupnaCena());
        System.out.println("-------------");

        ArrayList<SastojakRecepta> sastojciSpagete = new ArrayList<>();
        sastojciSpagete.add(new SastojakRecepta("spageti", 430.00, 1));
        sastojciSpagete.add(new SastojakRecepta("pavlaka za kuvanje", 285.00, 1));
        sastojciSpagete.add(new SastojakRecepta("beli luk", 25.00, 0.3));
        sastojciSpagete.add(new SastojakRecepta("curece meso", 6.80, 500));
        sastojciSpagete.add(new SastojakRecepta("maslac", 280.00, 1));
        sastojciSpagete.add(jaje);
        sastojciSpagete.add(new SastojakRecepta("biber", 2.15, 0.03));
        sastojciSpagete.add(new SastojakRecepta("so", 1.23, 0.2));

        Recept spagete = new Recept("Spageti u belom sosu", 3, sastojciSpagete);
        System.out.println(spagete);

    }



}
