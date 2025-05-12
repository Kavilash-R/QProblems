package patterns;

public class pattern2 {
    public static void main(String[] args) {
        int n= 5;
        pattern(n);
    }
    static void pattern (int n){
        int star= 1;
        for(int i=1; i<=n; i++){
            // space
            for (int j =1; j<=n-i; j++){
                System.out.print("- ");
            }
            // stars
            for (int j =1; j<=star; j++){
                System.out.print("* ");
            }
            // space
            for (int j =1; j<=n-i; j++){
                System.out.print("- ");
            }
            star+= 2;
            System.out.println();
        }
    }

    // OR
//    static void pattern (int n){
//
//        for(int i=0; i<n; i++){
//            // space
//            for (int j =1; j<n-i; j++){
//                System.out.print("- ");
//            }
//            // stars
//            for (int j =0; j<1+(2*i); j++){
//                System.out.print("* ");
//            }
//            // space
//            for (int j =1; j<n-i; j++){
//                System.out.print("- ");
//            }
//            System.out.println();
//        }
//    }
}

