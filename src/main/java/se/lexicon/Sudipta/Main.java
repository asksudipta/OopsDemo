package se.lexicon.Sudipta;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        double value;
        double value2;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a Height :-");
        value=sc.nextDouble();
        System.out.println("Enter a Width:-");
        value2=sc.nextDouble();


        Rectangle r1=new Rectangle();
       r1.setHeight(value);
        r1.setWidth(value2);
        System.out.println(r1.getHeight());
        System.out.println(r1.getWidth());
        System.out.println(value*value2);

    }
}

