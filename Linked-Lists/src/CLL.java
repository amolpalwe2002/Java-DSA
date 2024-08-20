public class CLL {

    private Node head;
    private Node tail;
    private int size;

    public CLL(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(int data){
        Node node = new Node(data);
        if(this.head == null){
            this.head = node;
            this.tail = node;
        }
        else{
            this.tail.next = node;
            node.next = this.head;
            this.tail = node;
        }
        this.size++;
    }

    public void add(int data, int pos){
        Node temp = this.head;
        Node node = new Node(data);
        if(pos == 0){
            node.next = temp;
            this.tail.next = node;
            this.head = node;
        }else{
            for(int i = 0; i < pos - 1; i++){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
        this.size++;
    }

    public void display(){
        Node temp = this.head;
        while(temp != this.tail){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(this.tail.data+" --> " + this.tail.next.data);
    }

    public void remove(){
        Node temp = this.head;
        while(temp.next != this.tail){
            temp = temp.next;
        }
        temp.next = this.head;
        this.tail = temp;
        this.size--;
    }

    public void remove(int pos){
        if(pos == 0){
            this.head = this.head.next;
            this.tail.next = this.head;
        }else{
            Node temp = this.get(pos - 1);
            temp.next = temp.next.next;
            this.tail.next = temp.next;
        }
        this.size--;
    }

    public void displayReverse(){
        Node temp = this.tail;
        while(temp != this.head){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println(this.head.data+" --> " + this.head.next.data);
    }

    public int size(){
        return this.size;
    }

    public Node get(int index){
        Node temp = this.head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }
    private class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    
}
