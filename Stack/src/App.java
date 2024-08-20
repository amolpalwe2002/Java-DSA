public class App {
    public static void main(String[] args) throws Exception {
        
        Stk stack = new Stk();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        stack.display();
    }
}
