package com.webapp.lbj.isp.example1.v2.caller;

import com.webapp.lbj.isp.example1.v2.calle.I1;
import com.webapp.lbj.isp.example1.v2.calle.I3;

public class C {
    public void depend1(I1 i) {
        i.method1();
    }

    public void depend2(I3 i) {
        i.method4();
    }

    public void depend3(I3 i) {
        i.method5();
    }
}
