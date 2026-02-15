
// class StudentInfo{
//       String name;
//       String course;
//       int roll_no;

//       public void Student(){
//         System.out.println(this.name);
//         System.out.println(this.course);
//         System.out.println(this.roll_no);
//     }

// StudentInfo(){
//     System.out.println("constructor is call by 2nd");

//     }
// }
// public class Contractor {
//     public static void main(String[] args) {
//         StudentInfo s1 = new StudentInfo();
//         s1.name = "Anand";
//         s1.course = "MCA";
//         s1.roll_no = 140014;

//         s1.Student();
        
//     }
// }




// //class StudentInfo{
// //       String name;
// //       String course;
// //       int roll_no;

// //       public void Student(){
// //         System.out.println(this.name);
// //         System.out.println(this.course);
// //         System.out.println(this.roll_no);
// //     }

// // StudentInfo(String name,String course,int roll_no){
// //         this.name = name;
// //         this.course = course;
// //         this.roll_no = roll_no;
    
// //     }
// // }
// // public class Contractor {
// //     public static void main(String[] args) {
// //         StudentInfo s1 = new StudentInfo("Anand","MCA",140014);
        
// //         s1.Student();
        
// //     }
// // }


class StudentInfo{
      String name;
      String course;
      int roll_no;

      public void Student(){
        System.out.println(this.name);
        System.out.println(this.course);
        System.out.println(this.roll_no);
    }

StudentInfo(StudentInfo s2){
        this.name = s2.name;
        this.course = s2.course;
        this.roll_no = s2.roll_no;
    
    }
    StudentInfo() {
    }
}
public class Contractor {
    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo();
        
        s1.name = "Anand";
        s1.course = "MCA";
        s1.roll_no = 140014;

        s1.Student();

        StudentInfo s2 = new StudentInfo(s1);
        s2.Student();
    }
}
