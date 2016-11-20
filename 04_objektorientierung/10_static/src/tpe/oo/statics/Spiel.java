package tpe.oo.statics;

/**
 * Spiel mit den Würfeln.
 */
public final class Spiel {

    /** Keine Objekte. */
    private Spiel() {
        // leer
    }

    /**
     * Programm-Einstieg.
     *
     * @param args Kommandozeilen-Argumente.
     */
    public static void main(String[] args) {
        Wuerfel wuerfel1 = new Wuerfel();
        Wuerfel wuerfel2 = new Wuerfel();

        // 1000 Mal würfeln
        for (int i = 0; i < 1000; i++) {
            wuerfel1.wuerfele();
            wuerfel2.wuerfele();
        }

        // Statistik ausgeben
        System.out.println("Statistik für alle Würfeln");
        System.out.println(Wuerfel.statistik());
    }
}
