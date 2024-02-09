package Custom.LinkedList.DoubleLinkedList;

public class Main {
    
    public static void main(String[] args) {
        CustomDoubleLL list=new CustomDoubleLL();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);

        list.insertLast(4);
        list.insertLast(5);

        list.insert(4, 44);

        list.deleteFirst();

        list.deleteLast();

        list.delete(2);
        
        list.display();
    }
}
