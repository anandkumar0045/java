
import java.util.Scanner;


public class FibonacciTerm {
    public static void TearmOfFibo(int a,int b,int n){
        if(n==0){
          return;
        }
        int c = a+b;
        System.out.println(c);
        TearmOfFibo(b, c, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of term:");
        int n = sc.nextInt();
        int a = 0;
        System.out.println(a);
        int b = 1;
        System.out.println(b);
        TearmOfFibo(a, b, n-2);

    }
}

