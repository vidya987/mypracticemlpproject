package com.hexaware.MLP194.factory;

import com.hexaware.MLP194.persistence.CustomerDAO;
import com.hexaware.MLP194.persistence.DbConnection;
import java.util.List;

import com.hexaware.MLP194.model.Customer;
//import com.hexaware.MLP194.model.Menu;
/**
 * MenuFactory class used to fetch menu data from database.
 * @author hexware
 */
public class CustomerFactory {
  /**
   *  Protected constructor.
   */
  protected CustomerFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static CustomerDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(CustomerDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of menu object.
   */
  public static Customer[] showMenu() {
    List<Customer> m = dao().show();
    return m.toArray(new Customer[m.size()]);
  }
}
