package Recursion.SimplePrograms;

import java.util.Scanner;

public class SumOfDigits {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int ans=sum(n);
        System.out.println(ans);
        
    }

    private static int sum(int n) {
        if (n<=9) {
            return n;
        }
        return sum(n%10)+sum(n/10);
    }
}
