package Round3;

public class Lettercount {
    
    public static void main(String[] args) {
        String str="aaaabbbccckkk";
        String ans=count(str);
        
        System.out.println(ans);
    }

    private static String count(String str) {
        if(str.length()==0){
            return "No string found";
        }
        StringBuilder ans=new StringBuilder();
        char c=str.charAt(0);
        int count=1;

        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i)==c){
                count++;
            }
            else{
                ans.append(c).append(count);
                c=str.charAt(i);
                count=1;
            }
        }

        ans.append(c).append(count);

        return ans.toString();
    }
}
