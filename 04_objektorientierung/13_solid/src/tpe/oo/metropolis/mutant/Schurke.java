package tpe.oo.metropolis.mutant;

import tpe.oo.metropolis.steuer.Einkommenssteuer;

public class Schurke extends Mutant {

    private String mutation;
    private String schwäche;

    public Schurke(String name, String mutation, double einkommen, String schwäche) {
        super(name, einkommen, schwäche);
        this.mutation = mutation;
    }


    public String getMutation() {
        return this.mutation;
    }

    public void setSchwäche(String schwäche){
        this.schwäche=schwäche;
    }

    public String getSchwäche(){
        return this.schwäche;
    }

}
