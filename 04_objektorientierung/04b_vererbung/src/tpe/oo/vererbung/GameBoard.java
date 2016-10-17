package tpe.oo.vererbung;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.image.ImageBase;
import de.smits_net.games.framework.sprite.Sprite;
import de.smits_net.games.framework.sprite.Velocity;

/**
 * Spielfeld.
 */
public class GameBoard extends Board {
// TODO: Von Board ableiten

    /** Alien, das durch das Bild läuft. */
    private AlienSprite alien;

    /** Asteroid. */
    private Sprite asteroid;

    /** Hintergrundbild. */
    private Image background;

    /**
     * Erzeugt ein neues Board.
     */

    private Graphics m;
    
    public GameBoard() {

        // neues Spielfeld anlegen
        super(10, new Dimension(800, 600), Color.BLACK);

        // Hintergrundbild laden
        background = ImageBase.loadImage("assets/background.jpg");


        // TODO: Alien und Asteroid anlegen und positionieren

        asteroid = new Asteroid(this, new Point(100,100));
//        asteroid.setVisible(true);
//        asteroid.setActive(true);


        alien = new AlienSprite(this, new Point(500,500));
//        alien.setVisible(true);
//        alien.setActive(true);

    }

    /**
     * Hintergrund zeichnen.
     */
    protected void drawBackground(Graphics g) {
        g.drawImage(background, 0, 0, null);
    }

    /**
     * Spielfeld neu zeichnen. Wird vom Framework aufgerufen.
     *
     * @param g Der Grafik-Kontext
     */
    public void drawGame(Graphics g) {
      alien.draw(g);
      asteroid.draw(g);
    }

    /**
     * Spielsituation updaten. Wird vom Framework aufgerufen.
     *
     * @return Spiel läuft weiter, solange diese methode <code>true</code>
     *      zurück gibt
     */
    public boolean updateGame() {

        // TODO: Die Objekte bewegen

        // Kollision erkennen
// TODO: Einkommentieren

        boolean tryy = false;
        alien.move();
        asteroid.move();



        if (alien.intersects(asteroid) && alien.isActive()) {
            alien.explode();
            asteroid.stop();
        }
 

        return true;
    }
}
