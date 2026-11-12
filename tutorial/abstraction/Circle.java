package tutorial.abstraction;

public class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area(){//abstract method
        return Math.PI * radius * radius;
    }
}
