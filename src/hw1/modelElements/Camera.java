package hw1.modelElements;

import hw1.modelElements.elements.Angle3D;
import hw1.modelElements.elements.Point3D;
import java.util.List;

/**
 * Камера для сцены
 */
public class Camera {

    private final List<Point3D> location;
    private final List<Angle3D> angle;

    public List<Point3D> getLocation() {return location;}

    public List<Angle3D> getAngle() {return angle;}

    public Camera(List<Point3D> location, List<Angle3D> angle) {
        this.location = location;
        this.angle = angle;
    }

    void rotate(List<Angle3D> angle) {}

    void move(List<Point3D> location) {}
}
