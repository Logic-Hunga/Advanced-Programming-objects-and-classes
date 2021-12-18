/**class uml */
public class Rectangle {

    // default instance & static data fields
    private static int classPin= 71967;
    double length;
    double breadth;

    
    // Objects constructors
    public Rectangle () {

    }
    public Rectangle (double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // mutator
    public void setLength (double length) {
        this.length = length;
    }
    public void setBreadth (double breadth) {
        this.breadth = breadth;
    }

    // Accessors
    public static int getClassPin() {
        return classPin;
    }
    public double getLength () {
        return length;
    }
    public double getBreadth () {
        return breadth;
    }
    public double getArea() {
        return length * breadth;
    }
}