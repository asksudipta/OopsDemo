package se.lexicon.Sudipta;

import java.util.Scanner;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle(double height,double width){
        this.height=height;
        this.width=width;
    }


    public Rectangle(){
    }

    public void getArea(){
        System.out.println(height * width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
