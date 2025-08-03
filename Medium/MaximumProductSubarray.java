public class MaximumProductSubarray {
    //brute force two for loops
    public static int maxProduct(int[] arr){
        int res = arr[0];

            for(int i =0;i<arr.length;i++){
                int curr = 1;
                for(int j=i;j<arr.length;j++){
                    curr*= arr[j];
                    res = Math.max(res,curr);
                }
            }
        return res;
    }


    //Expected Approach




    public static void main(String[] args) {
        int arr[] = { -2, 6, -3, -10, 0, 2 };
        System.out.println(maxProduct(arr));
    }
}
