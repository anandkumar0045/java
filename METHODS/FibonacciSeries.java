
import java.util.Scanner;

public class FibonacciSeries {
    public static void SumOfFibonacci(int n){
        //a and b first and secound number
        int a=0;
        int b=1;
        int c;
        int Sum =0;
         if(n<0){
            System.out.println("Invalid tearm ");
        }else {
            for(int i=1;i<=n;i++){
                Sum +=a;
                c = a+b;
                a = b;
                b = c;

            }
            System.out.println(Sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of tearm:");
        int n = sc.nextInt();

        SumOfFibonacci(n);
    }
}
