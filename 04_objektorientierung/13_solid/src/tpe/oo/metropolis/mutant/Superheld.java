package tpe.oo.metropolis.mutant;

public class Superheld extends Mutant {

    public String [] superKraft;

    public Superheld(String name, double einkommen, String...superKraft) {
        super(name, einkommen, superKraft);

    }

    public String [] getSuperKraft(){
        return superKraft;
    }
}
