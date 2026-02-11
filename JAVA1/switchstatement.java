
import java.util.Scanner;

public class switchstatement {
    public static void main(String[] args, int Button) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
         
        switch(button){
         case 1:
            System.out.println("namaste");
            break;
         case 2:
            System.out.println("hello");
            break;
         case 3:
            System.out.println("banjor");
            break;
         default:
            System.out.println("invalid butto");
        }
    }
    
}
