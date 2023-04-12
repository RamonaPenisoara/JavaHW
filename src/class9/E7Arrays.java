package class9;

public class E7Arrays {
    public static void main(String[] args) {
        boolean[] flags={true,false,true,false,false,true};
        int count=0;
        for(int i=0;i< flags.length;i++){
            if (flags[i]==false) {
                System.out.println(flags[i]);
            }
        }
        System.out.println(3);

    }
}
