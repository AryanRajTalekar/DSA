class top3candidates{
    public static void main(String [] args){
        int arr[] = {10, 3, 5, 6, 20 };
        System.out.println("The top three candidates are: " + getTopThreeCandidates(arr));
    }

    public static int getTopThreeCandidates(int arr[]){
        int top = -1;

        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                         top =Math.max(top,arr[i] * arr[j] * arr[k]);
                }
            }
        }
        return top;
    }
}