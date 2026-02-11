import java.util.Scanner;

public class Power {
    public static double RaiseToPower(double x, double y){
        double Pow = 1;
        for(double i = 1;i<=y;i++){
            Pow = Pow*x;
        }
        return Pow;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double x = sc.nextDouble();
        double n = sc.nextDouble();

        System.out.println(RaiseToPower(x, n));
    }
}
