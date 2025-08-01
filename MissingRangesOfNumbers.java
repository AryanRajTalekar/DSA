
import java.util.*;

public class MissingRangesOfNumbers{



    public static List<List<Integer>> missingRanges(int[] arr, int lower, int upper) {
        List<List<Integer>> res = new ArrayList<>();

        if (arr == null || arr.length == 0) {
            if (lower <= upper) {
                res.add(Arrays.asList(lower, upper));
            }
            return res;
        }

        if (lower < arr[0]) {
            res.add(Arrays.asList(lower, arr[0] - 1));
        }

        for (int i = 0; i<arr.length-1; i++) {
            if (arr[i+1] - arr[i] > 1) {
                res.add(Arrays.asList(arr[i]+1,arr[i+1]-1));
            }
        }

        int n  = arr.length;

        if(upper>arr[n-1]){
            res.add(Arrays.asList(arr[n-1]+1,upper));
        }

        return res;
    }

    public static void main(String[] args) {
        int lower = 10;
        int upper = 50;
        int[] arr = {14, 15, 20, 30, 31, 45};
        List<List<Integer>> res = missingRanges(arr, lower, upper);
        for (List<Integer> range : res) {
            // System.out.print(range.get(0) + " " + range.get(1));
            
        }

        System.out.print(res);
    }
}
