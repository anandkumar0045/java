
import java.util.Scanner;

public class sumdigit {
    public static void main(String[] args) {
        System.out.println("Enter the 5 digit number:");
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int sumdigit = 0;
    //     for(int i=n;i>10;i++){
    //         sumdigit += n%10;
    //         n = n/10;

    //     }
    //     System.out.println("sum of digit is :" +sumdigit);

    // }
    while (n>0){
        sumdigit += n%10;
        n = n/10;

    }
    System.out.println("sum of digit :" +sumdigit);

}
}
