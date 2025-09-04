package oop.ocp;

/**
 * AreaCalculator class that uses polymorphism.
 * It calls the calculateArea() method of the given shape.
 * 
 * OCP: This class does NOT need to be modified when new shapes are added.
 * New shapes just need to extend Shape and implement calculateArea().
 */
public class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}
