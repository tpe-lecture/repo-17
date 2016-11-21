package tpe.enumeration.own.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tpe.enumeration.own.Wuerfel;
import tpe.enumeration.own.WuerfelTyp;

/**
 * Test für die Würfel.
 */
public class TestWuerfel {

    /** Anzahl der Durchläufe (Gesetz der großen Zahl!). */
    private static final int RUNS = 10000000;

    @Test
    public void testAlles(){
        for(WuerfelTyp würfel : WuerfelTyp.values()){
            internalTestFairness(new Wuerfel(würfel), würfel.average(würfel));
        }
    }

    /**
     * Interne Hilfsmethode, um die Fairness zu testen.
     *
     * @param würfel der zu testende Wuerfel.
     * @param expected Erwartungswert.
     */
    private void internalTestFairness(Wuerfel würfel, double expected) {

        long sum = 0;

        for (int i = 0; i < RUNS; i++) {
            sum += würfel.roll();
        }

        double average = (double) sum / (double) RUNS;

        assertEquals(expected, average, 0.1);
    }
}
