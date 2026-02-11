
import java.util.Scanner;

public class Avg {
    public static double avrage(double a, double b, double c){
        double avrage = (a+b+c)/3;
        return avrage;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x =sc.nextDouble();
        double y =sc.nextDouble();
        double z =sc.nextDouble();
        // avrage(x, y, z);
        
        System.out.println(avrage(x, y, z));
    }
}
