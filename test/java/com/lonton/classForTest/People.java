package com.lonton.classForTest;

import com.lonton.tools.BaseBean;

public class People extends BaseBean {

    String name;
    
    Food food;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public String food() {
        
       return food.say();

    }
}
