package HomeWork.Milestone1_Methods;

import java.util.Scanner;

/**
 * M1: create methods to calculate area of rectangle, square, triangle, circle
 * in main method, ask user for a selection, depending what he enters, ask the right questions
 * (eg radius for circle, length and breadth for rectangle), and compute and return the right area
 * Created by mcachia on 27/05/2016.
 */
public class CalculateArea {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter choice below to check Area: \n1.Rectangle\n2.Triangle\n3.Square\n4.Circle");
        int areaCalculation = userInput.nextInt();
        CalculateArea ca = new CalculateArea();
        if (areaCalculation == 1) {
            ca.rectangle();
        } else if (areaCalculation == 2) {
            ca.triangle();
        } else if (areaCalculation == 3) {
            ca.square();
        } else if (areaCalculation == 4) {
            ca.circle();
        }
    }

    public void rectangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length:");
        double length = input.nextDouble();
        System.out.println("Enter width:");
        double width = input.nextDouble();
        double areaRectangle = length * width;
        System.out.println("The total area for your rectangle is: " + areaRectangle);
    }

    public void triangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base:");
        double base = input.nextDouble();
        System.out.println("Enter height:");
        double height = input.nextDouble();
        double areaTriangle = (base * height) / 2;
        System.out.println("The total area for your triangle is: " + areaTriangle);
    }

    public void square() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side length:");
        double side = input.nextDouble();
        double areaSquare = side * 2;
        System.out.println("The total area for your square is: " + areaSquare);
    }

    public void circle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius:");
        double radius = input.nextDouble();
        double areaCircle = radius * radius * Math.PI;
        System.out.println("The total area for your circle is: " + areaCircle);
    }
}
