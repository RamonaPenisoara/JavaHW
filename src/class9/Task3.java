package class9;

public class Task3 {
    public static void main(String[] args) {
        String [] names={"Ramo","Andy","Alex","John","Andre"};
                for(int i=0; i<names.length;i++) {
                    System.out.println(names[i] + " ");
                }
        System.out.println();
                int counter=0;
                while(counter<names.length){
                    System.out.print(names[counter]);
                    counter++;
                }
    }
}
