package QProblems.patterns;

public class pattern5 {
    public static void main(String[] args) {
        int n=5;
        pattern1(n);

    }
    static void pattern1 (int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        pattern2(n);
    }
    static void pattern2 (int n){
        for(int i=n-1;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
