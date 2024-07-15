import java.util.Scanner;
public class W05_02_ifElseIf_PosNegZero {
public static void main(String[] args) {
Scanner keybord = new Scanner(System.in);
System.out.println(".(Enter Number)");
int number = keybord.nextInt();

if (number>0) {
System.out.println(number+"positive");
}else if (number<0){
System.out.println(number+"negative");
}
else if (number==0){
System.out.println(number+"zero");
}
else{
System.out.println("Invalid input");
}
}
}