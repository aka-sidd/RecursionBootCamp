public class RecursionDay1 {
    static void PrintDescending(int n){
        //base case
        if(n==0) {
            return;
        }
        //Print Current Number
        System.out.println(n);
        //Recursive call with n-1
        PrintDescending(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        PrintDescending(n);
    }

}
