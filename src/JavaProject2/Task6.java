package JavaProject2;

public class Task6 {
    /*Create an Interface 'Shape' with undefined methods as calculateArea
and calculate Perimeter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface. Test your
code.

     */
    public static void main(String[] args) {
        Circle c=new Circle();
        Square s=new Square();
        c.radius=5;
        s.side=5;
        System.out.println(c.calculatePerimeter());
        System.out.println(c.calculateArea());
        System.out.println(s.calculatePerimeter());
        System.out.println(s.calculateArea());
    }

}
    interface Shape{
    double calculateArea();
    double calculatePerimeter();

}
   class Circle implements Shape{
    int radius;
    public double calculatePerimeter(){
        return 2*3.14159*radius;

       }
       public double calculateArea(){
        return 3.14159*(radius*radius);
       }
   }
   class Square implements Shape{
    int side;
       public double calculatePerimeter(){
           return side*4;
       }
       public double calculateArea(){
           return side*side;
       }

   }
