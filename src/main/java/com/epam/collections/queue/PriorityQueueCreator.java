package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {

        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        List<String> mergedLists = new ArrayList<>(firstList);

        mergedLists.addAll(secondList);
        priorityQueue.addAll(mergedLists);

        return priorityQueue;
    }
}
