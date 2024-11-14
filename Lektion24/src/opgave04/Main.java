package opgave04;

import opgave04.models.Bolig;
import opgave04.models.Kollegie;
import opgave04.models.Lejeaftale;
import opgave04.models.Lejer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Opretter kollegie
        Kollegie kollegie1 = new Kollegie("Kollegie A", "vej1");
        Kollegie kollegie2 = new Kollegie("Kollegie B", "vej2");

        //Opretter bolig
        Bolig bolig1 = new Bolig(55, "1. tv", 5500, kollegie1);
        Bolig bolig2 = new Bolig(75, "3. tv", 8000, kollegie1);
        Bolig bolig3 = new Bolig(109, "st. tv.", 9000, kollegie1);


        //opretter lejeaftale til hver bolig
        Lejeaftale lejeaftale1 = bolig1.createLejeaftale(LocalDate.of(2024, 5, 17));
        bolig2.createLejeaftale(LocalDate.of(2024, 10, 5));
        bolig3.createLejeaftale(LocalDate.of(2022, 4, 22));

        Lejer mikkel = new Lejer("Mikkel", "Datamatiker");

        //mikkel.addLejeaftale(bolig1.getLejeaftaler().getFirst());
        lejeaftale1.addLejer(mikkel);

        //Lejeaftale constructor er ikke public. Kan kun oprettes igennem bolig klassen.
        //Lejeaftale lejeaftale = new Lejeaftale();



        //returner array af lejeaftaler
        System.out.println(bolig1.getLejeaftaler());

        //Antal lejeaftaler
        System.out.println(kollegie1.getName() + " har " + kollegie1.getAntalLejeAftaler()+ " lejeaftaler");


        //Afslutter lejeaftale
        lejeaftale1.afslutLejeaftale(LocalDate.of(2024, 5, 19));

        //Gennesnitlige antal dage for lejeaftaler.
        System.out.println("Den gennemsnitlige lejeaftale er " + kollegie1.gennemsnitligAntalDage() + " dage");

        //Viser lejere
        System.out.println(lejeaftale1.getLejere());

    }
}
