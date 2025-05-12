package patterns;

public class pattern4 {
    public static void main(String[] args) {
        int n= 5;
        pattern1(n);
        pattern2(n);
    }
    static void pattern1 (int n){

        for(int i=0; i<n; i++){
            // space
            for (int j =1; j<n-i; j++){
                System.out.print("  ");
            }
            // stars
            for (int j =0; j<1+(2*i); j++){
                System.out.print("* ");
            }
            // space
            for (int j =1; j<n-i; j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void pattern2 (int n){

        for(int i=n; i>0; i--){
            // space
            for (int j =0; j<n-i; j++){
                System.out.print("  ");
            }
            // stars
            for (int j =0; j<(2*i) -1; j++){
                System.out.print("* ");
            }
            // space
            for (int j =0; j<n-i; j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
