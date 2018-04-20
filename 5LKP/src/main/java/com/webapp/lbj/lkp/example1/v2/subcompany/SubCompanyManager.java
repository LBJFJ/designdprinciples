package com.webapp.lbj.lkp.example1.v2.subcompany;

import java.util.ArrayList;
import java.util.List;

public class SubCompanyManager {
    
    public void printEmployee() {
        List<SubEmployee> list = this.getAllEmployee();
        for (SubEmployee e : list) {
            System.out.println(e.getId());
        }
    }
    
    private List<SubEmployee> getAllEmployee() {
        List<SubEmployee> list = new ArrayList<SubEmployee>();
        for (int i = 0; i < 100; i++) {
            SubEmployee emp = new SubEmployee();
            // 为分公司人员按顺序分配一个ID
            emp.setId("分公司" + i);
            list.add(emp);
        }
        return list;
    }
}
