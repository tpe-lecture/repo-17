package tpe.oo.metropolis;

import tpe.oo.metropolis.mutant.Mutant;
import tpe.oo.metropolis.mutant.Schurke;
import tpe.oo.metropolis.mutant.Superheld;
import tpe.oo.metropolis.mutant.Syndikat;
import tpe.oo.metropolis.steuer.Finanzamt;

public class Metropolis {

    public static void main(String[] args) {
        Schurke azog = new Schurke("Azog der Schänder","Orkismus", 27990.0, "Wasser");
        Schurke hanni = new Schurke("Hannibal Lecter", "Kannibalismus", 19910, "Feuer");
        Schurke ono = new Schurke("Onox", "Legendismus", 270201, "Blatt");
        Superheld özi = new Superheld("Özkan", 270201, "Blatt");

        Syndikat sy = new Syndikat("Syndikat der Superschurken" , azog,hanni);

        Finanzamt fa = new Finanzamt();

        double d = fa.zahleSteuer(sy);

        d += fa.zahleSteuer(azog);
        d += fa.zahleSteuer(hanni);
        d += fa.zahleSteuer(ono);

        System.out.println("GesamtSteuer:" + d);

        Mutant a = new Mutant();
        a.kämpfe(özi, azog);

    }

}
