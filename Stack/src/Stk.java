import java.util.ArrayList;

public class Stk {

    private int top;
    private ArrayList<Integer> stk = new ArrayList<>();
    private int size;

    public Stk(){
        this.top = -1;
        this.size = 0;
    }

    public void push(int data){
        this.top++;
        this.stk.add(data);
        this.size++;
    }

    public int pop(){
        this.top--;
        this.size--;
        return this.stk.remove(this.top+1);
    }

    public int size(){
        return this.size;
    }

    public int top(){
        return this.stk.get(this.top);
    }

    public boolean isEmpty(){
        return this.top == -1;
    }

    public void display(){
        System.out.println(this.stk);
    }


    
}
