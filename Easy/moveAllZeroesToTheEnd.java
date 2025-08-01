import java.util.*;

class moveAllZeroesToTheEnd{
    public static void main(String [] args){
        int arr[]  =  {1, 2, 0, 4, 3, 0, 5, 0};
    //    moveAllZeroes(arr);
    movezeroes(arr);
    }
// brute force approach = use two for loops to sort the array


// better approach is to sort the array using inbuilt function Arrays.sort() 
    public static void moveAllZeroes(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }

    public static void movezeroes(int arr[]){
        int left=0,right=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                right++;
            }
            if(arr[i]==0){
                swap(arr,left,right);
                left++;
                right++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void swap(int arr[],int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}