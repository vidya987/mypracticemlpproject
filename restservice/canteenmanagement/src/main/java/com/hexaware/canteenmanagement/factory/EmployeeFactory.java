package com.hexaware.canteenmanagement.factory;

import com.hexaware.canteenmanagement.model.Customer;
import com.hexaware.canteenmanagement.persistence.DbConnection;
import com.hexaware.canteenmanagement.persistence.CustomerDAO;
/**
 * This class used to create DbConnection object and creating the db connection through DbConnection.
 */
public class EmployeeFactory {
   /**
    * dao() used to create database connection.
    * @return the DB object.
    */
  private static CustomerDAO dao() {
    DbConnection dbConnection = new DbConnection();
    return dbConnection.getConnect().onDemand(CustomerDAO.class);
  }
   /**
    * employeeDetails() used call list the employee by using their Id.
    * @param argEmpId to initialize employee id.
    * @return the Customer object.
    */
  public static Customer employeeDetail(final int argEmpId) {
   Customer emp = dao().listById(argEmpId);
    return emp;
  }
}
