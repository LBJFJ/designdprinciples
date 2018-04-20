package com.webapp.lbj.srp.example1.v4;

/**
 * 还有一种修改方式：
 */
public class Client {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.breatheAir("牛");
        animal.breatheAir("羊");
        animal.breatheAir("猪");
        
        animal.breatheWater("鱼");
    }
}

class Animal {
    public void breatheAir(String animal) {
        System.out.println(animal + "呼吸空气");
    }

    public void breatheWater(String animal) {
        System.out.println(animal + "呼吸水");
    }
}

/**
 * 我的原则是：
 * (1) 尽量遵守单一职责原则。
 * (2) 只有逻辑足够简单，才可以在代码级别上违反单一职责原则；只有类中方法数量足够少，才可以在方法级别上违反单一职责原则。
 */
