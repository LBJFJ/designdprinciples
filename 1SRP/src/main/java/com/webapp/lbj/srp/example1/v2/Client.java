package com.webapp.lbj.srp.example1.v2;

class Terrestrial {
    public void breathe(String animal) {
        System.out.println(animal + "呼吸空气");
    }
}


class Aquatic {
    public void breathe(String animal) {
        System.out.println(animal + "呼吸水");
    }
}


public class Client {
    public static void main(String[] args) {
        Terrestrial terrestrial = new Terrestrial();
        terrestrial.breathe("牛");
        terrestrial.breathe("羊");
        terrestrial.breathe("猪");

        Aquatic aquatic = new Aquatic();
        aquatic.breathe("鱼");
    }
}
