package com.hexaware.MLP194.factory;
import com.hexaware.MLP194.persistence.CustomerDAO;
import com.hexaware.MLP194.persistence.DbConnection;
import java.util.List;

import com.hexaware.MLP194.model.Customer;
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
   * @return the array of customer object.
   */
  public static Customer[] showCustomer() {
    List<Customer> m = dao().show();
    return m.toArray(new Customer[m.size()]);
  }

    /**
     * @param cusId to insert customer name.
     * @param walNo to insert wallet number.
     * @param phnNo to insert customer phone number.
     * @param addRess to insert customer address.
     * @param crdNo to insert customer card number.
     * @return to return inserted value.
     */

  public static int insertingCustomer(final int cusId, final int walNo, final int phnNo, final String addRess, final int crdNo) {
    int i = dao().insert(cusId, walNo, phnNo, addRess, crdNo);
    return i;
  }
  /**
   * @param phnNo to update phone number.
   * @param cusId to update customer id.
   * @param addRess to update address.
   * @return to return updated value.
   */
  public static int updatingCustomer(final int phnNo, final String addRess, final int cusId) {
    int check = dao().update(phnNo, addRess, cusId);
    return check;
  }
    /**
     * @param cusId to delete customer id.
     * @return to return values.
     */

  public static int deletingCustomer(final int cusId) {
    int checkin = dao().deleteByCustomerId(cusId);
    return checkin;
  }
}




