package Time;

public class test {
    public static void main(String[] args) {
        Times t = new Times(8, 46, 6);
        t.display();
        t.setTime(8, 48, 20);
        t.display();
        t.nextSecond();
        t.display();
        t.nextSecond();
        t.display();
        t.setTime(8, 50, 2);
        t.display();
        t.previousSecond();
        t.display();
    }
}
