package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
public class Area {
    public static void main(string[] args){
        Scanner input = new Scanner(System.in);
        System.out.printIn("Enter a radius");
        double radius = input.nextDouble();
        Double areaOfCircle = Circle.getArea(radius);
        System.out.printIn("The area of a circle " + radius + "is: " + areaOfCircle);

    }
}
