public class W03_01_Netprice {
    public static void main(String[] args) {
        //สร้างตัวแปรเพื่อเก็บค่าตัวแปรแต่ละอย่าง
        short price = 350;
        byte quantity = 10;
        byte percentdiscount = 5;

        int totalPrice = price * quantity;
        
        int discount = totalPrice * 5/100;
        
        //int discount = percentdiscount/100;
        //int discount2 = (price * quantity) * 5/100;
        //ใช้แบบนี้ก็ได้ค่าเท่ากัน :)
        int netprice = totalPrice - discount;

        
System.out.println("ราคาสินค้าทั้งหมด = " + (totalPrice) + " บาท");
System.out.println("ส่วนลด = " + (discount) + " บาท");
System.out.println("จะต้องจ่าย = " + (netprice) + " บาท");

    }
    
}
