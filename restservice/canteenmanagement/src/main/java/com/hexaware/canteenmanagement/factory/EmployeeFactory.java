package com.hexaware.canteenmanagement.factory;

import com.hexaware.canteenmanagement.model.Employee;
import com.hexaware.canteenmanagement.persistence.DbConnection;
import com.hexaware.canteenmanagement.persistence.EmployeeDAO;
import java.util.List;

public class EmployeeFactory {
    private static EmployeeDAO dao() {
        DbConnection db = new DbConnection();
        return db.getConnect().onDemand(EmployeeDAO.class);
      }
  
    public static Employee employeeDetail(final int empId) {
        Employee emp = dao().listById(empId);
        return emp;
    }
}