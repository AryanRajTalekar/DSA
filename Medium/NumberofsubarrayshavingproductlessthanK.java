

public class NumberofsubarrayshavingproductlessthanK {
    

    //brute force
    // public static int countsubarray(int[] arr,int n,int k){

    //     int count = 0;
    //     for(int i=0;i<n;i++){
    //         int prod = arr[i];
    //         if(arr[i]<k) count++;
    //         for(int j = i+1;j<n;j++){
    //             prod = prod * arr[j];

    //             if(prod<k){
    //                 count++;
    //             }else{
    //                 break;
    //             }
    //         }

    //     }

    //     return count;
    // }

    public static int countsubarray(int[] arr,int n,int k){

       if (k<=0) return 0;
       int left = 0;
       long prod = 1;
       int count = 0;

        for(int right=0;right<arr.length;right++){
            prod *=  arr[right];

            while(prod>=k && left<=right){
                prod /= arr[left];
                left++;
            }

            count += (right-left+1);
        }


        return count;

    }
    
    
    
    public static void main(String args[])
    {
        int array[] = { 1, 2, 3, 4 };
        int k = 10;
        int size = array.length;

        int count = countsubarray(array, size, k);
        System.out.print(count);
    }
}
