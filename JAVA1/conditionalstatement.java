
import java.util.Scanner;

public class conditionalstatement {
    public static void main(String[] args) {
        System.out.println("Enter the age:");
        Scanner sc = new Scanner(System.in);
        
        //System.out.println("Enter the age:");
        int age = sc.nextInt();
        
        if(age  > 18){
            System.out.println("adult");
            
        }else{
            System.out.println("not adult");
        }
    }
    
}
