package QProblems.patterns;

public class pattern1 {
    public static void main(String[] args) {
        int n= 5;
        pattern(n);
    }
    static void pattern (int n){
        int a= 1;
        for(int i=1; i<=n; i++){
           for(int j =1; j<=i; j++){
               System.out.print(a+" ");
               a++;
           }
           System.out.println();
       }
    }
}
