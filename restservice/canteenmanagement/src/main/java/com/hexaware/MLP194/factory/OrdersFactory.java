package com.hexaware.MLP194.factory;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
   * Protected constructor.
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

  /**
   * Call the data base connection.
   * @param ordId   to insert order id.
   * @param status  to insert wallet number.
   * @param cusId   to insert customer id.
   * @param vdrId   to insert vendor id.
   * @param total   to insert total.
   * @param token   toinsert token number.
   * @param ordDate to insert order date.
   * @return to insert order details.
   */

  public static int insertingOrders(final int ordId, final String status, final int cusId, final int vdrId,
      final int total, final String ordDate, final int token) {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Date od = null;
    try {
      od = sdf.parse(ordDate);
    } catch (ParseException e) {
      System.out.println("Enter valid Date");
    }
    int i = dao().insertOrders(ordId, status, cusId, vdrId, total, ordDate, token);
    return i;
  }
  /** Call the data base connection.
  * @param ordId to update order id.
  * @param status to update order status.
  * @return to update order details.
  */
  public static int updatingOrders(final String status, final int ordId) {
    int i = dao().updateOrders(status, ordId);
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
  /** Call the data base connection.
  * @param ordId to ordId place order id.
  * @param cusId to cusId place customer id.
  * @return to ordId to place order id.
  */
  public static int placingOrder(final int ordId, final int cusId) {
    int i = dao().placeOrder(ordId, cusId);
    return i;
  }
  /** Call the data base connection.
  * @param price to calculate price.
  * @param qty to calculate total.
  * @return to ordId to place order id.
  */
  public static int calculatingTotal(final int qty, final int price) {
    int i = dao().calculatetotal(qty, price);
    return i;
  }

   /**
   * @param ordId  to valiidate order id.
   * @return to return validation result.
   */
  public static Orders orderingStatus(final int ordId) {
    Orders ordstatus = dao().orderStatus(ordId);
    return ordstatus;
  }
}




