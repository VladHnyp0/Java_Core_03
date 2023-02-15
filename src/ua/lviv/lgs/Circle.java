package ua.lviv.lgs;

public class Circle{
    double radius;
    double diameter;

    Circle() {
        this.radius = 7;
        this.diameter = 14;
    }

    Circle(int radius, int diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    public String circleInfo() {
        return  "Area: " + (3.14 * (radius * radius)) + ", Length: "  + (2 * (3.14 * (diameter / 2 )));
    }

}
