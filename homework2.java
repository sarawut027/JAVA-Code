import java.util.Scanner;
public class homework2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ป้อนรัศมีวงกลม: ");
        double radius = sc.nextDouble();
        //double radius;
        double area;
        double X = 3.14159;
        //radius = 10;
        if(radius>0){
        area = X*radius*radius;    
        System.out.println("area: "+radius+"\nเท่ากับ: "+area);
        }else{
        System.out.println("Error: please The Radius Number");    
        }
    }
}