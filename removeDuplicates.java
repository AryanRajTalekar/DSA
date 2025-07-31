import java.util.*;

public class removeDuplicates {
    // sorted Arrays
    public static void main(String [] args){
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int newSize = removeDuplicatesFromSortedArray(arr);
int newSize1 = removeDuplicatesFromUnSortedArray(arr);
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < newSize1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicatesFromSortedArray(int[] arr){

            int idx = 1; 
      
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[idx++] = arr[i];
            }
        }
            return idx;

    }

    // unsorted arrays

     public static int removeDuplicatesFromUnSortedArray(int[] arr){
        int idx = 0;
        HashSet<Integer> s = new HashSet<>();

        for(int i =0;i<arr.length;i++){
            if(!s.contains(arr[i])){
                s.add(arr[i]);
                arr[idx++] = arr[i];
            }
        }

        return idx;
    }

}
