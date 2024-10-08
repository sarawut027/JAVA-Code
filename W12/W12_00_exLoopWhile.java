// ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 
// รอบที่ 2 
// รอบที่ 3 
// รอบที่ 4 
// รอบที่ 5 


package W12;

public class W12_00_exLoopWhile {
    public static void main(String[] args) {
        
         //System.out.println("Loop 1");
         //System.out.println("Loop 2");
         //System.out.println("Loop 3");
         //System.out.println("Loop 4");
         //System.out.println("Loop 5");


// TODO 1
System.out.println("TODO 1 Loop For");
for(int i = 1 ; i <= 8  ; i++){
    //คำสั่งต้องการให้ทำสั่งลูป 5 รอบ
        System.out.println("Hello World "+i);
}
System.out.println("==========================================================================================================================");

//=======================================End For Loop=========================================
System.out.println("TODO 1 Loop While");
int n1 = 1 ;
while (n1 <= 8){ 
    System.out.println("While "+n1);
    n1++;
}
System.out.println("==========================================================================================================================");

//=======================================End While Loop=========================================



// โครงสร้างคำสั่งลูป for / while แบ่งออกเป็น 3 ส่วน
// 1. ส่วนตัวแปรเริ่มต้น
// 2. เงื่อนไข
// 3. การเพิ่มค่า / การลดค่า

for (int i = 1 ; i <= 3 ; i++){
    System.out.println("Loop "+i);
}


// ======================================================================

//คำสั่ง 1 ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 Hello World
// รอบที่ 2 Hello World
// รอบที่ 3 Hello World
// รอบที่ 4 Hello World
// รอบที่ 5 Hello World

// TODO 2
System.out.println("TODO 2 Loop For");
for (int i=1;i<6;i++){
    System.out.println("Hello World "+i);
}
System.out.println("==========================================================================================================================");
//=======================================End For Loop=========================================
System.out.println("TODO 2 Loop While");
int n2 = 1 ;
while (n2 <= 5){
    System.out.println("Hello World "+n2);
    n2++;
}
System.out.println("==========================================================================================================================");
//=======================================End While Loop=========================================

//TODO 3
//คำสั่ง 2 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 2 3 4 5 6 7 8 9 10
System.out.println("TODO 3 Loop For");
for (int j = 1; j <= 10 ; j++) {
    System.out.print(j + " ");
}
System.out.println("\n==========================================================================================================");
//=======================================End For Loop=========================================
System.out.println("TODO 3 Loop While");
int n3 = 1 ;
while (n3 <= 10){ 
    System.out.print(n3 + " ");
    n3++;
}
System.out.println("\n==========================================================================================================");
//=======================================End While Loop=========================================
    

// ======================================================================

//TODO 4
//คำสั่ง 2.1 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 2 3 4 5 6 7 8 9 10 = 55
System.out.println(" ");

System.out.println("TODO 4 Loop For");
int sum = 0;
for (int j = 1 ; j <= 10 ; j++) {
 System.out.print( + j + " ");
 sum = sum + j; //sum += j; ความหมายเดียวกันจ้า
}
System.out.println("= " + sum);
System.out.println("\n==========================================================================================================");
// ======================================================================
System.out.println("");
System.out.println("TODO 4 Loop While");
int sumwhile = 0;
int n4 = 1;
while (n4 <= 10) {
    System.out.print( + n4 + " ");
    n4++;
    sumwhile = sumwhile + n4;
}
System.out.println("\n==========================================================================================================");
//TODO 5
//คำสั่ง 2.2 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1+2+3+4+5+6+7+8+9+10 = 55
System.out.println(" ");
System.out.println("TODO 5 Loop For");
int sum1 = 0;
for (int j = 1 ; j <= 10 ; j++) {
    System.out.print(+j+"");
    sum1 = sum1 + j; //sum += j; ความหมายเดียวกันจ้า
    if (j <= 9) {
        System.out.print("+");
    }
} System.out.println(" = " + sum1);
System.out.println("\n==========================================================================================================");

//

System.out.println("TODO 5 Loop While");
int sumwhile1 = 0;
int n5 = 1;
while (n5 <= 10) {
    System.out.print(+n5+"");
    sumwhile1 = sumwhile1 + n5;
    if (n5 <= 9) {
        System.out.print("+");
    }
    System.out.println("\n==========================================================================================================");
// ======================================================================

//TODO 6
//คำสั่ง 3 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 10 9 8 7 6 5 4 3 2 1


System.out.println("TODO 6 Loop For");
for( int i = 10 ; i >= 1; i--){ 
    System.out.print(i+" ");
}
System.out.println("\n==========================================================================================================");
System.out.println("TODO 6 Loop While");
int y6 = 10 ;
while (y6 >= 1) { 
    System.out.println(y6+" ");
    y6 -- ;
}
System.out.println("\n==========================================================================================================");
// ======================================================================

//TODO 7
//คำสั่ง 4 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 3 5 7 9 11 13 15 17 19
System.out.println(" ");
System.out.println("TODO 7 Loop For");
for (int i = 1 ; i < 20 ;i+=2) {
    System.out.print(" "+i);
}
System.out.println("\n==========================================================================================================");
//
System.out.println("TODO 7 Loop While");
int y7 = 1 ;
while (y7 < 20) { 
    y7+=2;
    System.out.print(" "+y7);
}
System.out.println("\n==========================================================================================================");
// ======================================================================

//TODO 8
//คำสั่ง 5 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 2 4 6 8 10 12 14 16 18 20
System.out.println(" ");
System.out.println("TODO 8 Loop For");
for (int i=2 ; i<=20 ; i+=2 ){
    System.out.print(" "+i);
}
System.out.println("\n==========================================================================================================");
// ======================================================================
System.out.println(": Mygroups");
int y1 =2 ;
while (y1 <=20) { 
    y1+=2;
    System.out.print(""+y1);
}
System.out.println("\n==========================================================================================================");
//int y1 =2 ;
//while (y1 <= 20){
    //System.out.print(" "+y1);
    //y1+=2;
//}

//TODO 9
//คำสั่ง 6 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 4 9 16 25 36 49 64 81 100
System.out.println(" ");
System.out.println("TODO 9 Loop For");
 for (int i=1 ; i<=10 ; i++ ){
     System.out.print(i*i+" ");
 }
 System.out.println("\n==========================================================================================================");
//
System.out.println("TODO 9 Loop While");
int y9 = 1 ;
while (y9 <= 10) { 
    y9++;
    System.out.print(y9*y9+" ");
}
System.out.println("\n==========================================================================================================");
// ======================================================================

// TODO 10
//คำสั่ง 7 ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 เลขคี่
// รอบที่ 2 เลขคู่
// รอบที่ 3 เลขคี่
// รอบที่ 4 เลขคู่
// รอบที่ 5 เลขคี่
System.out.println(" ");
System.out.println("TODO 10 Loop For");
for (int i = 1 ; i<=5 ; i++ ){
    if (i%2==0){
        System.out.println("Loop "+i+" Odd numbers");
    }else{
        System.out.println("Loop "+i+"Even numbers");
    }
}
// ======================================================================
System.out.println(" ");
System.out.println("TODO 10 Loop While");
int y10 = 1 ;
while (y10 <= 5) { 
    if (y10%2==0){
        System.out.println("Loop "+y10+" Odd numbers");
    }else{
        System.out.println("Loop "+y10+"Even numbers");
    }
    y10++;
}
System.out.println("\n==========================================================================================================");
// ======================================================================

    }

}

}