package W13;

public class W13_02_introArray {
    public static void main(String[] args) {
        // ประกาศตัวแปร array แบบ ที่ 2 โดยไม่มีข้อมูล
        String [] brandCars = new String[10];

        // กำหนดค่า array
        brandCars [0] = "Toyota";
        brandCars [1] = "Mazda";
        brandCars [2] = "Suzuki";
        brandCars [3] = "Honda";
        brandCars [4] = "Hyundai";
        brandCars [5] = "Subaru";
        brandCars [6] = "Mitsubishi";
        brandCars [7] = "Chevy";
        brandCars [8] = "Isuzu";
        brandCars [9] = "Nissan";

        // แสดงผล loop
        System.out.print("Brand of Car in the array are : ");
        for (int i = 0; i < brandCars.length; i++) {
            System.out.print(brandCars[i]+" / ");
        }
        System.out.print("\nBrand of Car in the array are : ");
        for (int i = 0 ; i < brandCars.length; i++) {
        brandCars [0] = "Kia";
        System.out.print(brandCars[i]+" / ");
        }
        // ใช้ for-each loop
        brandCars [0] = "Motorcycle";
        System.out.print("\nBrand of Car in the array are : ");
        for (String car : brandCars) {
            System.out.print(car+" / ");

        }
    }
}
