package hw1.modelElements.elements;

/**
 * Угол обзора
 */
public class Angle3D {

    private double d, f; // Угол обзора рассчитывается как 2arctan(d/2f) - где d - размер, f - фокус

    public double getD() {return d;}

    public void setD(double d) {this.d = d;}

    public double getF() {return f;}

    public void setF(double f) {this.f = f;}

    public Angle3D(double d, double f) {
        this.d = d;
        this.f = f;
    }
}
