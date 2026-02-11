
import java.util.Scanner;

// conver temp farenahit to celsious 

public class temperature {
    public static void main(String[] args) {
        //System.out.println("Enter the temp in celsious :");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the tempreture in farenaite:");
        double Fah = sc.nextDouble();

        double celsious = (Fah - 32)*5/9;

        System.out.println(celsious);


    }
}
