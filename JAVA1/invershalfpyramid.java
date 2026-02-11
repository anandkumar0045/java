import java.util.Scanner;

public class invershalfpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row:");
        int a = sc.nextInt();
        // System.out.print("Enter the colum:");
        // int b = sc.nextInt();
        for(int i=a;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    
}