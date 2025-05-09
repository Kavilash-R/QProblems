package QProblems.StringProblems.Easy;

public class CheckPalindrome {
    public static void main(String[] args) {
        String s = "malayalam";

        System.out.println(isPalindrome(s,0,s.length()-1));
        // System.out.println(isPalindrome(s));

    }

    public static boolean isPalindrome(String s){
        int start=0;
        int end = s.length()-1;

        while (start<end){
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindrome (String s , int start, int end){
        if (start>end){
            return true;
        }
        if(s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return isPalindrome(s,start+1,end-1);
    }
}
