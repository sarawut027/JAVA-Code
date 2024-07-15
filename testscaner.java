import java.util.Scanner;
public class testscaner {

    public static void main(String[] args) {
        Scanner keybord = new Scanner(System.in);
        //ตัวแปรจากแป้น
        
        double PI = 3.14159;
        //ตัวแปร PI 
        
        System.out.println("please Enter radius");
        //โชว์ตัว please Enter radius

        Double radius = keybord.nextDouble();
        //รับข้อมูลradius มาคำนวน

        double result = PI*radius*radius;

        System.out.println("area circle is:"+ result);
        


    }
}

