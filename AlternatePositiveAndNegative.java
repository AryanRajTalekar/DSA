import java.util.*;

public class AlternatePositiveAndNegative {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, -4, -1, 4));
        ArrayList<Integer> result = separatePosNeg(arr);
        System.out.println(result); // [1, -4, 2, -1, 3, 4]
    }

    public static ArrayList<Integer> separatePosNeg(ArrayList<Integer> arr) {
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();

        for (int num : arr) {
            if (num >= 0) // treat zero as positive; change to >0 if you want zero with negatives
                positives.add(num);
            else
                negatives.add(num);
        }

        ArrayList<Integer> result = new ArrayList<>(arr.size());
        int p = 0, n = 0;

        // Alternate: positive then negative
        while (p < positives.size() && n < negatives.size()) {
            result.add(positives.get(p++));
            result.add(negatives.get(n++));
        }

        // Append leftovers
        while (p < positives.size()) result.add(positives.get(p++));
        while (n < negatives.size()) result.add(negatives.get(n++));

        return result;
    }
}
