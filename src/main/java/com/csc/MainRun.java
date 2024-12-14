package com.csc;

public class MainRun {

    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        Kitty kitty = new Kitty();
        Panda panda = new Panda();
        Puppy puppy2 = new Puppy();

        QueueTees<Cutie> queue = new QueueTees<>(3); // Initialize the queue with a capacity of 3

        System.out.println("Size with no elements: " + queue.size());
        try {
            queue.enqueue(puppy);
            queue.enqueue(kitty);
            queue.enqueue(panda);
            queue.enqueue(puppy2);

        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Elements added: " + queue.size());
        Cutie cutieOut = queue.dequeue();
        System.out.println("Cutie out: " + cutieOut.description() + " Rating: " + cutieOut.cutenessRating());
        System.out.println("Size of array: " + queue.size());
        Cutie cutieOut2 = queue.dequeue();
        System.out.println("Cutie out: " + cutieOut2.description() + " Rating: " + cutieOut2.cutenessRating());
        System.out.println("Size of array: " + queue.size());
    }
}

