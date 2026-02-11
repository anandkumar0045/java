
import java.util.Scanner;

public class Power1{
    public static int calPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPowerN_1 = calPower(x, n-1);
        int xPowerN = x*xPowerN_1;
        return xPowerN; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x:");
        int x = sc.nextInt();
        System.out.print("Enter value of n:");
        int n = sc.nextInt();
        int power = calPower(x,n);
        System.out.print("X Rise to power Y: "+power);
        
    }
}