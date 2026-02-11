import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter number of row:"); 
        int n = sc.nextInt();
        int x = 1;

        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                if(i==j||j==i){
                    System.out.print(n);
                    
                }
            }
            System.out.println();
        }
    }
}

