package tpe.oo.polymorphie;

import tpe.oo.polymorphie.tiere.Affe;
import tpe.oo.polymorphie.tiere.Giraffe;
import tpe.oo.polymorphie.tiere.Gorilla;
import tpe.oo.polymorphie.tiere.ZooTier;

/**
 * Simulationsklasse.
 */
public final class ZooSimulation {

    /**
     * Konstruktor.
     */
    private ZooSimulation() {
        // keine Objekte benötigt
    }

    /**
     * Main-Methode.
     *
     * @param args Kommandozeilen-Argumente.
     */
    public static void main(String[] args) {
        Futterstelle futterstelle = new Futterstelle();

        ZooTier[] tiere = new ZooTier[3];
        tiere[0] = new Affe("charlie");
        tiere[1] = new Gorilla("Buck");
        tiere[2] = new Giraffe("Debbie");

        System.out.println(tiere[0]);
        System.out.println(tiere[1]);
        System.out.println(tiere[2]);

        System.out.println("Fütterung...");

        int i = 0;
        while (i < 3) {
            futterstelle.fuetterAlle(tiere[i]);
            i++;
        }

        System.out.println(tiere[0]);
        System.out.println(tiere[1]);
        System.out.println(tiere[2]);
    }
}
