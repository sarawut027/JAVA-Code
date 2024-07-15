import java.util.Scanner;

public class testcaner3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Double PI = 3.14159;
        System.out.println("ใส่ค่ามาเลยยยยยย");

        double radius = kb.nextDouble();

        double result = PI*radius*radius;
        System.out.println("วงกลมของคุณเท่ากับ"+result+"เซนติเมตรรรรรรรร");
    }
    
}
