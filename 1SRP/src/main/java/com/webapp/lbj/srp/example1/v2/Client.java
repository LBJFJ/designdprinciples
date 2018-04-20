package com.webapp.lbj.srp.example1.v2;

/**
 * 程序上线后，发现问题了，并不是所有的动物都呼吸空气的，比如鱼就是呼吸水的。
 * 修改时如果遵循单一职责原则，需要将Animal类细分为陆生动物类Terrestrial，水生动物Aquatic，代码如下。
 * 
 * 我们会发现如果这样修改花销是很大的，除了将原来的类分解之外，还需要修改客户端。
 */
public class Client {
    public static void main(String[] args) {
        //陆栖动物
        Terrestrial terrestrial = new Terrestrial();
        terrestrial.breathe("牛");
        terrestrial.breathe("羊");
        terrestrial.breathe("猪");

        //水栖动物
        Aquatic aquatic = new Aquatic();
        aquatic.breathe("鱼");
    }
}

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
