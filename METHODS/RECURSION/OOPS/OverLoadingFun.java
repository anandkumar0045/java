//Function Overlooping

class Studet{
    int roll_no;

    public void StdentInfo(String name){
        System.out.println(name);
    }
    public void StudentInfo(int roll_no){
        System.out.println(roll_no);
    }
    public void StudentInfo(String name,int rool_no){
        System.out.println(name + " "+ roll_no);
    }

}

public class OverLoadingFun {
    public static void main(String[] args) {
        Studet s1 = new Studet();
        s1.roll_no = 22;

        s1.StudentInfo(s1.roll_no);


    }
    
}
