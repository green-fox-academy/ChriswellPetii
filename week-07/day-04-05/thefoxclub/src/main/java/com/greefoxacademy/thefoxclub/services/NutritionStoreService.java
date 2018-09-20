package com.greefoxacademy.thefoxclub.services;

import com.greefoxacademy.thefoxclub.models.Drinks;
import com.greefoxacademy.thefoxclub.models.Foods;
import org.springframework.stereotype.Service;

@Service
public class NutritionStoreService {
    private Foods foods = new Foods();
    private Drinks drinks = new Drinks();

    public String findFoodByName(String name) {
        for (int i = 0; i < foods.getFoodList().size(); i++) {
            if (foods.getFoodList().get(i).equals(name)) {
                return foods.getFoodList().get(i);
            }
        }
        return null;
    }

    public String findDrinkByName(String name) {
        for (int i = 0; i < drinks.getDrinkList().size(); i++) {
            if (drinks.getDrinkList().get(i).equals(name)) {
                return drinks.getDrinkList().get(i);
            }
        }
        return null;
    }

    public Foods getFoods() {
        return foods;
    }

    public Drinks getDrinks() {
        return drinks;
    }
}
