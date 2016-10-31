package tpe.oo.interfaces.api;

import java.awt.Point;

public interface AnalogController {

    /**
     * Nach oben bewegen.
     */
    void up(double percentage);

    /**
     * Nach unten bewegen.
     */
    void down(double percentage);

    /**
     * Nach links bewegen.
     */
    void left(double percentage);

    /**
     * Nach rechts bewegen.
     */
    void right(double percentage);

    /**
     * Liefert die aktuelle Position zurück.
     *
     * @return Die Position.
     */
    Point getPosition();
}
