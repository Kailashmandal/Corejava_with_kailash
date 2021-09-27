/*
In abstraction different derived class can have different implementation.
 */
abstract class  Shape{
    abstract double Area(int len); // only declarartion is here.
}
class Triangle extends Shape{
    double Area(int len){
        return 0.5*len*len;
    }
}
class Square extends Shape{
    double Area(int len){
        return len*len;
    }
}
class Circle extends Shape{
    double Area(int len) {
        return 3.14*len*len;
    }
}
public class Abstraction2 {
    public static void main(String[] args) {
        Shape s;
        s=new Square(); // reference of type Shape is referring to object of Square.
        System.out.println("Area of Square is : "+s.Area(4));

        s=new Triangle(); // now s will refer to object of Triangle class
        System.out.println("Area of triangle is : "+s.Area(9));

        s=new Circle(); // now s will refer to object of Circle .
        System.out.println("Area of circle is : "+ s.Area(7));
    }
}
