package com.codestates.section2week4.coffee;

import java.util.HashMap;
import java.util.Map;

public class CoffeeRepository {
    private static Map<Long, Coffee> drinks = new HashMap<>();

    public void postCoffee(Coffee coffee) {
        drinks.put(coffee.getCoffeeId(), coffee);
    }

    public Coffee patchCoffee(Long coffeeId, String korName, int price) {
        Coffee drink = drinks.get(coffeeId);
        drink.setKorName(korName);
        drink.setPrice(price);

        return drinks.put(coffeeId, drink);
    }

    public Coffee getCoffee(Long coffeeId) {
        return drinks.get(coffeeId);
    }

    public void deleteCoffee(Long coffeeId) {
        drinks.remove(coffeeId);
    }
}
