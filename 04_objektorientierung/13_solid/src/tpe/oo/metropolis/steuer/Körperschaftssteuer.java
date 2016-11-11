package tpe.oo.metropolis.steuer;

public interface Körperschaftssteuer extends Steuer {

    public final double STANDARD_STEUER=15.0;

    void zahleSteuer(double STANDARD_STEUER);
}
