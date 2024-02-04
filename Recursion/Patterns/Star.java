package Recursion.Patterns;

public class Star {
    
    public static void main(String[] args) {
        int n=5;
        printstar(n);
    }

    private static void printstar(int n) {
        if (n==0) {
            return;
        }
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();
        printstar(n-1);
    }
}
