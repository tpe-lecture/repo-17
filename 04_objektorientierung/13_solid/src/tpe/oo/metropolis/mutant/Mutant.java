package tpe.oo.metropolis.mutant;

import tpe.oo.metropolis.Metropolis;

public class Mutant extends Metropolis{

    private String name="";
    private double einkommen=0.0;

    public Mutant(){

    }

    public Mutant(String name, double einkommen, String [] superkraft){
        this.name=name;
        this.einkommen = einkommen;
    }

    public Mutant(String name, double einkommen, String schwäche){
        this.name=name;
        this.einkommen = einkommen;
    }

    public String kämpfe(Superheld superheld, Schurke schurke){
        for (int i = 0; i < superheld.getSuperKraft().length; i++) {
            if(superheld.getSuperKraft()[i].equals(schurke.getSchwäche())){
                return "Schurke hat gewonnen!";
            }
        }
        return "Superheld hat gewonnen";
    }
    public String getName(){
        return this.name;
    }

    public double getEinkommen(){
        return this.einkommen;
    }
}
