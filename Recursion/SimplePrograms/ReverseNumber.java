package Recursion.SimplePrograms;

import java.util.Scanner;

public class ReverseNumber {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        reverse(n);
        System.out.println(sum);
    }

    static int sum=0;
    private static void reverse(int n) {
        if(n==0){
            return;
        }
        int r=n%10;
        sum=sum*10+r;
        reverse(n/10);
    }
}
