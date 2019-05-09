package Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> waitingQueue = new LinkedList<>();
        waitingQueue.add("Een");
        waitingQueue.add("twee");
        waitingQueue.add("drie");

        System.out.println("waitingQueue " + waitingQueue);

        System.out.println(waitingQueue.remove());

        System.out.println("New waitingQueue " + waitingQueue);



        PriorityQueue<String> brands = new PriorityQueue<>();
        brands.add("Samsung");
        brands.add("Apple");
        brands.add("Lg");

        System.out.println("PriorityQueue " + brands);

        brands.forEach(brand -> {System.out.println(brand);});





    }
}
