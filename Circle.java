package geometry.shape2D;
import geometry.interface.*;
    public  class Circle implements CalArea,CalPerimeter{
        public double radius;
        public Circle(double radius){
            this.radius = radius;
            
        public double area(){
            return 3.14*radius*radius;
        public double peri(){
            return 2*3.14*radius*radius;
            }
        }
    } 
    
}
