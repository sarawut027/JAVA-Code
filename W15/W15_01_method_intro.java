// การสร้าง method ประกอบด้วยส่วนต่าง ๆ ดังนี้:

// ประเภทการคืนค่า (Return type): สิ่งที่ method จะคืนค่ากลับมา เช่น int, double, void (ไม่คืนค่า)
// ชื่อ method: ชื่อที่ใช้ในการเรียก method
// พารามิเตอร์ (Parameters): ข้อมูลที่ส่งเข้าไปให้ method ทำงาน (อาจมีหรือไม่มี)
// เนื้อหาของ method: คำสั่งที่ method จะดำเนินการ
// ==============================================================
    // returnType methodName(parameters) {
    //     // คำสั่งที่ต้องการให้ทำงาน
    //     return value; // ถ้ามีการคืนค่า
    // }
// ==============================================================
    
package W15;

public class W15_01_method_intro {
    //1. ที่ไม่มีการรับค่าและคืนค่า
    static void printHello() {
        System.out.println("Hello World!");
    }
    //2. ที่รับค่า แต่ไม่คืนค่า
    static void printname(String name) {
        System.out.println("Hello " + name);
    }
    //3. ที่ไม่รับค่า แต่คืนค่า
    static String getITname() {
        return "IT";
    }
    //4. ที่รับค่าและคืนค่า
    static int add (int a, int b){
        //System.out.println(a + " + " + b + " = " + (a+b));
        System.out.print(a + " + " + b + " = ");
        return a+b;
    }
    //5. Method เส้นแบ่ง ที่ไม่มีการรับค่าและคืนค่า
    static void line () {
        System.out.println("--- --- --- --- --- --- --- --- --- --- --- ---");
    }
    public static void main(String[] args) {
        //1. ที่ไม่มีการรับค่าและคืนค่า
        printHello();
        line();
        //2. ที่รับค่า แต่ไม่คืนค่า
        printname("YxDUZI");
        printname("T.Suksawat");
        line();
        //3. ที่ไม่รับค่า แต่คืนค่า
        System.out.println("my major is " + getITname());
        getITname();
        line();
        //4. ที่รับค่าและคืนค่า
        //System.out.println("6 + 3 = " + add (6, 3));
        System.out.println(add(12,33));
        line();
        //5. Method เส้นแบ่ง ที่ไม่มีการรับค่าและคืนค่า
        System.out.println("5. Method line");
        line();
    }
}