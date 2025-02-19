package  geometry.shape3D;
import geometry.shape2D.Rectangle;

public class Cuboid extends Rectangle {
    public double height;
    public Cuboid(double l, double w, double h) {
        super(l, w);
        height = h;
}
public double volume() {
    return l * w * h;
}
}
