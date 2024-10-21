package Final;
import java.util.Scanner;
public class S674230027_01_myTest {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.print("Please enter a number : ");
        int num1 = kb.nextInt();
        if (num1 > 0) {
            System.out.println(num1+" : Positive Number");
        } if (num1 < 0){
            System.out.println(num1 + " : Negative Number");
        } if (num1 == 0)  {
            System.out.println(num1 +" : Zero Number");
        } else {
        }

        
    }
}
