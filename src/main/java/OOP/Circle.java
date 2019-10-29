package OOP;

public class Circle {
    private double radius = 1.0;
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(radius, 2) * Math.PI;
    }
    public double getCircumference(){
        return radius * 2 * Math.PI;
    }
    public String toString(){
        return "Circle[radius = " + radius + "]";
    }
}
