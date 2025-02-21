import geometry.shape2D.*;
import geometry.shape3D.Cuboid;
public class SDemo{
    public static void main(String[] args) {
        Cuboid c=new Cuboid(2,3,4);
        Sphere s=new Sphere(10);
        System.out.println("Area:" + c.area() + "\nperimeter:" + c.peri() + "\nVolume:" + c.volume());

  System.out.println("Area:" + s.area() +"perimeter" +  " volume" + s.volume()); 
  System.out.println(s.perimeter());
}
}
