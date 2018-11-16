package com.hexaware.canteenmanagement.factory;

// import com.hexaware.canteenmanagement.model.Employee;
import com.hexaware.canteenmanagement.persistence.DbConnection;
import com.hexaware.canteenmanagement.persistence.EmployeeDAO;
/**
 * This class used to create DbConnection object and creating the db connection through DbConnection.
 */
public class EmployeeFactory {
   /**
    * dao() used to create database connection.
    * @return the DB object.
    */
  private static EmployeeDAO dao() {
    DbConnection dbConnection = new DbConnection();
    return dbConnection.getConnect().onDemand(EmployeeDAO.class);
  }
   /**
    * employeeDetails() used call list the employee by using their Id.
    * @param argEmpId to initialize employee id.
    * @return the Employee object.
    */
  public static Employee employeeDetail(final int argEmpId) {
    Employee emp = dao().listById(argEmpId);
    return emp;
  }
}
