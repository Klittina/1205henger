package pkg1205henger;


public class Cso extends TomorHenger{
    
    private double falvastagsag;

    public Cso(double falvastagsag, double fajsuly, double sugar, double magassag) {
        super(fajsuly, sugar, magassag);
        this.falvastagsag = falvastagsag;
    }

    public Cso(double fajsuly, double sugar, double magassag) {
        super(fajsuly, sugar, magassag);
    }
    

    public void setFalvastagsag(double falvastagsag) {
        this.falvastagsag = falvastagsag;
    }

    
    
    public double getFalvastagsag() {
        return falvastagsag;
    }
    
    @Override
    public double terfogat(){
        //return super.terfogat();
        Henger belso = new Henger(this.getSugar()-this.falvastagsag, this.getMagassag());
        return super.terfogat()-belso.terfogat();
    }

    @Override
    public String toString() {
        return "Cso{" + "falvastagsag=" + falvastagsag + '}';
    }
   
    
    
}
