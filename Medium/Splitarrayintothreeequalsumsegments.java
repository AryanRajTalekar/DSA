public class Splitarrayintothreeequalsumsegments {


        public static int[] findSplit(int[] arr){
            int n = arr.length;
            long total = 0;
            for(int num:arr){
                total += num;
            }

            if(total%3 != 0) return null;
            long target = total/3;




            return new int[]{-1,-1};
        }




    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 0, 4};
        int[] res = findSplit(arr);

        System.out.println(res[0] + " " + res[1]);
    }
}
