
public class Runner {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(7);
        list.insertAtStart(97);
        list.insertAtIndex(56,2 );
        list.show();

        list.reverseList();
        System.out.println();
        list.show();
    }
}
