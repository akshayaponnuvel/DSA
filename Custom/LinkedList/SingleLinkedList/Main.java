package Custom.LinkedList.SingleLinkedList;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList list=new CustomLinkedList();


        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);

        list.insertLast(0);

        list.insert(5, 0);

        list.deleteFirst();

        list.deleteLast();

        list.delete(2);

        list.findNode(2);

        list.display();
        
    }

}
