public class InsertAtStart {    
        public class Node{  
            int data;  
            Node next;  
            public Node(int data) {  
                this.data = data;  
            }  
        }    
        public Node head = null;  
        public Node tail = null;   
        public void addAtStart(int data){  
            //Create new node  
            Node newNode = new Node(data);  
            if(head == null) {  
                head = newNode;  
                tail = newNode;  
                newNode.next = head;  
            }  
            else {  
                Node temp = head;  
      
                newNode.next = temp;  
                head = newNode;  
    
                tail.next = head;  
            }  
        }  
        public void display() {  
            Node current = head;  
            if(head == null) {  
                System.out.println("List is empty");  
            }  
            else {  
                System.out.println("Adding nodes to the start of the list: ");  
                 do{  
                    //Prints each node by incrementing pointer.  
                    System.out.print(" "+ current.data);  
                    current = current.next;  
                }while(current != head);  
                System.out.println();  
            }  
        }  
  
        public static void main(String[] args) {  
            InsertAtStart cl = new InsertAtStart();  
  
            //Adding 1 to the list  
            cl.addAtStart(1);  
            cl.display();  
            //Adding 2 to the list  
            cl.addAtStart(2);  
            cl.display();  
            //Adding 3 to the list  
            cl.addAtStart(3);  
            cl.display();  
            //Adding 4 to the list  
            cl.addAtStart(4);  
            cl.display();  
        }  
}  
