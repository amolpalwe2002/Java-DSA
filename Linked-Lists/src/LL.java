public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(int data) {
        Node node = new Node(data);
        if(this.head == null){
            this.head = node;
            this.tail = node;
            size++;
        }else{
            this.tail.next = node;
            this.tail = node;
            size++;
        }
    }

    public void add(int data, int pos){
        Node node = new Node(data);
        if(pos == 0){
            node.next = this.head;
            this.head = node;
            size++;
        }else{
            Node temp = this.head;
            for(int i = 0; i < pos - 1; i++){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }

    public void remove(int pos){
        if(pos == 0){
            this.head = this.head.next;
            size--;
        }else{
            Node temp = this.head;
            for(int i = 0; i < pos - 1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    public void remove(){
        this.remove(this.size()-1);
    }

    public void display(){
        Node temp = this.head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }   
        System.out.println("null");
    }

    public int size(){
        return this.size;
    }

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
}
