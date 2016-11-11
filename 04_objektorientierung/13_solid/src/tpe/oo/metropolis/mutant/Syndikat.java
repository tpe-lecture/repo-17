package tpe.oo.metropolis.mutant;

import tpe.oo.metropolis.Metropolis;
import tpe.oo.metropolis.steuer.Körperschaftssteuer;

public class Syndikat extends Metropolis {

    private Schurke [] schurken;
    private String clanName;
    private double einkommen;

    public Syndikat(String clanName,Schurke...schurken){
        this.clanName=clanName;
        this.schurken = schurken;
    }

    public String [] getSchurkenNamen(){
        String schurkenNamen [] = new String[schurken.length];

        for (int i = 0; i < schurkenNamen.length; i++) {
            schurkenNamen[i] = schurken[i].getName();
        }
        return schurkenNamen;
    }

    public String clanName(){
        return this.clanName;
    }

    public double getEinkommenSumme(){

        for (int i = 0; i < schurken.length; i++) {
            einkommen += schurken[i].getEinkommen();
        }
        return einkommen;
    }

}
