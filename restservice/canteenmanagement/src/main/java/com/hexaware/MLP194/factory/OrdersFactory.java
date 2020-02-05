package com.hexaware.MLP194.factory;

import java.util.List;

import com.hexaware.MLP194.persistence.DbConnection;
import com.hexaware.MLP194.persistence.OrdersDAO;

import com.hexaware.MLP194.model.Orders;


/**
 * OrdersFactory class used to fetch order data from database.
 * @author hexware
 */
public class OrdersFactory {
  /**
   *  Protected constructor.
   */
  protected OrdersFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static OrdersDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(OrdersDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of menu object.
   */
  public static Orders[] showMenu() {
    List<Orders> orders = dao().show();
    return orders.toArray(new Orders[orders.size()]);
  }
    /** Call the data base connection.
  * @param ordId to insert order id.
  * @param status to insert wallet number.
  * @param cusId to insert customer id.
  * @param vdrId to insert vendor id.
  * @param ordHty to insert order history.
  * @param itmId to insert order history.
  * @return to insert order details.
  */

  public static int insertingOrders(final int ordId, final String status, final int cusId, final int vdrId, final String ordHty, final int itmId) {
    int i = dao().insertOrders(ordId, status, cusId, vdrId, ordHty, itmId);
    return i;
  }
  /** Call the data base connection.
  * @param ordId to update order id.
  * @param ordHty to update order history.
  * @return to update order details.
  */
  public static int updatingOrders(final int ordId, final String ordHty) {
    int i = dao().updateOrders(ordHty, ordId);
    return i;
  }
  /** Call the data base connection.
  * @param ordId to ordId delete order id.
  * @return to ordId to return order id.
  */
  public static int deletingOrders(final int ordId) {
    int i = dao().deleteOrders(ordId);
    return i;
  }

}


