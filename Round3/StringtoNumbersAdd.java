package Round3;

import java.util.LinkedList;

public class StringtoNumbersAdd {
    
    public static void main(String[] args) {
        String str="One lakh forty nine";
        LinkedList<Integer> list=new LinkedList<>();

        list=convert(str);

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    private static LinkedList<Integer> convert(String str) {
        String[] word=str.split(" ");
        LinkedList<Integer> list=new LinkedList<>();

        String[] numbers={"zero","one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine" ,"ten" ,
                           "eleven" , "twelve" , "thirteen" ,"fourteen" , "fifteen" ,"sixteen" ,"seventeen" , "eighteen" , "nineteen",
                        "twenty" , "thirty" , "fourty" , "fifty","sixty","seventy" ,"eighty","ninety" ,"hundred",
                    "thousand" ,"lakh"};


        int n=0;
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(word[i].equalsIgnoreCase(numbers[j])){
                    if(j<29){
                        n=n+i;
                    }
                    else if (j==29) {
                        n=n*100;
                    }
                    else if(j==30){
                        n=n*1000;
                    }
                    else if (j==31) {
                        n=n*100000;
                    }  
                }
            }
        }
        list.add(n);
        return list;
    }
}
