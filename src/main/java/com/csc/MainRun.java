package com.csc;

public class MainRun {

    public static void main(String[] args) {
      Puppy puppy = new Puppy();
      Kitty kitty = new Kitty();
      Panda panda = new Panda();    
      Puppy puppy2 = new Puppy(); 

      QueueTees queue = new QueueTees();

      System.out.println("size with no elements: " + queue.size());
      try {
          queue.enqueue(puppy);
          queue.enqueue(kitty);
          queue.enqueue(panda);
          queue.enqueue(puppy2);
    
      } catch (IllegalStateException e) {
        System.out.println(e.getMessage());
      }
      
      System.out.println("element added: " + queue.size());
      Cutie cutie_out = queue.dequeue();
      System.out.println("Cutie out: " + cutie_out.description() + "Rating: " + cutie_out.cutenessRating());
      System.out.println("size of array: " + queue.size() );
      Cutie cutie_out2 = queue.dequeue();
      System.out.println("Cutie out: " + cutie_out2.description() + "Rating: " + cutie_out2.cutenessRating());
      System.out.println("size of array: " + queue.size() );
      
      }
}

