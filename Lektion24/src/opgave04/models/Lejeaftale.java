package opgave04.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Lejeaftale {
    private LocalDate fraDato;
    private LocalDate tildato = null;
    private Bolig bolig;
    private boolean afsluttet = false;
    private ArrayList<Lejer> lejere = new ArrayList<>();


    Lejeaftale(LocalDate fraDato, Bolig bolig) {
        this.fraDato = fraDato;
        this.bolig = bolig;
    }



    public LocalDate getFraDato() {
        return fraDato;
    }

    public LocalDate getTildato() {
        return tildato;
    }


    public void afslutLejeaftale(LocalDate tildato) {
        this.afsluttet = true;
        this.tildato = tildato;
    }




    public ArrayList<Lejer> getLejere() {
        return lejere;
    }

    public void addLejer(Lejer lejer){
        if (!lejere.contains(lejer)){
            if (lejere.size() < 2){
                lejere.add(lejer);
            }
            else {System.out.println("Fejl");}
            lejer.addLejeaftale(this);
        }
    }

    @Override
    public String toString() {
        return "Lejeaftale{" +
                "tildato=" + tildato +
                ", fraDato=" + fraDato +
                '}';
    }
}
