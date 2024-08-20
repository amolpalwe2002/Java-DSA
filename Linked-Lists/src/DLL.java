public class DLL {

    private Node head;
    private Node tail;
    private int size;

    public DLL(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(int data){
        Node node = new Node(data);
        if(this.head == null){
            this.head = node;
            this.tail = node;
        }else{
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }
        this.size++;
    }

    public void add(int data, int pos){
        Node temp = this.head;
        Node node = new Node(data);
        if(pos == 0){
            node.next = temp;
            temp.prev = node;
            this.head = node;
        }else{
            for(int i = 0; i < pos - 1; i++){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next.prev = node;
            temp.next = node;
            node.prev = temp;
        }
        this.size++;
    }

    public void display(){
        Node temp = this.head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
        temp = this.tail;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public void remove(int pos){
        if(pos == 0){
            this.head = this.head.next;
            this.head.prev = null;
        }
        else if(pos == this.size - 1){
            this.tail = this.tail.prev;
            this.tail.next = null;
        }
        else{
            Node temp = get(pos -1);
            temp.next = temp.next.next;
            temp.next.prev = temp;
        }
        this.size--;
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
        private Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    
}
