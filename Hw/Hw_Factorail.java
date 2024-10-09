package Homework;
public class Hw_Factorail {
    static int factorail (int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        System.out.println("Factorial of " + num1 + " is " + factorail(num1));
        System.out.println("Factorial of " + num2 + " is " + factorail(num2));
    }
}
    