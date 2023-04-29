package class14;

public class Printer {

    void printWord(String word){
        System.out.println(word);
    }
    /*
    void=>return type of method/void means this method doesn't return any data
    other examples of return types can be String int boolean char Dog Cat etc.
    printWord is the name of the method
    (String word)=> parameters/input
    {System.out.println(word);}=>body of the method you can write if else conditions loop
     */

    public static void main(String[] args) {
        //we are creating an object of the E1Methods class
        //in java all classes can be treated as data types
        //new E1Method()=>creating the object of the E1Methods class
     
        Printer obj=new Printer();
        //we are calling the printWord() method on obj object and passing"java" as
        //argument or input
        obj.printWord("Java");
    }
}
