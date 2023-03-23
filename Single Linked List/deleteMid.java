public class deleteMid{  
class Node{  
int data;  
Node next;  
public Node(int data)  
{  
this.data = data;  
this.next = null;  
}  
}  
public Node head = null;  
public Node tail = null;  
  
public int size;  
//addNode() will add a new node to the list  
 public void addNode(int data) {  
//Create a new node  
 Node newNode = new Node(data);  
//Checks if the list is empty  
if(head == null) {  
 //If list is empty, both head and tail will point to new node  
head = newNode;  
tail = newNode;  
}  
else {  
//newNode will be added after tail such that tail's next will point to newNode  
tail.next = newNode;  
tail = newNode;  
}  
size++;  
}  
//deleteFromMid() will delete a node from the middle of the list  
void deleteFromMid() {  
Node temp, current;  
//Checks if the list is empty  
if(head == null) {  
System.out.println("List is empty");  
return;  
}  
else {
 int count = (size % 2 == 0) ? (size/2) : ((size+1)/2);  
//Checks whether the head is equal to the tail or not, if yes then the list has only one node.  
if( head != tail ) {  
temp = head;  
current = null;   
for(int i = 0; i < count-1; i++){  
current = temp;  
temp = temp.next;  
}  
if(current != null) {   
 current.next = temp.next;   
 temp = null;  
 }  
 else {  
head = tail = temp.next;  
temp = null;  
}  
}  
else {  
head = tail = null;  
}  
}  
size--;  
}  
public void display() {   
Node current = head;  
if(head == null) {  
System.out.println("List is empty");  
 return;  
        }  
        while(current != null) {  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
  
public static void main(String[] args) {  
  
        deleteMid sList = new deleteMid();  
        sList.addNode(1);  
        sList.addNode(2);  
        sList.addNode(3);  
        sList.addNode(4);  
        System.out.println("Original List: ");  
        sList.display();  
  
        while(sList.head != null) {  
            sList.deleteFromMid();  
            System.out.println("Updated List: ");  
            sList.display();  
        }  
    }  
}  
