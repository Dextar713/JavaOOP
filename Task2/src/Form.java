import java.util.Objects;

public class Form {
    public String color;

    public Form() {}

    public Form(String color) {
        this.color = color;
    }

    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "color=" + color;
    }
}

class Triangle extends Form {
    public float base;
    public float height;

    public Triangle() {
        super();
    }

    public Triangle(float base, float height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return base * height / 2;
    }

    public String toString() {
        return "Triangle{" + super.toString() + " " +
                "area=" + getArea() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Math.round((this.getArea() - triangle.getArea())*100)/100 == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Math.round(this.getArea()*100)/100);
    }

    public void printTriangleDimensions() {
        System.out.println("Base="+this.base+" Height="+this.height);
    }
}

class Circle extends Form {
    public float radius;

    public Circle() {
        super();
    }

    public Circle(float radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" + super.toString() + " " +
                "area=" + getArea() +
                '}';
    }

    public void printCircleDimensions() {
        System.out.println("Radius="+this.radius);
    }
}