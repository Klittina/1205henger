package pkg1205henger;



public class TomorHenger extends Henger{
    
    private double fajsuly;

    public TomorHenger(double fajsuly, double sugar, double magassag) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
        
        //this(sugar,magassag); -- rekurziv hívás, nem fog lefordulni
    }

    public void setFajsuly(double fajsuly) {
        this.fajsuly = fajsuly;
    }

    

    public double getFajsuly() {
        return fajsuly;
    }
    
    public double suly(){
        return 0;
    }

    @Override
    public String toString() {
        return "TomorHenger{" + "fajsuly=" + fajsuly + '}';
    }

    
    
    
}
