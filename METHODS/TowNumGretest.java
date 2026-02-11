
import java.util.Scanner;

public class TowNumGretest {
    public static void GretestTowNum(int x,int y){
        if(x<y){
            System.out.println("Y is greterthen X");
        }else{
            System.out.println("X is greter then Y");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        GretestTowNum(a, b);
    }
}
