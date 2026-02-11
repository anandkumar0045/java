
import java.util.Scanner;

public class EligibleForVote {
    public static void Age(int Age){
        if(Age>=18){
            System.out.println("Eligible For Vote ");
        }else{
            System.out.println("Not Eligible For Vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age");
        int Age = sc.nextInt();

        Age(Age);
    }
}
