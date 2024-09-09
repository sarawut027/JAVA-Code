package W13;

public class W13_01_introArray {
    public static void main (String[] args) {
        // method main คือจุดสตาร์ท ที่ไว้ RUN โค้ด

        // array ต้องเก็บข้อมูลเหมือนกัน
        // [] คือ array
        //String colors [] = {}; ก็ได้
        String [] colors = {"Purple","Cyan","Blue","Green","Yellow","Orange","Red"};
        int [] banks = {20,50,100,500,1000};
        char [] alphabet = {'A','B','C','D','E'};
        // แสดงผลลัพธ์ index ของ array
        System.out.println("The First Color is " + colors[0]); 
        System.out.println("The First Bank is " + banks[0]);
        System.out.println("The First alphabet is " + alphabet[0]);
        System.out.println("The Third alphabet is " + alphabet[2]);
        
        // ทั้งหมดนี้แสดงผลโดยรู้ค่าที่แน่นอน
// ==============================================================================================================================================================================
        System.out.println(" ");
        System.out.println("====================================");
        //แสดงผลโดยใช้ loop
        for (int i=0 ; i<7 ; i++){
            System.out.print(colors[i]+" ");
        }
        System.out.println("");
        for (int i=6 ; i>=0 ; i--){
            System.out.print(colors[i]+" ");
        }
// ==============================================================================================================================================================================
        System.out.println(" ");
        System.out.println("====================================");
        System.out.print("the bank in the array are: ");
        for (int i = 0; i < banks.length; i++) {
         System.out.print(banks[i]+" ");   
        }
        // เป็นการหาขนาด array โดยใช้ .length
// ==============================================================================================================================================================================

    }
}
