package Round2;


public class Sum {

    Node head;
    Node tail;
    static int size;

    public Sum(){
        this.size=0;
    }


    public void insertLast(int value){
        Node node=new Node(value);
        if(tail==null){
            node.next=head;
            head=node;
            tail=head;
            return;
        }
        
        tail.next=node;
        tail=node;

        size++;
    }

    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        } 
    }
    
    public class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {

        String[] arr={"1", "1345", "56"}; 

        Sum list=new Sum();
        
        for (int i = 0; i < arr.length; i++) {
            int a=Integer.valueOf(arr[i]);
            list.insertLast(a);
        }

        list.display();

        int sum=0;
        for (int i = 0; i < size; i++) {
        }

    }
}
