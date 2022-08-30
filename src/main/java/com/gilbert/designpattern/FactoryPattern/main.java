package com.gilbert.designpattern.FactoryPattern;

import com.gilbert.designpattern.FactoryPattern.base.SHAPE_TYPE;
import com.gilbert.designpattern.FactoryPattern.base.Shape;
import com.gilbert.designpattern.FactoryPattern.base.ShapeFactory;

public class main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape(SHAPE_TYPE.CIRCLE);

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape(SHAPE_TYPE.RECTANGLE);

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape(SHAPE_TYPE.SQUARE);

        //call draw method of square
        shape3.draw();
    }
}
