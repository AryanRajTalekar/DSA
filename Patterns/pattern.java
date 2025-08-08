
import java.io.*;

class pattern {

    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            //for spaces
            for (int j = 1; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            //for stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            //for spaces
            for (int j = 1; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    public static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            //spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }

            //spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    public static void pattern9(int n) {
        // *    
//    ***   
//   *****  
//  ******* 
// *********
// *********
//  ******* 
//   *****  
//    ***   
//     * 

        // call pattern 7 and 8 to create this pattern
    }

    public static void pattern10(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {

            int stars = i;

            if (i > n) {
                stars = 2 * n - i;
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }

    public static void pattern11(int n) {
        int start = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                start = 1; 
            }else {
                start = 0;
            }

            for (int k = 0; k <= i; k++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void pattern12(int n) {
        // 1          1
        // 12        21
        // 12       321
        // 1234    4321
        // 12345  54321
        // 132456654321

        int spaces = 2 * (n - 1);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();

            spaces -=2;
        }
    }




    public static void pattern13(int n){
         int num =1;
        for(int i=1;i<=n;i++){
           

            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num = num+1;
            }
            System.out.println();
        }
    }

    public static void pattern14(int n){
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch +" ");
            }
            System.out.println();
        }
    }














    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        //  System.out.print("Enter the value of N: ");
        // int N = sc.nextInt();
        // // int N = 5;
        // pattern1(N);
        // sc.close();

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //  System.out.print("Enter the value of N: ");
        // int N = Integer.parseInt(br.readLine());
        int N = 6;

        // pattern1(N);
        // * * *
        // * * *
        // * * *
        // pattern2(N);
        // *
        // **
        // ***
        // ****
        // *****
        // pattern3(N);
        // 1
        // 12
        // 123
        // 1234
        // 12345
        // pattern4(N);
        // 1
        // 22
        // 333
        // 4444
        // pattern5(N);
        // *****
        // ****
        // ***
        // **
        // *
        // pattern6(N);
        // 12345
        // 1234
        // 123
        // 12
        // 1
        // pattern7(N);
        //      *    
        //     ***
        //    *****
        //   *******
        //  *********
        //    pattern8(N);
        //     ********* 
        //      *******  
        //       *****   
        //        ***    
        //         * 
        //pattern9(N);
//     pattern10(N);
        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *
//             pattern11(N);
//             1
        // 01
        // 101
        // 0101
        // 10101
        // 010101


        // pattern12(N);
        // 1          1
        // 12        21
        // 123      321
        // 1234    4321
        // 12345  54321
        // 123456654321


        // pattern13(N);
        // 1 
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        // 16 17 18 19 20 21

        // pattern14(N);
        // A 
        // A B
        // A B C
        // A B C D
        // A B C D E
        // A B C D E F

        





    }
}
