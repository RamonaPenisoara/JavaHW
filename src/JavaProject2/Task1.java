package JavaProject2;

public class Task1 {
    /*1. Reverse a String: Write a function to reverse a given string. For
example, given the input "Hello", the output should be "olleH".

     */
    public static void main(String[] args) {
        System.out.println(reverse("Hello"));

    }
   static String reverse(String s){
        String string="";
        for(int i=s.length()-1;i>=0;i--){
            string+=s.charAt(i);
        }
       return string;
   }
}
