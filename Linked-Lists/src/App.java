public class App {
    public static void main(String[] args){
        // LL linkedList = new LL();

        // linkedList.add(1);
        
        // linkedList.add(2); 
        // linkedList.add(3);
        // linkedList.add(4);
        // linkedList.add(5);

        // linkedList.add(20, 3);
        // linkedList.add(10, 0);
        // linkedList.remove();
        // linkedList.remove(3);
        // linkedList.display();
        // System.out.println("Size of LL: "+linkedList.size());



        // DLL linkedList = new DLL();
        // linkedList.add(1);
        // linkedList.add(2);
        // linkedList.add(3);
        // linkedList.add(4);
        // linkedList.add(20, 3);
        // linkedList.add(10, 0);

        // linkedList.remove(linkedList.size()-1);
        // linkedList.remove(3);

        // linkedList.display();

        // System.out.println("Size of DLL: "+linkedList.size());


        CLL linkedList = new CLL();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(20, 3);
        linkedList.add(10, 0);
        linkedList.remove(3);
        linkedList.remove();
        linkedList.remove(0);

        linkedList.display();
        System.out.println("Size of CLL: "+linkedList.size());
    }
}
