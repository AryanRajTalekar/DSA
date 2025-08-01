class third_Largest {
    public static void main(String [] args){
        int arr[] = {12, 35, 1, 10, 34, 1};
        System.out.println("The third largest element is: " + getThirdLargest(arr));
    }

    public static int getThirdLargest(int arr[]){
        int largest=-1,secondlargest=-1,thirdlargest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!=largest){
                thirdlargest = secondlargest;
                secondlargest = arr[i];
            }
        }
        return thirdlargest;
    }
}
