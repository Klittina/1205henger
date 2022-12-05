package pkg1205henger;

public class Cso {
    
private int hengerDarab;
    private double sugar,magassag, fajsuly, falvastagsag;

    public Cso(double sugar, double magassag, double fajsuly, double falvastagsag) {
        this.sugar = sugar;
        this.magassag = magassag;
        this.fajsuly = fajsuly;
        this.falvastagsag = falvastagsag;
    }

    public Cso(double sugar, double magassag, double falvastagsag) {
        this.sugar = sugar;
        this.magassag = magassag;
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }
    
    public double terfogat(){
        return 0;
    }

    @Override
    public String toString() {
        return "Cso{" + "hengerDarab=" + hengerDarab + ", sugar=" + sugar + ", magassag=" + magassag + ", fajsuly=" + fajsuly + ", falvastagsag=" + falvastagsag + '}';
    }
    
}
