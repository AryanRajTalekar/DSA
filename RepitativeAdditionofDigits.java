public record RepitativeAdditionofDigits() {
     public static void main(String [] args){
        int n = 1234; 
        System.out.println(AdditionOfDigits(n));
    }

    public static int AdditionOfDigits(int n){
        

        if(n==0) return 0;

        return (n%9==0) ? 9:(n%9); 
    }

    // public static int AdditionOfDigits(int n){
    //     int sum = 0;

    //     while(n>0 || sum >9){
    //         if(n==0){
    //             n = sum;
    //             sum = 0;
    //         }

    //         sum += n%10;
    //         n = n/10;
             
    //     }


    //     return sum;
    // }
}
