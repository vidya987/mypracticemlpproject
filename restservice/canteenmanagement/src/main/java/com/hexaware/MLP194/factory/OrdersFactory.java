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
}
