import java.util.Scanner;
interface ShapeComparable{
    public double volume();
    int compareByVolume(ShapeComparable other);
}
class Cuboid implements ShapeComparable{
    double l,w,h;
    Cuboid(double l,double w,double h){
        this.l=l;
        this.w=w;
        this.h=h;
    }

    @Override
    public double volume(){
        return l*w*h;
}

public int compareByVolume(ShapeComparable other){
    return Double.compare(this.volume(),other.volume());
}
}
class Cylinder implements ShapeComparable{
    double r,h;
    Cylinder(double r,double h){
        this.r=r;
        this.h=h;
    }
    public double volume(){
        return Math.PI*r*r*h;
    }
    public int compareByVolume(ShapeComparable other){
        return Double.compare(this.volume(),other.volume());
    }
}
public class ComparableDemo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length of cuboid");
        double l=sc.nextDouble();
        System.out.println("Enter the width of cuboid");
        double w=sc.nextDouble();
        System.out.println("Enter the height of cuboid");
        double h=sc.nextDouble();
        Cuboid c=new Cuboid(l,w,h);


        System.out.println("Enter the radius of cylinder");
        double r=sc.nextDouble();
        System.out.println("Enter the height of cylinder");
        double h1=sc.nextDouble();
        Cylinder cy=new Cylinder(r,h1);


        System.out.println("Volume of cuboid is "+c.volume());
        System.out.println("Volume of cylinder is "+cy.volume());

        int comaprison=c.compareByVolume(cy);
        if (comaprison>0){
            System.out.println("Cuboid has larger volume than cylinder");
        }else if (comaprison<0){
            System.out.println("Cylinder has larger volume than cuboid");
            }else{
                System.out.println("Both cuboid and cylinder have same volume");
            }
            sc.close();


        }
    }
    



