package JavaProject2;

public class Task8 {
    /* Create a Class Car that would have the following fields: carPrice and
color and method calculateSalePrice() which should be returning a
price of the car.
Create 2 sub classes: Sedan and Truck. The Truck class has a field
as weight and has its own implementation of calculateSalePrice()
method in which returned price is calculated as following: if
weight>2000 then returned price car should include 10% discount,
otherwise 20% discount.
The Sedan class has field as length and also does it is own
implementation of calculateSalePrice(): if length of sedan is >20 feet
then returned car price should include 5% discount, otherwise 10%
discount

     */
    public static void main(String[] args) {
        Truck truck=new Truck();
        Sedan sedan=new Sedan();
        truck.carPrice=2000;
        truck.weight=1000;
        System.out.println(truck.calculateSalePrice());
        sedan.carPrice=3000;
        sedan.length=500;
        System.out.println(sedan.calculateSalePrice());
    }
}
   class Car{
    double carPrice;
    String color;
    public double calculateSalePrice(){
        return carPrice;
    }

   }
   class Truck extends Car{
    int weight;

       @Override
       public double calculateSalePrice() {
           if(weight>2000){
               return carPrice-(carPrice*.10);
           }
           return carPrice-(carPrice*.20);
       }
   }
   class Sedan extends Car{
    int length;
       public double calculateSalePrice() {
           if (length > 20) {
               return carPrice - (carPrice * .5);
           }
           return carPrice - (carPrice * .10);

       }
   }
