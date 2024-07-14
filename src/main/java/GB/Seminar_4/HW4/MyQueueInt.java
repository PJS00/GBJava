package GB.Seminar_4.HW4;


import java.util.LinkedList;


public class MyQueueInt {

    LinkedList<Integer> integer_dequeue = new LinkedList<Integer>();

    public void enqueue(int element){
        // Напишите свое решение ниже
        integer_dequeue.addLast(element);
    }

    public int dequeue(){
        // Напишите свое решение ниже
        return integer_dequeue.pollFirst();
    }

    public int first(){
        // Напишите свое решение ниже
        return integer_dequeue.peekFirst();
    }

    public LinkedList<Integer> getElements() {
        // Напишите свое решение ниже
        return integer_dequeue;
    }
}
