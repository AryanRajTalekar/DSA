
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        ArrayList<Integer> result = leaders(arr,n);

        for (int res : result) {
            System.out.print(res + " ");
        }
        System.out.println();

    }

    public static ArrayList<Integer> leaders(int[] arr,int n){
        ArrayList<Integer> res = new ArrayList<>();
        int maxElem = -1;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>maxElem){
                maxElem = arr[i];
                res.add(maxElem);
            }
        }

        Collections.reverse(res);

       

        return res;
    }
}
