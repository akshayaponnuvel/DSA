package Custom.LinkedList.DoubleLinkedList;

public class CustomDoubleLL {

    private Node head;
    private Node last;
    private int size;

    public CustomDoubleLL(){
        this.size=0;
    }

    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        node.previous=null;
        if (head!=null) {
            head.previous=node;
        }
        head=node;
        size++;
    }

    public void insertLast(int value){
        Node node=new Node(value);
        Node last=head;
        node.next=null;

        if (head==null) {
            insertFirst(value);
            return;
        }

        while (last.next!=null) {
            last=last.next;
        }

        last.next=node;
        node.previous=last;

        size++;
    }

    public void insert(int after,int value){
        Node node=new Node(value);
        Node temp=find(after);

        if(temp==null){
            System.out.println("does not exist");
            return;
        }

        node.next=temp.next;
        temp.next=node;
        node.previous=temp;

        if(node.next!=null){
            node.next.previous=node;
        }

        size++;
    }

    public void deleteFirst(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
        }
        else{
            head=head.next;
            head.previous=null;
        }
        size--;
    }

    public void deleteLast(){
        Node node=head;
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
        }
        else{
            while (node.next.next!=null) {
                node=node.next;
            }
            node.next=null;
        }
        size--;
    }

    public void delete(int index){
        if(index==0){
            deleteFirst();
            return;
        }
        if(index==size-1){
            deleteLast();
            return;
        }
        Node node=get(index);
        node.previous.next=node.next;
        node.next.previous=node.previous;
    }

    private Node get(int i) {
        Node node=head;
        for (int j = 0; j < i; j++) {
            node=node.next;
        }
        return node;
    }

    public Node find(int value){
        Node node=new Node(value);
        node=head;
        while (node!=null) {
            if (node.value==value) {
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public void display(){
        Node temp=head;
        Node last=null;
        while (temp!=null) {
            System.out.print(temp.value+ " -> ");
            last=temp;
            temp=temp.next;
        }
        System.out.println("END");

        while (last!=null) {
            System.out.print(last.value + " -> ");
            last=last.previous;
        }
        System.out.println("START");
    }

    private class Node{
        private int value;
        private Node next;
        private Node previous;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }

    }
}
