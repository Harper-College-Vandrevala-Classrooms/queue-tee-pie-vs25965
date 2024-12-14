package com.csc;

public class QueueTees<T> {

    private T[] array;
    private int start;
    private int top;

    @SuppressWarnings("unchecked")
    public QueueTees(int capacity) {
        this.array = (T[]) new Object[capacity]; // Initialize the array with the specified capacity
        this.start = 0;
        this.top = 0;
    }

    public Boolean full() {
        return top >= array.length;
    }

    public Boolean empty() {
        return start == top;
    }

    public void enqueue(T newItem) {
        if (!full()) {
            array[top] = newItem; // Add the new item to the array
            top++; // Move the top index to the next position
        } else {
            throw new IllegalStateException("Queue is full! Cannot add more items.");
        }
    }

    public T dequeue() {
        if (!empty()) {
            T itemOut = array[start];
            this.start++;
            return itemOut;
        } else {
            System.out.println("Queue is empty! Cannot dequeue.");
            return null;
        }
    }

    public int size() {
        return top - start;
    }
}
