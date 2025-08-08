import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    //brute force two for loops
    // public static int[] productExceptSelf(int[] arr){
    //     int n = arr.length;
    //     int[] res = new int [n];
    //     Arrays.fill(res,1); 
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             if(i!=j){
    //                 res[i] *= arr[j];
    //             }
    //         }
    //     }

    //     return res;
    // }



    // preffix suffix method
    // public static int[] productExceptSelf(int[] arr){
    //     int n = arr.length;
    //     int[] prefix = new int[n];
    //     int[] suffix = new int[n];
    //     int[] res = new int [n];



    //     prefix[0] = 1;
    //     for(int i=1;i<n;i++){
    //         prefix[i] = arr[i-1] * prefix[i-1];
    //     }

    //     suffix[n-1] = 1;
    //     for(int i=n-2;i>=0;i--){
    //         suffix[i] = arr[i+1] * suffix[i+1];
    //     }

    //     for(int i=0;i<n;i++){
    //         res[i] = prefix[i] * suffix[i];
    //     }


    //     return res;

        
    // }



//Best way : Using Product Array 

    public static int[] productExceptSelf(int[] arr){
        int n = arr.length;
        int zeroes = 0,idx=-1,prod = 1;
        //count zeroes and track index of zero
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeroes++;
                idx = i;
            }else{ 
                prod *= arr[i];
            }
        }

        int[] res = new int[n];
        Arrays.fill(res,0);

        //if no zeroes calculate product of all elements
        if(zeroes == 0 ){
            for(int i=0;i<n;i++){
                res[i] = prod /arr[i];
            }
        }else if(zeroes == 1){
            res[idx] = prod;
        }
        

        return res;
    }








    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        int[] res = productExceptSelf(arr);

        System.out.println(Arrays.toString(res));
    }
}
