public class SortList {   
public class Node{  
int data;  
Node next;  
public Node(int data) {  
this.data = data;  
}  
}   
public Node head = null;  
public Node tail = null;  
//This function will add the new node at the end of the list.  
public void add(int data){  
Node newNode = new Node(data);    
if(head == null) {  
head = newNode;  
tail = newNode;  
newNode.next = head;  
}  
else {  
//tail will point to new node.  
tail.next = newNode;  
//New node will become new tail.  
tail = newNode;  
tail.next = head;  
}  
}  
public void sortList() {  
//Current will point to head  
Node current = head, index = null;  
int temp;  
if(head == null) {  
System.out.println("List is empty");  
}  
else {  
do{  
//Index will point to node next to current  
index = current.next;  
while(index != head) {  
//If current node is greater than index data, swaps the data  
if(current.data > index.data) {  
temp =current.data;  
current.data= index.data;  
index.data = temp;  
}  
index= index.next;  
}  
current =current.next;  
}while(current.next != head);  
}  
}  
public void display() {  
Node current = head;  
if(head == null) {  
System.out.println("List is empty");  
}  
else {  
 do{  

System.out.print(" "+ current.data);  
current = current.next;  
}while(current != head);  
System.out.println();  
}  
}  
public static void main(String[] args) {  
SortList cl = new SortList();  
cl.add(70);  
cl.add(90);  
cl.add(20);  
cl.add(100);  
cl.add(50);  
//Displaying original list  
System.out.println("Original list: ");  
cl.display();  
//Sorting list  
cl.sortList();  
//Displaying sorted list  
System.out.println("Sorted list: ");  
cl.display();  
}}  
