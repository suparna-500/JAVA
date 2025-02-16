import java.util.Scanner;
interface Dim{
    double  area(int x);
}
public class LambdaArea{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dim square=(x)->x*x;
        Dim cube=(x)->3.14*x*x;
        Dim circle=(x)->6*x*x;
        Dim sphere=(x)->4*3.14*x*x;
        System.out.println("enter the value:");
        int n=sc.nextInt();
        System.out.println("Area  of square: "+square.area(n));
        System.out.println("surface area of cube : "+cube.area(n));
        System.out.println("Area of circle : "+circle.area(n));
        System.out.println(" Area of sphere : "+sphere.area(n));
    }
}

