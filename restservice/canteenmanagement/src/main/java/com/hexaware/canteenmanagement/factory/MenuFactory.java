package com.hexaware.canteenmanagement.factory;

import com.hexaware.canteenmanagement.persistence.MenuDAO;
import com.hexaware.canteenmanagement.persistence.DbConnection;
import java.util.List;

import com.hexaware.canteenmanagement.model.Menu;
/**
 * MenuFactory class used to fetch menu data from database.
 * @author hexware
 */
public class MenuFactory {
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static MenuDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(MenuDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of menu object.
   */
  public static Menu[] showMenu() {
    List<Menu> menu = dao().show();
    return menu.toArray(new Menu[menu.size()]);
  }
   /**
   * Call the data base connection.
   * @param argFoodId to initialize employee id.
   * @return the menu object.
   */
  public static Menu showFoodItem(final int argFoodId) {
    Menu menu = dao().findByFoodId(argFoodId);
    return menu;
  }
}
