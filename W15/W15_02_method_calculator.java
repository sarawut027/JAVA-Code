package W15;
import java.util.Scanner;
public class W15_02_method_calculator {
    // ทั้งหมดเป็น method ที่มีการรับค่าและคืนค่า
    // 0) method รับค่าคีย์บอร์ด
    
    // 1) Method สำหรับบวกเลข
    static int add(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
        return a + b;
    }

    // 2) Method สำหรับลบเลข
    static int subtract(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
        return a-b;
    }
    // 3) Method สำหรับคูณเลข
    static int multiply (int a,int b) {
        System.out.println(a + " * " + b + " = " + (a * b));
        return a*b;
    }
    // 4) Method สำหรับหารเลข
    static int devide(int a, int b) {
        System.out.println(a + " / " + b + " = " + (a / b));
        return a / b;
    }
    public static void main(String[] args) {
         // 0) method รับค่าคีย์บอร์ด
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        sc.close();
        // 1) Method สำหรับบวกเลข
        //System.out.println("sum of numbers : " + add(55,5));
        add (a,b);
        // 2) Method สำหรับลบเลข
        //System.out.println("subtract of numbers : " + subtract(55,5));
        subtract(a,b);
        // 3) Method สำหรับคูณเลข
        //System.out.println("multiply of numbers : " + multiply (55,5));
        multiply(a,b);
        // 4) Method สำหรับหารเลข
        //System.out.println("devide of numbers : " + devide (55,5));
        devide(a,b);
    }


}