import java.util.Arrays;


public class rotateArrayByD {
    



    public static void main(String [] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8 };
        int k = 3;
        int[] result = rotatebyK(arr,k);
        System.out.println(Arrays.toString(result));
    }


    public static int[]  rotatebyK(int arr[],int k){
        int n = arr.length;
        k%=n;
        swap(arr,0,k-1);
        swap(arr,k,n-1);
        swap(arr,0,n-1);
        return arr;
    }

    public static void swap(int[] arr,int left,int right){
        while(left<right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
        }
    }

}
