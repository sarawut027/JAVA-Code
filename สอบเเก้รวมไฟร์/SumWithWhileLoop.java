import java.util.Scanner;

public class SumWithWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int number;

        // เริ่มต้นลูป
        System.out.println("กรุณาใส่จำนวนเต็ม (กรอก 0 เพื่อสิ้นสุด): ");
        while (true) {
            number = scanner.nextInt();
            
            if (number == 0) {
                break; // จบลูปเมื่อผู้ใช้กรอก 0
            }

            total += number; // หาผลรวม
        }
        System.out.println("ผลรวมของตัวเลขทั้งหมดคือ: " + total);
    }
}