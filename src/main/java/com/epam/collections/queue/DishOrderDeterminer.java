package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {

        LinkedList<Integer> dishList = new LinkedList<>();
        LinkedList<Integer> dishOrder = new LinkedList<>();

        for (int i = 1; i <= numberOfDishes; i++) {

            dishList.addLast(i);
        }

        int i = 1;
        while (!dishList.isEmpty()) {

            int dish = dishList.poll();

            if (i % everyDishNumberToEat == 0) {

                dishOrder.add(dish);

            } else {
                dishList.offer(dish);
            }

            i++;
        }

        return dishOrder;
    }



}



