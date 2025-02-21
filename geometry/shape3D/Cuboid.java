package  geometry.shape3D;
import geometry.shape2D.Rectangle;

public class Cuboid extends Rectangle {
    public double h;
    public Cuboid(double l, double w, double h) {
        super(l, w);
        this.h = h;
}
public double volume() {
    return l * w * h;
}
}
