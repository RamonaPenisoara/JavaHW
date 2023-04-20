package SDETProject;

public class Project10 {
    /* Write a program to print out duplicate elements from
an Array of Strings?*/
    public static void main(String[] args) {
        String [] elements={"Iron","Magnesium","Gold","Iron","Helium","Copper"};
        for(int i=0;i< elements.length;i++){
            System.out.print(elements[i]);
            for(int j=0;j< elements.length;j++){
                if(elements[j].equals(elements[i])&&j!=i){
                    System.out.println(elements[j]);
                }
            }

        }


    }
}
