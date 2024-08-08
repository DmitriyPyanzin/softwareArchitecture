package hw1.modelElements;

import hw1.modelElements.elements.Angle3D;
import hw1.modelElements.elements.Color;
import hw1.modelElements.elements.Point3D;
import java.util.List;

/**
 * Свет для сцены
 */
public class Flash {

    private final List<Point3D> location;
    private final List<Angle3D> angle;
    private final List<Color> color;
    private float power;

    public List<Point3D> getLocation() {return location;}

    public List<Angle3D> getAngle() {return angle;}

    public List<Color> getColor() {return color;}

    public float getPower() {return power;}

    public void setPower(float power) {this.power = power;}

    public Flash(List<Point3D> location, List<Angle3D> angle, List<Color> color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    void rotate(List<Angle3D> angle) {}

    void move(List<Point3D> location) {}
}
