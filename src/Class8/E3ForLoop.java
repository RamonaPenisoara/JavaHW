package Class8;

public class E3ForLoop {
    public static void main(String[] args) {
        //write a loop to add all even numbers from 1 to 30
        int sum=0;//creating a variable to hold the sum
        for(int i=1; i<=30; i++){
            if(i%2==0){//checking if a number is even
                sum=sum+i;//sum+=i;same//adding all even numbers to the sum one by one
            }
        }
        System.out.println(sum);//final result has to be printed outside of loop
        }
    }

