package opgave04.models;

import java.util.ArrayList;

public class Lejer {
    private String name;
    private String uddannelse;

    public Lejer(String name, String uddannelse) {
        this.name = name;
        this.uddannelse = uddannelse;
    }




    public String toString(){
        return name + " " + uddannelse;
    }

    public void addLejeaftale(Lejeaftale lejeaftale){
            lejeaftale.addLejer(this);
    }
}
