package QProblems.ArrayProblems;

public class SecondLargest {
    // need to find 2nd largest element in array
    public static void main(String[] args) {
        int [] arr = {1,4,7,9,9,3};
        System.out.println(firstWay(arr));

    }

    public static int firstWay(int [] arr){
        int firstLarge = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstLarge){
                secondLarge = firstLarge;
                firstLarge = arr[i];
            }
            else if(arr[i]<firstLarge && arr[i]>secondLarge){
                secondLarge = arr[i];
            }
        }

        return secondLarge;
    }
}
