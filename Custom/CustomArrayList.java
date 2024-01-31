package Custom;
import java.util.Arrays;

public class CustomArrayList {
    
    public static void main(String[] args) {
        CustomArrayList a=new CustomArrayList();

        for(int i=0;i<12;i++){
            a.add(i);
        }

        a.remove(2);

        System.out.println(a.get(1));

        a.set(0, 11);

        System.out.println(a);
    }

    private int[] list;
    private static int default_value=10;
    private int data=0;

    @Override
    public String toString(){
        return "CustomArrayList{" + "list=" + Arrays.toString(list) +
        " , size=" + data+ "}"; 
    }

    public CustomArrayList(){
        this.list=new int[default_value];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        list[data++]=num;
    }

    private void resize() {
        int[] temp=new int[default_value*2];

        for(int i=0;i<default_value;i++){
            temp[i]=list[i];
        }

        list=temp;
    }

    public int remove(int index){
        int removed=list[index];
        for(int i=index;i<default_value;i++){
            list[i]=list[i+1];
        }
        data--;
        return removed;
    }

    public int get(int index){
        int n=list[index];
        return n;
    }

    public int size(){
        return data;
    }

    public void set(int index,int value){
        list[index]=value;
    }

    private boolean isFull() {
        return data==list.length;
    }

}
