// ตรวจสอบคำนำหน้าชื่อ
// ด.ญ. ด.ช. นาย นาง นางสาว
// ถ้าเป็น ด.ญ. หรือ นางสาว ให้แสดงข้อความว่า "เป็นผู่หญิง"
// ถ้าเป็น ด.ช. หรือ นาย ให้แสดงข้อความว่า "เป็นผู้ชาย"
// อายุ
// ถ้าอายุน้อยกว่า 15 ให้แสดงข้อความว่า "เด็ก"
// สถานะสมรส

// เพศ อายุ สถานะสมรส

package W10;

import java.util.Scanner;

public class W10_04_Status {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("ระบุเพศ (male/female): ");
        String gender = kb.next();
        System.out.print("อายุ: ");
        int age = kb.nextInt();
        System.out.print("สถานะสมรส (single/married): ");
        String isMarried = kb.next();

        if(gender.equalsIgnoreCase("male")){
            //เป็นผู้ชาย ดช. หรือ นาย
            if (age<15){
                System.out.println("เด็กชาย");
            }else{
                System.out.println("นาย");
            }
        }else{
            //เป็นผู้หญิง ดญ. หรือ นาง
            if (age < 15){
                System.out.println("เด็กหญิง");
            }else if (isMarried.equalsIgnoreCase("married")){
                System.out.println("นาง");
            }else{
                System.out.println("นางสาว");
            }
        }

        kb.close();
    }
}