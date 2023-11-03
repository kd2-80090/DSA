
package com.test;

public class Queue {
    private int arr[];
    private int front, rear;
    private final int SIZE;

    public Queue(int size) {
        SIZE = size;
        arr = new int[SIZE];
        front = -1;
        rear = -1;
    }

    public void enqueue(int data) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % SIZE;
        }
        arr[rear] = data;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int data = arr[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % SIZE;
        }
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return arr[front];
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        return (rear - front + SIZE) % SIZE + 1;
    }

    public boolean isFull() {
        return (rear + 1) % SIZE == front;
    }

    public boolean isEmpty() {
        return front == -1;
    }
}
