package W12;

import java.util.Scanner;   // นำเข้าคลาส Scanner

public class W12_04_doWhile_selectMenu {
    public static void main(String[] args) {
        // ประกาศ Scanner object
        Scanner kb = new Scanner(System.in);
        // ประกาศตัวแปรเพื่อเก็บค่าที่ผู้ใช้เลือก
        int choice;
        // ให้ผู้ใช้เลือกเมนูซ้ำจนกว่าจะเลือกออก ใช้ do-while
            // เงื่อนไขคือ วนลูปไปเรื่อยๆ จนกว่าผู้ใช้จะเลือก 3
        

        do {
            // แสดงเมนู
            System.out.println("====================================");
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Exit");
            System.out.println("====================================");
           
            choice = kb.nextInt();
            System.out.println("------------------------------------");

            // ตรวจสอบเมนูที่ผู้ใช้เลือก
            switch (choice) {
                case 1:     // ถ้าผู้ใช้เลือก 1
                    System.out.print("Enter the first number: ");
                    int num1 = kb.nextInt();
                    System.out.print("Enter the second number: ");
                    int num2 = kb.nextInt();
                    int sum = num1 + num2;
                    System.out.println("The Addition is : " + sum);
                    break; // ออกจาก switch
                case 2 :    // ถ้าผู้ใช้เลือก 2
                    System.out.print("Enter the first number: ");
                    int num3 = kb.nextInt();
                    System.out.print("Enter the second number: ");
                    int num4 = kb.nextInt();
                    int sub = num3 - num4;
                    System.out.println("The Subtraction is : " + sub);
                    break; // ออกจาก switch
                case 3 :    // ถ้าผู้ใช้เลือก 3
                 System.out.println("Exit");
                    break; // ออกจาก switch
                default :   // ถ้าผู้ใช้เลือกเมนูที่ไม่ถูกต้อง
                    System.out.println("Invalid choice. Please try again. ");
            }
        }while(choice != 3);
            // แสดงเมนู
            
            
            // รับค่าเลือกเมนู
                // แสดงข้อความให้ผู้ใช้ป้อนเลือกเมนู Enter your choice:
                // รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร choice
            
            
            
      
             


        // ตรวจสอบเมนูที่ผู้ใช้เลือก
        //switch () {
            //case 1:     // ถ้าผู้ใช้เลือก 1
                //System.out.print("Enter the first number: ");
                // รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร num1
                // รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร num2
                // คำนวณผลรวม
                // แสดงผลรวม
                // ออกจาก switch
            //case 2:
            
            // 3:
            //
            //default:    // ถ้าผู้ใช้เลือกเมนูอื่น
                // แสดงข้อความเลือกเมนูไม่ถูกต้อง
       // }

        // ปิด Scanner object
    }  
}