package W10;
import java.util.Scanner;
public class W10_03_Login {
    public static void main(String[] args) {
        
        //สร้างตัวแปรเก็บชื่อผู้ใช้และรหัสผ่าน
        String username = "admin";
        String password = "1234";

        //สร้างตัวแปรเก็บ Username และ Password ที่ผู้ใช้ป้อนเข้ามา
        Scanner kb = new Scanner(System.in);

        System.out.print("ป้อนชื่อผู้ใช้ : ");
        String inputusername = kb.nextLine();

        System.out.print("ป้อนรหัสผ่าน : ");
        String inputpassword = kb.nextLine();

        //ตรวจสอบว่า Username และ Password ที่ป้อนเข้ามาตรงกับตัวแปรที่สร้างไว้
        //if (username == inputusername && password == inputpassword) {
        //if เมื่อเป็น String จะต้องใช้ .equals() ในการตรวจสอบ จะแม่นกว่าเสมอ 
        if (username.equals(inputusername) && password.equals(inputpassword)) {
        System.out.print ("เข้าสู่ระบบสำเร็จ");
        } 
        //else if (username.equals(inputusername) && password != inputpassword) {
        //System.out.print("รหัสผ่านไม่ถูกต้อง");
        //} 
        //else if (username != inputusername && password.equals(inputpassword)) {
        //System.out.print("ชื่อผู้ใช้ไม่ถูกต้อง");
         else {
            if (!username.equals(inputusername)&&password.equals(inputpassword))
            System.out.println("ชื่อผู้ใช้ไม่ถูกต้อง");
            else if (!password.equals(inputpassword)&&username.equals(inputusername)) 
            System.out.println("รหัสผ่านไม่ถูกต้อง");
            else 
            System.out.println("ชื่อผู้ใช้และรหัสผ่านไม่ถูกต้อง");
        }
        }   
    }


