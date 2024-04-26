package Recursion.SimplePrograms;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        
        // int ans=fib(n);
        fibprint(n);
        // System.out.println(ans);
    }

    // print the nth element
    private static int fib(int n) {
        if(n<2){
            return n;
        }

        int ans = fib(n-1)+fib(n-2);
        return ans;
    }

    // print elements until nth element
    private static void fibprint(int n){
        for(int i=0;i<=n;i++){
            System.out.println(fib(i));
        }
    }
}