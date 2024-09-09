package W13;
import java.util.Scanner;
public class W13_02_01_introArray {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String [] brandCars = new String[3];

        brandCars [0] = "Toyota";
        brandCars [1] = "Honda";
        brandCars [2] = "Nissan";

        System.out.println("Old Brand of Car in the array are : ");
        for (int i=0;i<brandCars.length;i++) {
            System.out.print(brandCars[i]+" / ");
        }
        System.out.println("\nPlease enter your brand of the 3rd car : ");
        
        for (int i = 0; i < brandCars.length; i++) {
            System.out.print("Enterbrand " + (i+1) + " : ");
            brandCars[i] = kb.next();
        }

        System.out.print("\nNew Brand of Car in the array are : ");
        for (String car : brandCars) {
            System.out.print(car+" / ");
        }
    }
}
