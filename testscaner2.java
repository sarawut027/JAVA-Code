import java.util.Scanner;
public class testscaner2 {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);

        double PI = 3.14159;
        System.out.println("ใส่ค่ามาวัยรุ่น");
        Double radius = kb.nextDouble();

        double result = PI*radius*radius;
        System.out.println("ค่าของคุณคือ"+result+"เท่านี้เลยอิอิ");


    }
}
