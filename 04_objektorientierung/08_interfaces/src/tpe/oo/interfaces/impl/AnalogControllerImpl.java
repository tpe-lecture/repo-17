package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;

public class AnalogControllerImpl implements AnalogController {

    private Point position = new Point(0, 0);
    private double posX = 0.0;
    private double posY = 0.0;

    @Override
    public void up(double percentage) {
        this.posY = this.posY - percentage;

    }

    @Override
    public void down(double percentage) {
        this.posY = this.posY + percentage;


    }

    @Override
    public void left(double percentage) {
        this.posX = this.posX - percentage;

    }

    @Override
    public void right(double percentage) {
        this.posX = this.posX + percentage;

    }

    @Override
    public Point getPosition() {
        this.position = new Point ((int)posX, (int)posY);
        return (Point) this.position.clone();

    }



}
