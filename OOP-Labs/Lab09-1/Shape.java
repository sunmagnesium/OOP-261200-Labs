package oop.ocp;

/**
 * Abstract Shape class.
 * Each concrete shape must implement its own way of calculating area.
 * This follows OCP: We can add new shapes without modifying existing code.
 */
public abstract class Shape {
    public abstract double calculateArea();
}
