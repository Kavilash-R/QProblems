package patterns;

public class pattern6 {
    public static void main(String[] args) {
        int n =5;
        pattern(n);
    }

    static void pattern(int n){

        for (int i=0;i<n;i++){
            char ch='A';
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch+=1;
            }
            System.out.println();
        }
    }
}
