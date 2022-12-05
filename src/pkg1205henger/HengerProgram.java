package pkg1205henger;

import java.util.ArrayList;
import java.util.List;

public class HengerProgram extends Henger{
    
    private List <Henger> hengerek;

    public HengerProgram(List<Henger> hengerek, double sugar, double magassag) {
        super(sugar, magassag);
        this.hengerek = hengerek;
    }

    public HengerProgram(){
        hengerek = new ArrayList<>();
        
        hengerek.add(new Henger(0, 0));
        hengerek.add(new TomorHenger(0, 0));
        hengerek.add(new Cso(5,6,0.5));
        //btw a tanár úr az uml-lel ellentétben, nem csőnek nevezi a programot hanem LyukasHengernek, csak mindent az uml alapján neveztem el, de remélem nekedis logikus leszxddd
    }
    
    public double atlagTerfogat(){
        double atlagV = 0;
        for (int i = 0; i < hengerek.size(); i++) {
            atlagV += hengerek.get(i).terfogat();
        }
        return atlagV/Henger.getHengerDb();
    }
    
    public double csovekSulya(){
        double csovekS = 0;
        for (int i = 0; i < hengerek.size(); i++) {
            Henger h = hengerek.get(i);
            if (h instanceof Cso) {
                csovekS += ((Cso) h).suly();
            }
        }
        return csovekS;
    }
    
    public void run(){
        System.out.println("Hengerek:");
        
        for (Henger henger : lista()) {
            System.out.println(henger);
        }
        
        System.out.println("Átlag térfogat: " + atlagTerfogat());
        System.out.println("Csövek súlya: "+ csovekSulya());
    }
    public static void main(String[] args) {
        new HengerProgram().run();
        
        //tesztelni is kell
        //nincs hibátlan program, csak keveset tesztelt
        //programozó is tesztel --> unit tesztek --> c nyelvek
        //nem hibátlan a programom, fent van a kis fasszopó piros felkiáltójel, valszeg a üres hívás miatt amit a mai órán a 
        //tanár is említett, de nemtalálom h melyikkel van baja mert nem jelzi a kis nyomi
        //ezen kívűl jó, de szerintem úgyis feltölti a tanár úr, de abba nincsenek ilyen kis izgalmas kommentek
    }
    
    private List<Henger> lista(){
        return hengerek;
    }
}
