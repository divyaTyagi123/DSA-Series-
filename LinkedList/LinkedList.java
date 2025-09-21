
public class LinkedList {
    Node head;

    public void insert(int data){
        Node newNode = new Node();
        newNode.data = data;
        
        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void insertAtStart(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;

    }

    public void insertAtIndex(int data , int index){
        Node newNode = new Node();
        newNode.data = data;

        Node temp = head;

        for(int i = 0; i< index-1 ;i++){
            if(temp.next == null){
                System.out.println("Index out of bounds");
            }
            temp = temp.next;
        }
        newNode.next = temp.next ;
        temp.next = newNode;
    }


    public void deleteAt(int index){
        Node temp = head;
        if(index == 0){
            head = head.next ;
        }else{
            for(int i = 0; i <index-1;i++){
                temp = temp.next;
            }

            temp.next = temp.next.next;
        }
    }

    public void show(){
        Node temp = head;

        while(temp !=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void reverseList(){
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while(current != null){
            next = current.next;     // save next
            current.next = prev;    // reverse pointer
            prev = current;
            current = next;
        }

        head = prev;
    }
} 
