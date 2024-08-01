package com.animalshelter;

public class QueueArray {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    public QueueArray(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enQueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        count--;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == capacity;
    }

    public void deleteQueue() {
        front = 0;
        rear = -1;
        count = 0;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Queue is empty";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Queue: ");
        for (int i = 0; i < count; i++) {
            sb.append(arr[(front + i) % capacity]).append(" ");
        }
        return sb.toString();
    }
}
