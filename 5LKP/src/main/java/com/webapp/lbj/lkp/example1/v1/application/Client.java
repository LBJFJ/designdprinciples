package com.webapp.lbj.lkp.example1.v1.application;

import com.webapp.lbj.lkp.example1.v1.company.CompanyManager;
import com.webapp.lbj.lkp.example1.v1.subcompany.SubCompanyManager;

public class Client {
    public static void main(String[] args) {
        CompanyManager companyManager = new CompanyManager();
        companyManager.printAllEmployee(new SubCompanyManager());
    }
}
