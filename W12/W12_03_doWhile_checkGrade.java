package W12;

import java.util.Scanner;

public class W12_03_doWhile_checkGrade {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int score;  // ประกาศตัวแปรเพื่อเก็บค่าที่ผู้ใช้ป้อน
       // ให้ผู้ใช้ป้อนข้อมูลซ้ำจนกว่าจะถูกต้อง
        do {
            System.out.println("Enter Score between 1 and 100: ");
            score = kb.nextInt(); //รับค่าคีย์บอร์ดเก็บไว้ในตัวแปร score
        // แสดงข้อความให้ผู้ใช้ป้อนข้อมูล between 1 and 100:
        // รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร number
        } while(score<1 || score > 100);   // ถ้าผู้ใช้ป้อนไม่ถูกต้องให้ป้อนใหม่
        if (score <= 49 ) {
            System.out.println("Your grade is F");
        } else if (score >= 50 && score <= 54 ){
            System.out.println("Your grade is D");
        } else if (score >= 55  && score <= 59 ){
            System.out.println("Your grade is D+");
        } else if (score >= 60  && score <= 64 ){
            System.out.println("Your grade is C");
        } else if (score >= 65 && score <= 69 ){
            System.out.println("Your grade is C+");
        } else if (score >= 70 && score <= 74 ){
            System.out.println("Your grade is B");
        } else if (score >= 75 && score <= 79 ){
            System.out.println("Your grade is B+");
        } else if (score >= 80 && score <= 84 ){
            System.out.println("Your grade is A");
        } else if (score >= 85 && score <= 89 ){
            System.out.println("Your grade is A+");
        } else if (score >= 90 && score <= 100 ){
            System.out.println("Your Good Grade:D");
        } else if (score <=0 ){
            System.out.println("กรุณากรอกคะแนนใหม่");
        } else if (score >= 100) {
            System.out.println("agian");
        } else {
            System.out.println("wrong score.");
        }

            System.out.println(" Your score is " + score);
        // แสดงข้อมูลที่ผู้ใช้ป้อน เช่น ou entered: 75

        // ตรวจสอบเกรด

        kb.close(); // ปิด Scanner object
    }
}