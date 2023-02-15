package ua.lviv.lgs;

public class Rectangle {
    int length;
    int width;

    Rectangle() {
        this.length = 4;
        this.width = 5;
    }

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public String rectangleInfo() {
        return  "Perimeter: " + ((length + width) * 2) + ", Area: "  + (length * width);
    }

}
