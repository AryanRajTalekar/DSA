import java.util.Arrays;

public class AddOne {
     public static void main(String [] args){
        int arr[] = {9, 9, 9 };
        int[] result = Result(arr);
        System.out.println(Arrays.toString(result));
    }


    public static int[] Result(int arr[]){
        int carry = 1;

        for(int i=arr.length-1;i>=0;i--){
            int sum = arr[i] + carry;
            arr[i] = sum % 10;
            carry = sum/10;
        }

        if(carry>0){
            int[] newArray = new int[arr.length+1];
            newArray[0] = carry;
            System.arraycopy(arr,0,newArray,1,arr.length);
            return newArray;
        }
        return arr;
    }
}
