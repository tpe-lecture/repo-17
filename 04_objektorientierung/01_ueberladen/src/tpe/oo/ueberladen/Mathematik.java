package tpe.oo.ueberladen;

/**
 * Einfache Hilfsklasse mit mathematischen Methoden.
 */
public final class Mathematik {

    /**
     * Konstruktor.
     */
    private Mathematik() {
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    public static int max(int a, int b, int c) {

        if (a > b && a > c) {
            return a;
        }
        else if (b > a && b > c){
            return b;
        }
        else {
            return c;
        }
    }

    public static int max(int a, int b, int c, int d) {

        if (a > b && a > c && a > d) {
            return a;
        }
        else if (b > a && b > c && b > d){
            return b;
        }
        else if (c > a && c > b && c > d){
            return c;
        }
        else {
            return d;
        }
    }
}
