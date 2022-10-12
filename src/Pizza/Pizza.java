package Pizza;

public class Pizza {
    double price;
    Ishape shape;
    public Pizza(double p, Ishape s){
        this.price = p;
        this.shape = s;
    }

    public double getPrice() {
        return price;
    }

    public Ishape getShape() {
        return shape;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "price=" + price +
                ", shape=" + shape +
                '}';
    }
}
