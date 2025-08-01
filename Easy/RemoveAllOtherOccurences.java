public class RemoveAllOtherOccurences {
     public static void main(String [] args){
        int arr[] = {3, 2, 2, 3};
        int ele = 3;
        System.out.println(removeAllOtherOcc(arr,ele));
    }

    public static int removeAllOtherOcc(int arr[],int ele){
        int count = 0;

            for(int i=0;i<arr.length;i++){
                if(arr[i]!= ele){
                    count++;
                }
            }
        return count;
    }
}
