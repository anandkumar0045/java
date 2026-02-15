
class Pen {

    String color;
    String Type;

    public void write(){
        System.out.println("Write the name of animle of his forest");

    }

    public void printInfo(){
        System.out.println(this.color);
        System.out.println(this.Type);
    }
}
public class OOPs_1{
    public static void main(String[] args) {
        Pen pen1 = new Pen();

        pen1.color = "blue";
        pen1.Type = "gel";

        pen1.write();
        pen1.printInfo();

    }
    
}
