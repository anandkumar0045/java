// area and perimeter of the rectangal

import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        System.out.println("Enter the length and breagth");
        Scanner sc = new Scanner(System.in);
                double length = sc.nextInt();
                double breagth = sc.nextInt();

         
//double length ,breagth;
        double perimeter = 2*(breagth + length);
        double area = breagth*length;
        System.out.println("rectangal of perameter:" +perimeter);
        System.out.println("rectangal of area:" +area);
//area and circumference of circle

        double radius = sc.nextInt();
        //System.out.println("area of circle:");
        double area1 = 3.14*radius*radius;
        System.out.println("area of circle:" +area1);
        double circumference = 2*3.14*radius;
        System.out.println("circumferenceof circle" +circumference);
    }
}
