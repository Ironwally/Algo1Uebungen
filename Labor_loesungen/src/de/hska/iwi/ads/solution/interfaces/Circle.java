package de.hska.iwi.ads.solution.interfaces;

import de.hska.iwi.ads.interfaces.AbstractCircle;
import de.hska.iwi.ads.interfaces.Vector;

import static java.lang.Math.sqrt;

public class Circle extends AbstractCircle {

    //Constructors
    public Circle(double radius) { super(radius); }
    public Circle(Vector middlePoint, double radius) { super(middlePoint, radius); }

    //Overrides
    @Override
    public void scale(double factor) {
        if(factor>1) radius += factor;
        else if (0<=factor) radius -= factor; // 0<=factor<1
    }

    @Override
    public double getDimension() {
        return getRadius();
    }

    @Override
    public double area() {
        return sqrt(this.getRadius())*Math.PI;
    }
}
