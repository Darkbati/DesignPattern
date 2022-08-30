package com.gilbert.designpattern.FactoryPattern.base;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
