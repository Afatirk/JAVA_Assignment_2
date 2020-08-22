import java.util.*;
 public class LinkedList{
 private Node head;
 
private static class Node {
private int value;
private Node next;
 
Node(int value) {
this.value = value;
 
}
}
 
public void addToTheLast(Node node) {
 
if (head == null) {
head = node;
} else {
Node temp = head;
while (temp.next != null)
temp = temp.next;
 
temp.next = node;
}
}
 
 
public void printList() {
Node temp = head;
while (temp != null) {
System.out.format("%d ", temp.value);
temp = temp.next;
}
System.out.println();
}
 
 
public Node nthFromLastNode(Node head,int n)
{
Node firstPtr=head;
Node secondPtr=head;
 
for (int i = 0; i < n; i++) {
firstPtr=firstPtr.next;
 
}
 
while(firstPtr!=null)
{
firstPtr=firstPtr.next;
secondPtr=secondPtr.next;
}
 
return secondPtr;
}
 
public static void main(String[] args) {
LinkedList list = new LinkedList();
Scanner scanner  = new Scanner(System.in);
For(int i=0;i<6;i++)
{
List.addToTheLast(new Node(scanner.nextInt()));
} 
list.printList();
Node nthNodeFromLast= list.nthFromLastNode(head,3);
System.out.println("3th node from end is : "+ nthNodeFromLast.value);
 
}
 
}
