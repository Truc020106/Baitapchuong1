public class Circle {
    private double radius;
    public String color;
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public String toString(){
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color +'\''+
                '}';
    }
}
