package lek16.opgave06;

public class Car {
    String mærke;
    String model = "";
    boolean elektrisk = false;
    int prisPerDag = 0;


    public Car(String mærke, String model, boolean elektrisk, int prisPerDag){
        this.mærke = mærke;
        this.model = model;
        this.elektrisk = elektrisk;
        this.prisPerDag = prisPerDag;
    }

    public String toString(){
        return mærke + " " + model + " " + elektrisk + " " + prisPerDag;
    }


}
