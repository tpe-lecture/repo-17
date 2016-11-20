package tpe.oo.polymorphie;

import tpe.oo.polymorphie.tiere.ZooTier;

/**
 * Fütterung der Tiere.
 */
public class Futterstelle {


    /**
     *Füttert alle Tiere die hunrig sind.
     * @param tiere alle tiere werde gleichzeitig gefüttert.
     */

    public void fuetterAlle(ZooTier tiere) {
        tiere.fuettern();
    }

}
