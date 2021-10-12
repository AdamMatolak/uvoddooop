package sk.kasv.matolak.uvoddooop;

import java.util.ArrayList;
import java.util.List;

public class FPlane {
    private String brand;
    private String model;
    private int year;
    private boolean jet;

    public FPlane(String brand, String model, int year, boolean jet) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.jet = jet;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean isJet() {
        return jet;
    }

    public String toString() {
        return brand + "," + model + "," + year + ", Jet: " + jet;
    }

    public static List<FPlane> planes = new ArrayList<>();

    public static void main(String[] args) {
        FPlane first = new FPlane("Boeing", "747", 2000, true);
        FPlane second = new FPlane("Airbus", "A380", 2020, true);
        FPlane third = new FPlane("Cesna", "172", 2014, false);
        FPlane fourth = new FPlane("Antonov", "An-225", 2013, true);
        FPlane fifth = new FPlane("Northrop Grumman", "B-2 Spirit", 1997, true);

        planes.add(first);
        planes.add(second);
        planes.add(third);
        planes.add(fourth);
        planes.add(fifth);
        planes.add(new FPlane("Boeig","777",2015,true));
        planes.add(new FPlane("Boeig","727",2002,true));

        planes.forEach(i-> System.out.println(i));

    }

}
