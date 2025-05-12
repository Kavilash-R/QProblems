package QProblems.patterns;
public class pattern3 {
    public static void main(String[] args) {
        int n= 5;
        pattern(n);
    }
    static void pattern (int n){

        for(int i=n; i>0; i--){
            // space
            for (int j =0; j<n-i; j++){
                System.out.print("- ");
            }
            // stars
            for (int j =0; j<(2*i) -1; j++){
                System.out.print("* ");
            }
            // space
            for (int j =0; j<n-i; j++){
                System.out.print("- ");
            }
            System.out.println();
        }
    }
}
