package QProblems.StringProblems.Medium;

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String txt = "aaabcdefgghi";

        System.out.println(firstWay(txt));
    }

    public static int firstWay(String txt){
        int maxLen =0;
        HashSet<Character> set = new HashSet<>();
        int left =0;
        for (int right =0;right<txt.length();right++){
            char ch = txt.charAt(right);
            while (set.contains(ch)){
                set.remove(txt.charAt(left));
                left++;
            }
            set.add(ch);
            maxLen = Math.max(maxLen,right-left+1);

        }
        return maxLen;
    }
}
