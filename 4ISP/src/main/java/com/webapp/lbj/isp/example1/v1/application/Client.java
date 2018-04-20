package com.webapp.lbj.isp.example1.v1.application;

import com.webapp.lbj.isp.example1.v1.calle.B;
import com.webapp.lbj.isp.example1.v1.calle.D;
import com.webapp.lbj.isp.example1.v1.caller.A;
import com.webapp.lbj.isp.example1.v1.caller.C;

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
