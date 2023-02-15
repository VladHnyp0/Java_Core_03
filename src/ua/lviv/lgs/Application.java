package ua.lviv.lgs;

public class Application {
    public static void main(String[] args) {
        // ---- 1 ---- //
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10, 15);

        System.out.println("r1 - " + r1.rectangleInfo());
        System.out.println("r2 - " + r2.rectangleInfo());

        // ---- 2 ---- //
        Circle c1 = new Circle();
        Circle c2 = new Circle(3, 6);

        System.out.println("c1 - " + c1.circleInfo());
        System.out.println("c2 - " + c2.circleInfo());
    }
}
