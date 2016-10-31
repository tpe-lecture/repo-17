package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;
import tpe.oo.interfaces.api.DigitalController;

public class DualShock4 implements DigitalController, AnalogController {

    DigitalController a = new DigitalControllerImpl();
    AnalogController b = new AnalogControllerImpl();

    @Override
    public void up(double percentage) {
        b.up(percentage);

    }

    @Override
    public void down(double percentage) {
        b.down(percentage);
    }

    @Override
    public void left(double percentage) {
        b.left(percentage);
    }

    @Override
    public void right(double percentage) {
       b.right(percentage);
    }

    @Override
    public void up() {
        a.up();
    }

    @Override
    public void down() {
        a.down();
    }

    @Override
    public void left() {
        a.left();
    }

    @Override
    public void right() {
        a.right();
    }

    @Override
    public Point getPosition() {
        Point position = a.getPosition();
        Point position1 = b.getPosition();

        int i = (int) (position.getX() + position1.getX()) ;
        int l = (int) ((int) position.getY() + position1.getY());

        return new Point(i,l);
    }

}
