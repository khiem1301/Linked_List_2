public class MyLinkedList {
    private Node head;
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    public void addLast(int data){
        Node newNode = new Node(data);
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
    
    public void add(int data, int index){
        Node newNode = new Node(data);
        if(index ==0){  
            addFirst(data);
        } else {
            Node temp = head;
            for(int i = 0; i < index-1; i++){
                temp = temp.next;
            }
            Node nextNode = temp.next;
            temp.next = newNode; 
            newNode.next = nextNode;  
        }
    }
  
    public int length(){
        int i = 1;
        Node temp = head;    
        if(temp == null){
            return 0;
        } else {
            while(temp.next != null){
                temp = temp.next;
                i++;
            } 
            return i;
        }
    }
    
    public void display(int length){
        Node temp = head;
        if(length == 1){
            System.out.println(temp.getData());
        } else if(length == 0){
            System.out.println("Empty");
        } else {
            System.out.print(temp.getData() + " ");
            do{
                temp = temp.next;
                System.out.print(temp.getData() + " ");
            } while(temp.next != null);
        }
        System.out.println();
    }
    
    public void deleteFirst(){
        if(head != null){
            head = head.next;
        }
    }
    
    public static void main(String[] args) {
        MyLinkedList LinkedList = new MyLinkedList();
        LinkedList.addFirst(1);
        LinkedList.addFirst(2);
        LinkedList.addFirst(3);
        LinkedList.addLast(5);
        LinkedList.addLast(6);
        LinkedList.addLast(7);
        
        System.out.println("Node length:");
        System.out.println(LinkedList.length());
        System.out.println("Node display:");
        LinkedList.display(LinkedList.length());
        
        LinkedList.deleteFirst();
        System.out.println("----TEST DELETE----");//
        System.out.println("Node length:");
        System.out.println(LinkedList.length());
        System.out.println("node display:");
        LinkedList.display(LinkedList.length());
    }
}
