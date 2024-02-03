package Recursion.SimplePrograms;

public class CountZeroes{

    public static void main(String[] args){

        int n=10203;

        int count=count(n,0);

        System.out.println(count);
    }

    private static int count(int n,int count) {
        if(n==0){
            return count;
        }
        if(n%10==0){
            count++;
        }
        return count(n/10,count);
    }
}