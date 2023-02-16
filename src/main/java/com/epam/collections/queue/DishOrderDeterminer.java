package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {

    List<Integer> dishList = new LinkedList<>();
    List<Integer> dishOrder = new ArrayList<>();

    for (int i = 1; i <= numberOfDishes; i++) {

        dishList.add(numberOfDishes, i);
    }

    while (dishList.size() > 0) {

        for (int element : dishList) {

            if (dishList.size() < everyDishNumberToEat) {

                if (dishList.indexOf(element) % everyDishNumberToEat == 0) {

                    dishOrder.add(numberOfDishes, element);
                    dishList.remove(element);
                }
            } else {

                dishOrder.add(numberOfDishes, element);
                dishList.remove(element);
            }
        }
    }

        return dishOrder;
    }



}



