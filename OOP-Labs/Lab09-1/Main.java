package oop.ocp;

public class Main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);
        Shape ellipse = new Ellipse(4, 2);

        System.out.println("Rectangle area: " + calculator.calculateArea(rectangle));
        System.out.println("Circle area: " + calculator.calculateArea(circle));
        System.out.println("Ellipse area: " + calculator.calculateArea(ellipse));

        // If we create a new shape in future, AreaCalculator still works without changes!
    }
}
