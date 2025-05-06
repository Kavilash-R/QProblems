package QProblems.ArrayProblems.Easy;

public class MissingElement {
    // find the missing element in the array start from 1 to n
    public static void main(String[] args) {
        int [] arr = {1,3,4,5,6,7};

        System.out.println(firstWay(arr));
    }

    public static int firstWay(int [] arr){

        int start =1;

        for (int num : arr){
            if(num != start){
                return start;
            }
            else {
                start++;
            }
        }
        return -1;
    }
}
