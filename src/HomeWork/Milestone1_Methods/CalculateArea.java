package HomeWork.Milestone1_Methods;

import java.util.Scanner;

/**
 * Created by mcachia on 27/05/2016.
 */
public class CalculateArea {
    public static void main(String[] args) {


    }

    public static void rectangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length:");
        double length = input.nextDouble();
        System.out.println("Enter width:");
        double width = input.nextDouble();
        double areaRectangle = length * width;
        System.out.println("The total area for your rectangle is: " + areaRectangle);
    }

    public static void triangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base:");
        double base = input.nextDouble();
        System.out.println("Enter height:");
        double height = input.nextDouble();
        double areaTriangle = (base * height) / 2;
        System.out.println("The total area for your triangle is: " + areaTriangle);
    }

    public static void square() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side length:");
        double side = input.nextDouble();
        double areaSquare = side * 2;
        System.out.println("The total area for your square is: " + areaSquare);
    }

    public static void circle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius:");
        double radius = input.nextDouble();
        double areaCircle = radius * radius * Math.PI;
        System.out.println("The total area for your circle is: " + areaCircle);
    }
}
