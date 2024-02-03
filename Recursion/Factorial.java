package Recursion;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int ans=fact(n);
        System.out.println(ans);
    }

    private static int fact(int n) {
        int ans;
        if(n>0 && n<=2){
            ans=n;
            return n;
        }

        ans=n*fact(n-1);
        
        return ans;
    }

}
