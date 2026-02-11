import java.util.Scanner;

public class PowerM2Hight_logn {
    public static int calPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        // n=even
        if(n%2==0){
            return calPower(x, n/2)*calPower(x, n/2);
        }else{
            return calPower(x, n/2)*calPower(x, n/2)*x;
        }
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
