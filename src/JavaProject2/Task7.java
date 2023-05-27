package JavaProject2;

public class Task7 {
    /* We have to calculate the average of marks obtained in three subjects
by student A and by student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning the average percentage
of marks. Provide implementation of abstract method in classes 'A'
and 'B'. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its
parameters for student B. Test your code

     */
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        a.mark0=80;
        a.mark1=90;
        a.mark2=100;
        System.out.println(a.getPercentage(a.mark0,a.mark1,a.mark2));
        System.out.println(b.getPercentage(50,60,70,80));

    }

}
   abstract class Marks{
       public abstract double getPercentage();

       abstract double getPercentage(int a, int b, int c);
   abstract double getPercentage(int a,int b,int c,int d);

   }
   class A extends Marks{
    int mark0;
    int mark1;
    int mark2;



       @Override
    public double getPercentage() {
           return 0;
       }

       @Override
       double getPercentage(int a, int b, int c) {
           int total=0;
           total=a+b+c;
           return total/3.0;
       }

       @Override
       double getPercentage(int a, int b, int c, int d) {
           return 0;
       }
   }
   class B extends Marks{
       int mark0;
       int mark1;
       int mark2;
       int mark3;

       @Override
       public double getPercentage() {
           return 0;
       }

       @Override
       double getPercentage(int a, int b, int c) {
           return 0;
       }

       @Override
       double getPercentage(int a, int b, int c, int d) {
           int total=a+b+c+d;
           return total/4.0;
       }
   }
