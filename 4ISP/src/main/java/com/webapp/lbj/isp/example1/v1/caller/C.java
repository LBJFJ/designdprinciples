package com.webapp.lbj.isp.example1.v1.caller;

import com.webapp.lbj.isp.example1.v1.calle.I;

public class C {
    public void depend1(I i) {
        i.method1();
    }

    public void depend2(I i) {
        i.method4();
    }

    public void depend3(I i) {
        i.method5();
    }
}
