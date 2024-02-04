package Recursion.Patterns;

public class PascalTriangle {
    
    public static void main(String[] args) {
        int n=5;
        printpattern(n);
    }

    private static void printpattern(int n) {
        String space=" ";
        for(int line=0;line<n;line++){
            for(int i=0;i<n-line-1;i++){
                System.out.print(space);
            }
            for(int i=0;i<=line;i++){
                System.out.print(print(line,i)+ space);
            }
            System.out.println();
        }
    }

    private static int print(int line, int pos) {
        if(pos==0 || pos==line){
            return 1;
        }
        return print(line-1, pos-1) + print(line-1, pos);
    }
}
