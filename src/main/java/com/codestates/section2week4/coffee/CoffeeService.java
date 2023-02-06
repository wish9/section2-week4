package com.codestates.section2week4.coffee;

public class CoffeeService {
    private static CoffeeRepository coffeeRepository;

    public CoffeeService(CoffeeRepository coffeeRepository){
        this.coffeeRepository = coffeeRepository;
    }

    public void createCoffee(Coffee coffee) {
        coffeeRepository.postCoffee(coffee);
    }

    public Coffee editCoffee(Long coffeeId, String korName, int price) {
        return coffeeRepository.patchCoffee(coffeeId, korName, price);
    }

    public Coffee getCoffee(Long coffeeId) {
        return coffeeRepository.getCoffee(coffeeId);
    }
    public void deleteCoffee(Long coffeeId) {
        coffeeRepository.deleteCoffee(coffeeId);
    }
}
