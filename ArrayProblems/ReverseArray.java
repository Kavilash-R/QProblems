package QProblems.ArrayProblems;

import java.util.Arrays;

public class ReverseArray {
    // reverse array without using extra space(extra array)
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(firstWay(arr)));
    }

    public static int [] firstWay(int [] arr){
        int left =0;
        int right = arr.length-1;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            // increment and decrement left and right
            left++;
            right--;
        }
        return arr;
    }
}
