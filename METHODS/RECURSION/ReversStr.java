
import java.util.Scanner;


public class ReversStr {
    public static void PrintRev(String str,int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        PrintRev(str,idx-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        PrintRev(str,str.length()-1);
    }
}
