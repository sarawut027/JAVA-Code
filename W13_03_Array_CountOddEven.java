package W13;

public class W13_03_Array_CountOddEven {
    public static void main(String[] args) {
        //ใหันับ เลข คู่ / คี่ ใน Array 
        int [] number = {1,2,3,4,5,6,7,8,9,10};

        int countOdd = 0;
        int countEven = 0;
        
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
            if (number[i]%2 == 0){ 
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("\nAmout of all numbers : " + number.length);
        System.out.println("Amout of Even numbers : " + countEven);
        System.out.println("Amout of Odd numbers : " + countOdd);
    }
    
}
