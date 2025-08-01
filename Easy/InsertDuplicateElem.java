import java.util.ArrayList;
import java.util.Arrays;

public class InsertDuplicateElem {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 0, 2, 3, 0, 4, 5, 0));
        int k = 0;
        ArrayList<Integer> ans = duplicateK(arr, k);

        for (int num : ans) {
            System.out.print(num + " ");
        }
        // Expected output: 1 0 0 2 3 0 0 4
    }

    public static ArrayList<Integer> duplicateK(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        ArrayList<Integer> temp = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            if (temp.size() >= n) break;
            int val = arr.get(i);
            temp.add(val);
            if (val == k && temp.size() < n) {
                temp.add(k);
            }
        }

        // If you wanted to reflect it back into the original list (optional):
        // for (int i = 0; i < n; i++) {
        //     arr.set(i, temp.get(i));
        // }

        return temp;
    }
}
