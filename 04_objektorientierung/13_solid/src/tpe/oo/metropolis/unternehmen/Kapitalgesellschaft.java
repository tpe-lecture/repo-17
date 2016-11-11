package tpe.oo.metropolis.unternehmen;

import tpe.oo.metropolis.Metropolis;
import tpe.oo.metropolis.steuer.Körperschaftssteuer;

public class Kapitalgesellschaft extends Unternehmen {

    private double einkommen;

    Kapitalgesellschaft(double einkommen){
        this.einkommen = einkommen;
    }

    public double getEinkommen(){
        return this.einkommen;
    }

}
