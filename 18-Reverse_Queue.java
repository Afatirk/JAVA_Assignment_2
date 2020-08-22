import java.util.*;
public class Queue_reverse {
     
    static Queue<Integer> queue;
 
    static void Print()
    {
        while (!queue.isEmpty()) {
            System.out.print( queue.peek() + ", ");
            queue.remove();
        }
    }
 
    static void reversequeue()
    {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.add(queue.peek());
            queue.remove();
        }
        while (!stack.isEmpty()) {
            queue.add(stack.peek());
            stack.pop();
        }
    }
     public static void main(String args[])
    {
        queue = new LinkedList<Integer>();
for(int i=0;i<10;i++)
{
queue.add(i );
}
reversequeue();
        Print();
    }
}
