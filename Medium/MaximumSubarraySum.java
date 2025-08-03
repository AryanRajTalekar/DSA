public class MaximumSubarraySum {

        //kadanes algorithm

    public static int maxSubarraySum(int[] arr){
        int maxSum = 0;
        int current = 0;
        for(int i = 0;i<arr.length;i++){
            current += arr[i];
            maxSum = Math.max(maxSum,current);
            if(current<0){
                current = 0;
            }
        }


        return maxSum;
    }




     public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
    }
}
