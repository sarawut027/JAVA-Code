import java.util.Scanner;
public class testscaner4 {
    public static void main(String[] args) {
        Scanner keybord = new Scanner (System.in);
        double PI = 3.14159;
        System.out.println("ใส่ค่ามาวัยรุ่นนน");

        Double radius = keybord.nextDouble();

        Double result = PI*radius*radius;
        System.out.println("ค่าของวงกลมเท่ากับ"+result+"เท่านี้นะเว้ย");
    }
    
}
