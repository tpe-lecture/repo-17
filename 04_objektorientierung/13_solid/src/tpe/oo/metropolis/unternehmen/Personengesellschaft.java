package tpe.oo.metropolis.unternehmen;

import tpe.oo.metropolis.steuer.Einkommenssteuer;

public class Personengesellschaft extends Unternehmen{

    private double einkommen;

    Personengesellschaft(double einkommen){
        this.einkommen = einkommen;
    }

    public double getEinkommen() {
        return this.einkommen;
    }
}
