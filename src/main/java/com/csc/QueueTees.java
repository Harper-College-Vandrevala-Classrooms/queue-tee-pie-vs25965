package com.csc;

 class QueueTees {

  Cutie[] cutiesArray = new Cutie[3];
   int start;
   int top;

  QueueTees ( )
  {
    this.start = 0;
    this.top = 0;
  }
  Boolean full()
  {
   return top >= cutiesArray.length;
  }
  Boolean empty()
  {
    return start == top;
  }
  public void enqueue(Cutie newCutie)
  {
    if (!full()) { 
      cutiesArray[top] = newCutie; // Add the new Cutie to the array
      top++; // Move the top index to the next position
     } else {
      throw new IllegalStateException("Queue is full! Cannot add more Cuties.");
      }
      
  }
  public Cutie dequeue()
  {
    if (!empty())
    {
      Cutie cutieOut = cutiesArray[start]; 
      this.start++;
      return cutieOut;
    }
    else{
      System.out.println("Queue is empty! Cannot dequeue.");
      return null; 
    }
  }
  public int size()
  {
   return top - start; 
  }
}
