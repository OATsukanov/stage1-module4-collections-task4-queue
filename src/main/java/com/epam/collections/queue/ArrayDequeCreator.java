package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {

        ArrayDeque<Integer> firstArrayDeque = new ArrayDeque<>(firstQueue);
        ArrayDeque<Integer> secondArrayDeque = new ArrayDeque<>(secondQueue);

        ArrayDeque<Integer> thirdArrayDeque = new ArrayDeque<>();

        thirdArrayDeque.addLast(firstArrayDeque.poll());
        thirdArrayDeque.addLast(firstArrayDeque.poll());
        thirdArrayDeque.addLast(secondArrayDeque.poll());
        thirdArrayDeque.addLast(secondArrayDeque.poll());

        while (!firstArrayDeque.isEmpty() || !secondArrayDeque.isEmpty()) {

            firstArrayDeque.add(thirdArrayDeque.pollLast());
            thirdArrayDeque.offerLast(firstArrayDeque.poll());
            thirdArrayDeque.offerLast(firstArrayDeque.poll());

            secondArrayDeque.add(thirdArrayDeque.pollLast());
            thirdArrayDeque.offerLast(secondArrayDeque.poll());
            thirdArrayDeque.offerLast(secondArrayDeque.poll());
        }

        return thirdArrayDeque;
    }
}
