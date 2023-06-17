package com.Lab02;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        QueueX mainQueue = new QueueX(5);

        int printerQueue = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 1 ; i <= 5 ; i++){
            System.out.print("Enter transaction ID " + i + ": ");
            printerQueue = sc.nextInt();
            mainQueue.insert(printerQueue);
        }//end of for-loop
        System.out.println();

        QueueX evenQueue = new QueueX(5);
        QueueX oddQueue = new QueueX(5);

        while (!mainQueue.isEmpty()){
            /*While the main queue is not empty we remove the items and assign them to a variable called value*/
            int value = mainQueue.remove();

            /*We then check if the removed item which is now assigned to the value is odd or even
            * Based on that we add the item to the new queue which is either odd or even*/
            if(value % 2 == 0){
                evenQueue.insert(value);
            }
            else {
                oddQueue.insert(value);
            }
        }//end of while-loop

        System.out.println("PC1");
        while (!evenQueue.isEmpty()){
            System.out.println("Transaction "+evenQueue.remove());
        }
        System.out.println();
        System.out.println("PC2");
        while (!oddQueue.isEmpty()){
            System.out.println("Transaction "+oddQueue.remove());
        }
    }
}//end of MainApp


                //NOTE//

/*Question first says u have to store them in the main queue
*
* So thats why we stored them in the main queue first and then remove the items based on ODD / EVEN and place them in the new queue*/

/*If without inserting to the main queue and directly inserting to the 2 other queue ; code will look like below*/


/*       package com.Lab02;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        QueueX mainQueue = new QueueX(5);
        QueueX evenQueue = new QueueX(5);
        QueueX oddQueue = new QueueX(5);

        Scanner sc = new Scanner(System.in);

        for (int i = 1 ; i <= 5 ; i++){
            System.out.print("Enter transaction ID " + i + ": ");
            int printerQueue = sc.nextInt();
            //mainQueue.insert(printerQueue);
            if(printerQueue % 2 == 0){
                evenQueue.insert(printerQueue);
            }
            else {
                oddQueue.insert(printerQueue);
            }
        }//end of for-loop
        System.out.println();

        System.out.println("PC1");
        while (!evenQueue.isEmpty()){
            System.out.println("Transaction "+evenQueue.remove());
        }
        System.out.println();
        System.out.println("PC2");
        while (!oddQueue.isEmpty()){
            System.out.println("Transaction "+oddQueue.remove());
        }
    }
}//end of MainApp
            */

