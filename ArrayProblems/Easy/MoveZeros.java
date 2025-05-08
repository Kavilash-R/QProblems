package QProblems.ArrayProblems.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeros {
    // move zeros to end but don't change the order of non-zero elements in array
    public static void main(String[] args) {
        int [] arr = {1,0,0,4,5,0,7,5};
        // expected output: {1,4,5,7,5,0,0,0}

        // first way
        System.out.println(Arrays.toString(firstWay(arr)));

        // second way
        //System.out.println(secondWay(arr));

        // third way
        System.out.println(Arrays.toString(thirdWay(arr)));


    }

    public static int [] firstWay(int [] arr){
        int zeros =0;
        List <Integer> list = new ArrayList<>();

        for(int num : arr){
            if (num == 0){
                zeros++;
            }
            else {
                list.add(num);
            }
        }
        for(int i=0;i<arr.length-zeros;i++){
            arr[i] = list.get(i);
        }
        for(int i =arr.length-1;i>arr.length-zeros;i--){
            arr[i] = 0;
        }
        return arr;
    }

    public static ArrayList<Integer> secondWay(int [] arr){
        int zeros =0;
        ArrayList <Integer> list = new ArrayList<>();

        for(int num : arr){
            if (num == 0){
                zeros++;
            }
            else {
                list.add(num);
            }
        }
        for(int i=0;i<zeros;i++){
            list.add(0);
        }
        return list;
    }


    public static int [] thirdWay(int [] arr){

        for (int i =0;i<arr.length-1;i++){
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        return  arr;
    }
}
