package Round3;

public class Brackets {
    
    public static void main(String[] args) {
        String str="(]{}";

        boolean ans=check(str);

        System.out.println(ans);
    }

    private static boolean check(String str) {
        boolean ans=false;
        String[] brackets={"(" , ")" , "[" ,"]" , "{", "}"};

        for (int i = 0; i < str.length()-1; i++) {
            for (int j = 0; j < brackets.length-1; j++) {
                if(brackets[j].equals(Character.toString(str.charAt(i))) && brackets[j+1].equals(Character.toString(str.charAt(i+1)))){
                    return true;
                }
            }
        }

        return ans;
    }
}
