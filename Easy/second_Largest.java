class second_Largest{
    public static void main(String [] args){
        int arr[] = {12, 35, 1, 10, 34, 1};
        // getSecondLargest(arr);
        System.out.println("The second largest element is: " + getSecondLargest(arr));
        System.out.println("The largest element is: " + getLargest(arr));
    
    }

    public static int getSecondLargest(int arr[]){
        int largest =-1, secondLargest = -1;

        for(int i=0;i<arr.length;i++){
           if(arr[i]>largest){
            secondLargest = largest;
            largest = arr[i];
           } 
           else if(arr[i] > secondLargest && arr[i] != largest){
            secondLargest = arr[i];
           }
        }
        return secondLargest;
    }

    public static int getLargest(int arr[]){
        int largest = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}