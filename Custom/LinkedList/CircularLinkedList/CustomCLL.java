package Custom.LinkedList.CircularLinkedList;

public class CustomCLL {

    Node head;
    Node tail;
    private int size;

    public CustomCLL(){
        this.head=null;
        this.tail=null;
    }

    private void insert(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
            return;
        }

        tail.next=head;
        node.next=head;
        tail=node;

        size++;
    }

    private void delete(int value){
        Node node=head;
        if(node==null){
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
            return;
        }
        if (node.value == value) {
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n=node.next;
            if (n.value == value) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node!=head);

    }


    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
        
    }
    
}
