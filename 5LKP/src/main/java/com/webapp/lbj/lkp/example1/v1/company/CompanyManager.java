package com.webapp.lbj.lkp.example1.v1.company;

import java.util.ArrayList;
import java.util.List;
import com.webapp.lbj.lkp.example1.v1.subcompany.SubCompanyManager;
import com.webapp.lbj.lkp.example1.v1.subcompany.SubEmployee;

public class CompanyManager {

    public void printAllEmployee(SubCompanyManager subCompanyManager) {
        List<SubEmployee> subEmployeeList = subCompanyManager.getAllEmployee();
        for (SubEmployee subEmployee : subEmployeeList) {
            System.out.println(subEmployee.getId());
        }

        List<Employee> employeeList = this.getAllEmployee();
        for (Employee employee : employeeList) {
            System.out.println(employee.getId());
        }
    }
    
    private List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<Employee>();
        for (int i = 0; i < 30; i++) {
            Employee emp = new Employee();
            // 为总公司人员按顺序分配一个ID
            emp.setId("总公司" + i);
            list.add(emp);
        }
        return list;
    }
}
