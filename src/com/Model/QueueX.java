package com.Model;

public class QueueX {

    /*First we have to have an array*/
    private int[] queArray;

    /*Then there should be a size*/
    private int maxSize; //size of the queArray

    /*Apart frm the array we have to maintain 2 int index variables
    * called front and rear*/
    private int front; //front of the queue
    private int rear; //rear of the queue

    /*Lastly we have another variable to indicate how many current items/elements are there
    * inside the queue*/
    private  int nItems; //no of items in the queue


    public QueueX(int s) { //constructor
        maxSize = s; //set array size
        queArray = new int[maxSize]; //implement the array
        front = 0;
        rear = -1;
        nItems = 0; //newly created array , no elements
    }

    /*Now lets create the methods*/

    /*Insert method does not return anything
    * we just pass a int value*/
    public void insert(int j){
        /*insertion is happening at the rear
        * so first of all increment the rear by 1*/
        //rear++;

        /*Then u have to access the array and insert the value*/
        //queArray[rear] = j;

        /*Also we have to check whether the queue is full*/
        if(rear == maxSize-1){
            System.out.println("Queue is full");
        }
        else{
            /*U can write the above in just one line*/
            queArray[++rear] = j;
            /*Finally make sure to increment the no of items by 1*/
            nItems++;
        }
    }



    /*For remove there is a return statement*/
    public int remove(){

        /*We have to check whether the queue is empty
        * to check whether queue is empty we use the nItems*/
        if(nItems == 0){
            System.out.println("Queue is empty");
            return -99;
        }
        else
            nItems--;
        /*First of all u have to have a return statement
         * Wht ur returning is the front value*/
        /*And also the return statement is the last statement*/
        return queArray[front++];

        /*After that front has to be incremented by one*/
        //front++;

        /*no of items need to be decremented by 1*/
        //nItems--;  we have to take this statment to the front becuz return is the last statement
    }


    /*PeekFront method is similar to remove, just need some slight modifications*/
    public int peekFront(){

        /*We have to check whether the queue is empty
         * to check whether queue is empty we use the nItems*/
        if(nItems == 0){
            System.out.println("Queue is empty");
            return -99;
        }
        else
            /*First of all u have to have a return statement
             * Wht ur returning is the front value*/
            /*And also the return statement is the last statement*/
            return queArray[front];
    }


    public boolean isEmpty(){
        if (nItems == 0)
            return true;
        else
            return false;
        /*can write in one line*/
        //return (nItems == 0);
    }

    public boolean isFull(){
        if (rear == maxSize-1)
            return true;
        else
            return false;

        /*Can write in one line*/
        //return (rear == maxSize-1);
    }
}//end of QueueX class


