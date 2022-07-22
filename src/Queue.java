import java.util.*;

class Queue_Ex {
    public static void main(String args[])
    {
        // Creating empty LinkedList
        Queue<Integer> num  = new LinkedList<Integer>();
        // using add()
        num.add(10);
        num.add(12);
        num.add(15);
        num.add(28);
        num.add(35);
        System.out.println("Queue: " + num);
        System.out.println("The size of queue :" +num.size());
        System.out.println("Removing the first element in Queue :" + num.remove());
        System.out.println("Updated queue : " + num);
        num.add(55);
        num.add(80);
        System.out.println("Updated queue with add() : " +num);
        System.out.println("Head value of the queue lies in " + num.peek());
        System.out.println("removing the head element with next element :" +num.peek());
        System.out.println("The Final updated Queue : " +num);
    }
}
