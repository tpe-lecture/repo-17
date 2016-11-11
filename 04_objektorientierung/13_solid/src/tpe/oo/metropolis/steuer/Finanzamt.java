package tpe.oo.metropolis.steuer;

import tpe.oo.metropolis.Metropolis;
import tpe.oo.metropolis.mensch.Mensch;
import tpe.oo.metropolis.mensch.normalBürger;
import tpe.oo.metropolis.mutant.Mutant;
import tpe.oo.metropolis.mutant.Schurke;
import tpe.oo.metropolis.mutant.Syndikat;
import tpe.oo.metropolis.unternehmen.Kapitalgesellschaft;
import tpe.oo.metropolis.unternehmen.Personengesellschaft;

public class Finanzamt extends Metropolis implements Steuer {

    @Override
    public double zahleSteuer(Metropolis buerger) {
        double steuer=0;
        if (buerger instanceof Kapitalgesellschaft
                || buerger instanceof Syndikat) {
            steuer = körperschaftsSteuer(buerger);

        }
        else if (buerger instanceof normalBürger
                || buerger instanceof Personengesellschaft
                || buerger instanceof Schurke) {
            steuer = einkommenSteuer(buerger);
        }
        else if (buerger instanceof Kapitalgesellschaft
                || buerger instanceof Personengesellschaft) {
            steuer = gewerbeSteuer(buerger);
        }
        return steuer;
    }

    // if(buerger instanceof Schurke){
    // return ((Schurke) buerger).getEinkommen()*15/100;

    private double körperschaftsSteuer(Metropolis buerger) {

        if (buerger instanceof Kapitalgesellschaft) {
            return ((Kapitalgesellschaft) buerger).getEinkommen() * 15 / 100;
        }
        else if (buerger instanceof Syndikat) {
            return ((Syndikat) buerger).getEinkommenSumme() * 15 / 100;

        }
        return 0.0;
    }

    private double einkommenSteuer(Metropolis buerger) {
        double einkommen;
        double gesamtSteuer = 0.0;
        if (buerger instanceof normalBürger) {
            einkommen = ((normalBürger) buerger).getEinkommen();
            gesamtSteuer = berechneProgressive(einkommen);
        }
        else if (buerger instanceof Personengesellschaft) {
            einkommen = ((Personengesellschaft) buerger).getEinkommen();
            gesamtSteuer = berechneProgressive(einkommen);
        }
        else if (buerger instanceof Schurke) {
            einkommen = ((Schurke) buerger).getEinkommen();
            gesamtSteuer = berechneProgressive(einkommen);
        }
        return gesamtSteuer;
    }

    public double berechneProgressive(double einkommen) {
        if (einkommen < 20000.0) {
            return einkommen * 0.08;
        }
        else if (einkommen >= 20000 && einkommen < 40000) {
            return (20000.0 * 0.08) + ((einkommen - 20000) * 0.15);
        }
        else if (einkommen >= 40000 && einkommen < 60000) {
            return (20000.0 * 0.08) + (20000.0 * 0.15)
                    + ((einkommen - 40000) * 0.25);
        }
        else if (einkommen >= 60000) {
            return (20000.0 * 0.08) + (20000.0 * 0.15)
                    + (20000.0 * 0.25) + ((einkommen - 60000) * 0.4);
        }
        return einkommen;
    }

    private double gewerbeSteuer(Metropolis buerger) {
        double steuer = 0.0;
        if (buerger instanceof Kapitalgesellschaft) {
            return ((Kapitalgesellschaft) buerger).getEinkommen() * 15 / 100;
        }
        else if (buerger instanceof Personengesellschaft) {
            steuer = ((Personengesellschaft) buerger).getEinkommen() * 15 / 100;
            if (steuer >= 800) {
                steuer -= 800;
            }
        }
        return steuer;
    }

}
