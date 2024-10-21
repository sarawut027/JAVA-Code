package Final ;

public class S674230027_03_MyTest{
    static int FindMax (int a, int b, int c , int d){
        System.out.println("Number A : 5");
        System.out.println("Number B : 10");
        System.out.println("Number C : 3");
        System.out.println("Number B : 7");
        int max = a;
        if (b>max){
        max = b;
        }if (c>max){
        max = c;
        }if (d>max){
        max = d;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Max Number Of "+FindMax(5,10,3,7) );
    }
    }
