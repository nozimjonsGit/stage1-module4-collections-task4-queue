package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }

        List<Integer> dishOrder = new ArrayList<>();

        while (!queue.isEmpty()) {

            for (int i = 1; i <= everyDishNumberToEat; i++) {

                if (i == everyDishNumberToEat) {
                    dishOrder.add(queue.poll());
                } else {
                    queue.offer(queue.poll());
                }
            }
        }

        return dishOrder;
    }
}
