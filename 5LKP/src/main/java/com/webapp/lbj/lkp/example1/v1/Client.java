package com.webapp.lbj.lkp.example1.v1;

public class Client {
    public static void main(String[] args) {
        CompanyManager e = new CompanyManager();
        e.printAllEmployee(new SubCompanyManager());
    }
}
