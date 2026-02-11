
import java.util.Scanner;

public class SumOddNum {
    public static void SumOddNum1(int x) {
        int sum = 0;

        for(int i=1;i<=x;i++){
            if(i%2 != 0){
                sum +=i;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        SumOddNum1(n);

    }
}
