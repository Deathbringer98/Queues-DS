package com.animalshelter;

public class Main {
    public static void main(String[] args) {
        // Testing AnimalQueue
        AnimalQueue shelter = new AnimalQueue();

        shelter.enqueue(new Dog("Rex"));
        shelter.enqueue(new Cat("Whiskers"));
        shelter.enqueue(new Dog("Buddy"));
        shelter.enqueue(new Cat("Mittens"));

        System.out.println("Dequeue Any: " + shelter.dequeueAny().getName());
        System.out.println("Dequeue Dog: " + shelter.dequeueDog().getName());
        System.out.println("Dequeue Cat: " + shelter.dequeueCat().getName());
        System.out.println("Dequeue Any: " + shelter.dequeueAny().getName());

        // Testing QueueArray
        QueueArray queueArray = new QueueArray(5);
        queueArray.enQueue(1);
        queueArray.enQueue(2);
        queueArray.enQueue(3);
        queueArray.enQueue(4);

        System.out.println(queueArray.toString());

        queueArray.deQueue();
        queueArray.deQueue();

        System.out.println(queueArray.toString());

        System.out.println("The integer at the front of the queue is " + queueArray.peek() + ".");

        queueArray.deleteQueue();
        System.out.println("The queue is empty: " + queueArray.isEmpty());

        System.out.println(queueArray.toString());
    }
}
