package com.webapp.lbj.isp.example1.v2.application;

import com.webapp.lbj.isp.example1.v2.calle.B;
import com.webapp.lbj.isp.example1.v2.calle.D;
import com.webapp.lbj.isp.example1.v2.caller.A;
import com.webapp.lbj.isp.example1.v2.caller.C;

public class Client {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D());
        c.depend2(new D());
        c.depend3(new D());
    }
}
