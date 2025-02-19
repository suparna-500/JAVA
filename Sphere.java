package geometry.shape3D;
import geometry.sphere2D.Circle;
 public class Sphere extends Circle{
    public Sphere(double r){
        super(r);
    }
    public double Volume(){
        return (4/3.0)*Math.PI*Math.pow(radius,3);
    }
 }



