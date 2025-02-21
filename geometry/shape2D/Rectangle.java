package geometry.shape2D;
import geometry.interfaces.*;
    public  class Rectangle implements CalArea,CalPerimeter{
        public double l,w;
        public Rectangle(double l,double w){
            this.l = l;
            this.w = w;
        }
            public double area(){
                return l*w;
            }
            public double peri(){
                return 2*(l+w);
            }
    }
    
    

