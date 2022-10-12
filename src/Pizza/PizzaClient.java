package Pizza;

public class PizzaClient {
    public void run() {
        Pizza circle1 = new Pizza(10, new Circle(7) {
            @Override
            public double getPerimeter() {
                return 0;
            }
        });
        Pizza rectangle1 = new Pizza(6.5, new Rectangle(8, 9));
        PizzaDeal gia1 = new PizzaDeal();
        System.out.println(circle1 + " re hon " + rectangle1 + ": " + gia1.betterDeal(circle1, rectangle1));
    }
    public static void main(String[] args) {
        new PizzaClient().run();
    }
}

