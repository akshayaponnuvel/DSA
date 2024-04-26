package Recursion.SimplePrograms;

import java.util.Scanner;

public class SumOfNumbers {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int ans=sum(n);
        System.out.println(ans);
        
    }

    private static int sum(int n) {
        int ans;
        if(n>0 && n<=1){
            ans=n;
            return n;
        }

        ans=n+sum(n-1);
        
        return ans;
    }
}
