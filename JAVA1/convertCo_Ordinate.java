
import java.util.Scanner;

public class convertCo_Ordinate {
    public static void main(String[] args) {
        System.out.println("Enter the co--ordinates (x and y):");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        double y = sc.nextInt();

        double r = Math.sqrt(x*x+y*y);
        double phi = Math.atan(y/x);

        System.out.println("r="+r);
        System.out.println("phi =" +phi);


    }
}
