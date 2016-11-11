package tpe.oo.metropolis.mensch;

import tpe.oo.metropolis.steuer.Einkommenssteuer;

public class normalBürger extends Mensch {

    private double einkommen;

    normalBürger(double einkommen){
        this.einkommen = einkommen;
    }

    public double getEinkommen() {
        return this.einkommen;
    }

}
