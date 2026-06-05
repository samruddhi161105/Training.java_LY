package Recursion_java;
//sum of first 10 number
public class fact1 {
     static int sum (int n){
        if(n==1){
            return 1;
        }else{
            return n+sum(n-1);

        }
     }
        public static void main(String[] args) {
            int n=4;
            int result = sum(n);
            System.out.println("sum of 4 number : " + result);
        }
}
