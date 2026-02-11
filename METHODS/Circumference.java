
import java.util.Scanner;

public class Circumference {
    public static double CircumferenceCircle(double r) {
        double Circumference = 2*3.14*r;
        return Circumference;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius ");
        double r = sc.nextDouble();
        
        System.out.println(CircumferenceCircle(r));

    }
}
