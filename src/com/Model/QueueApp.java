package com.Model;

public class QueueApp {
    public static void main(String[] args) {
        QueueX queue = new QueueX(10); //create a queue with max size 10

        queue.insert(10);
        queue.insert(25);
        queue.insert(55);
        queue.insert(65);
        queue.insert(85);

        /*5 filled locations
        * 5 Empty locations*/

        while (!queue.isEmpty()){
            System.out.println(queue.remove());
            
        }
    }
}//end of class





