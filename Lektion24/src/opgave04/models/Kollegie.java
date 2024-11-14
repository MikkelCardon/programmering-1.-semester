package opgave04.models;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Kollegie {
    private String name;
    private String adresse;

    private ArrayList<Bolig> boliger = new ArrayList<Bolig>();


    public Kollegie(String name, String adresse) {
        this.name = name;
        this.adresse = adresse;
    }

    public String getName() {
        return name;
    }


    public void addBolig(Bolig bolig){
        boliger.add(bolig);
        bolig.setKollegie(this);
    }

    public int getAntalLejeAftaler(){
        int antalLejeaftaler = 0;

        for (Bolig bolig : boliger) {
            antalLejeaftaler += bolig.getLejeaftaler().size();
        }
        return antalLejeaftaler;
    }

    public int gennemsnitligAntalDage(){
        int samledelejeDage = 0;
        int antalAfsluttedeLejeaftaler = 0;

        for (Bolig bolig : boliger) {
            for (Lejeaftale lejeaftale : bolig.getLejeaftaler()) {
                if (lejeaftale.getTildato() != null){
                    samledelejeDage += ChronoUnit.DAYS.between(lejeaftale.getFraDato(), lejeaftale.getTildato());
                    antalAfsluttedeLejeaftaler++;
                }
            }
        }

        if (antalAfsluttedeLejeaftaler > 0){
            return samledelejeDage/antalAfsluttedeLejeaftaler;
        }
        return 0;
    }
}
