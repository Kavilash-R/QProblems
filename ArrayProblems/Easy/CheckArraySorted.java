package QProblems.ArrayProblems.Easy;

public class CheckArraySorted {
    // check if the array is sorted or not by the elements are in increasing order
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        System.out.println(firstWay(arr));
    }
    public static boolean firstWay(int [] arr){

        for (int i=1 ;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
