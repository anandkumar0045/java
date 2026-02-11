public class peparsize {
    public static void main(String[] args) {
        int length  = 1189;
        int width = 841;
        for (int i = 0; i <= 8; i++) {
            System.out.println("A"+i+":" +length +"x" +width);
            int temp = length;
            length = width;
            width = temp/2;
        }
    }
}
