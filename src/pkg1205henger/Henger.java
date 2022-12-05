package pkg1205henger;

public class Henger {
    
    private static int hengerDb;
    //vagy statik konstruktorral
    static{
        hengerDb = 0;
    }
    
    private int hengerDarab;
    private double sugar,magassag;

    public Henger(double sugar, double magassag) {
        if (sugar <= 0) {
            sugar = 1;
        }
        if (magassag <= 0) {
            magassag = 1;
        }
        //egy hengernek nemlehet egyik mérete sem 0, mert akkor nem henger
        this.sugar = sugar;
        this.magassag = magassag;
    }

    public static int getHengerDb() {
        return hengerDb;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }
    
    public double terfogat(){
        return Math.pow(sugar, 2) * Math.PI * magassag;
    }

    @Override
    public String toString() {
        return "Henger{" + "hengerDarab=" + hengerDarab + ", sugar=" + sugar + ", magassag=" + magassag + '}';
    }
    
    
}
