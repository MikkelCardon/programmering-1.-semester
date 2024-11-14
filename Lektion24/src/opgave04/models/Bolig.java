package opgave04.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bolig {
    private int kvm;
    private String adresse;
    private int prisPrMåned;
    private Kollegie kollegie;

    private ArrayList<Lejeaftale> lejeaftaler = new ArrayList<>();

    public Bolig(int kvm, String adresse, int prisPrMåned, Kollegie kollegie) {
        this.kvm = kvm;
        this.adresse = adresse;
        this.prisPrMåned = prisPrMåned;
        this. kollegie = kollegie;
        kollegie.addBolig(this);
    }


    public void setKollegie(Kollegie kollegie) {
        this.kollegie = kollegie;

    }

    public Lejeaftale createLejeaftale(LocalDate fraDato){
        Lejeaftale newLejeaftale = new Lejeaftale(fraDato, this);
        lejeaftaler.add(newLejeaftale);
        return newLejeaftale;
    }

    public ArrayList<Lejeaftale> getLejeaftaler() {
        return lejeaftaler;
    }


}
