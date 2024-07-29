package GB.Seminar_7.CW7.product;

public class Bottle extends Product {
    private double volume;

    public Bottle(String name, double price, double volume) {
        super(name, price); //super всегда на первой позиции
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return super.toString() + ", volume: " + volume + " л.";
    }
}
