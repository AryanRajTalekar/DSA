import java.util.*;


public class MajorityElement {

    //Brute Force Approach
    // public static int solution(int[] arr) {
    //     int n = arr.length;

    //     for (int i = 0; i < n; i++) {
    //         int cnt = 0;
    //         for (int j = 0; j < n; j++) {
    //             if (arr[i] == arr[j]) {
    //                 cnt++;
    //             }
    //         }
    //         if (cnt > n / 2) {
    //             return arr[i];
    //         }
    //     }

    //     return -1;
    // }

    //HashMap
     public static int solution(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> mpp = new HashMap<>();

        for(int i=0;i<n;i++){
            mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:mpp.entrySet()){
            if(entry.getValue()>n/2){
                return entry.getKey();
            }
        }

        return -1;

    }

    //Moores alogrithm
    

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 3, 5, 1};
        System.out.println(solution(arr)); // should print 1
    }
}
