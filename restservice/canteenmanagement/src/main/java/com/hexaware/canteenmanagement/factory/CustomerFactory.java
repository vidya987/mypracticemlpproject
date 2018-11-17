package com.hexaware.canteenmanagement.factory;

import com.hexaware.canteenmanagement.model.Customer;
import com.hexaware.canteenmanagement.persistence.DbConnection;
import com.hexaware.canteenmanagement.persistence.CustomerDAO;
/**
 * This class used to create DbConnection object and creating the db connection through DbConnection.
 */
final class CustomerFactory {
  private CustomerFactory() {

  }
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
    * @param argCusId to initialize employee id.
    * @return the Customer object.
    */
  public static Customer customerDetail(final int argCusId) {
    Customer cus = dao().listById(argCusId);
    return cus;
  }
}
