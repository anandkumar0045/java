
import java.util.Scanner;

public class Factorial {
    public static int Factorial1(int n){
        if(n==0||n==1){
            return 1;
        }
        int factN_1 = Factorial1(n-1);
        int factN = n*(factN_1);
        return factN;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        int ans = Factorial1(n);
        System.out.println(ans);
    }
}
