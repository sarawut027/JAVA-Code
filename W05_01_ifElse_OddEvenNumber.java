
import java.util.Scanner;
public class W05_01_ifElse_OddEvenNumber {
public static void main(String[] args) {
Scanner kb = new Scanner (System.in);
System.out.println("ใส่ค่ามาเลย");
int number =  kb.nextInt();
int result = number%2;

if (result==0){
System.out.println("Even");
} 
 else{
System.out.println("Odd");
}

//case 2
if (result==1){
    System.out.print("even");
}
else {
    System.out.println("odd");
}
//case 3
if (result!=0);{
    System.out.println("even");
}
//else{
// System.out.println ("odd");}
}
}
