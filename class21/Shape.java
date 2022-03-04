package class21;

public class Shape {

    int radius;

    public Shape(int radius) {
        this.radius = radius;
    }
}
class Circle extends Shape {

    public Circle(int radius) {
        super(radius);
    }

    void area() {

        System.out.println(super.radius * super.radius * Math.PI);
    }
}
            class Tester1 {
                public static void main(String[] args) {
                    new Circle(2).area();
                }
            }

