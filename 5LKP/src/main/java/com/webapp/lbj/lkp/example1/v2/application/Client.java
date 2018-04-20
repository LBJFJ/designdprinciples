package com.webapp.lbj.lkp.example1.v2.application;

import com.webapp.lbj.lkp.example1.v2.company.CompanyManager;
import com.webapp.lbj.lkp.example1.v2.subcompany.SubCompanyManager;

public class Client {
    public static void main(String[] args) {
        CompanyManager companyManager = new CompanyManager();
        companyManager.printAllEmployee(new SubCompanyManager());
    }
}
