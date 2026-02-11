
import java.util.Scanner;

public class SumNnum {
    public static void SumNum(int n, int Sum){ 
        if(n==0){
            System.out.println(Sum);
            return;
        }
        Sum += n;
        SumNum(n-1, Sum); 
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        int sum = 0;
        SumNum(n,sum);
    }    
}
