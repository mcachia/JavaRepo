package HomeWork.Milestone1_SwitchCase;

import java.util.Scanner;

/**
 * Created by mcachia on 26/05/2016.
 */

public class CalculateArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter choice below for Area Calculation : \n1.Rectangle\n2.Triangle\n3.Square\n4.Circle\nEnter choice here: ");
        int areaCalculator = input.nextInt();

        switch (areaCalculator) {
            case 1:
                double length, width, areaRectangle;
                System.out.println("Enter length for rectangle:");
                length = input.nextDouble();
                System.out.println("Enter width for rectangle:");
                width = input.nextDouble();
                areaRectangle = length * width;
                System.out.println("The total area for the rectangle is: " + areaRectangle);
                break;

            case 2:
                double base, height, areaTriangle;
                System.out.println("Enter base for triangle:");
                base = input.nextDouble();
                System.out.println("Enter width for triangle:");
                height = input.nextDouble();
                areaTriangle = (base * height) / 2;
                System.out.println("The total area for the triangle is: " + areaTriangle);
                break;

            case 3:
                double side, areaSquare;
                System.out.println("Enter side for square:");
                side = input.nextDouble();
                areaSquare = side * 2;
                System.out.println("The total area for the square is: " + areaSquare);
                break;
            case 4:
                double radius, areaCircle;
                System.out.println("Enter radius for circle:");
                radius = input.nextDouble();
                areaCircle = radius * radius * Math.PI;
                System.out.println("The total area for the circle is: " + areaCircle);
                break;
        }
    }
}



