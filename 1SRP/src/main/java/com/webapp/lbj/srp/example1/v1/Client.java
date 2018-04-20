package com.webapp.lbj.srp.example1.v1;

/**
 * 举例说明，用一个类描述动物呼吸这个场景：
 */
public class Client {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.breathe("牛");
        animal.breathe("羊");
        animal.breathe("猪");
    }
}

class Animal {
    public void breathe(String animal) {
        System.out.println(animal + "呼吸空气");
    }
}