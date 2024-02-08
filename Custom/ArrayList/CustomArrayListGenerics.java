package Custom.ArrayList;

import java.util.Arrays;

public class CustomArrayListGenerics<T> {

    private int default_size=10;
    private static  Object[] list;
    private int size=0;
    
    public CustomArrayListGenerics() {
        CustomArrayListGenerics.list=new Object[default_size];
    }

    public int size(){
        return size;
    }

    @Override
    public String toString(){
        return Arrays.toString(list) + " " + size;
    }
    
    public void add(T value){
        if(arrisFull()){
            resize();
        }

        list[size++]=value;
    }

    private void resize() {
        Object[] temp=new Object[default_size];

        for(int i=0;i<temp.length;i++){
            temp[i]=list[i];
        }

        list=temp;
    }

    private boolean arrisFull(){

        return size==list.length;
    }
    
    public void remove(int index){

        for(int i=index;i<list.length-1;i++){
            list[i]=list[i+1];
        }

        size--;
    }

    public T  get(int index){
        return (T) list[index];
    }

    public void set(int index,T value){

        list[index]=value;
    }

    public static void main(String[] args) {

        CustomArrayListGenerics<String> a=new CustomArrayListGenerics<>();

        for(int i=0;i<5;i++){
            a.add("hello");
        }

        a.remove(2);

        System.out.println(a.get(3));

        a.set(5, "hii");

        System.out.println(a);
    }

}
