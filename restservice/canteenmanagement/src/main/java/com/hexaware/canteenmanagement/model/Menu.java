package com.hexaware.canteenmanagement.model;

import com.hexaware.canteenmanagement.persistence.DbConnection;
import com.hexaware.canteenmanagement.persistence.MenuDAO;

import java.util.Objects;
import java.util.List;

/**
 * Menu class used to display menu information.
 * @author hexware
 */
public class Menu {
/**
 * foodId to store foodId.
 * foodName to store foodName.
 * quantity to store quantity.
 * price to store price.
 */
  private int foodId;
  private String foodName;
  private int vendor;
  /**
   * Default Constructor.
   */
  public Menu() {

  }
/**
 * @param argFoodId to initialize food id.
 * @param argFoodName to initialize food name.
  * @param argVendor to initialize vendor.
 * used to get details through constructor.
 */
  public Menu(final int argFoodId, final String argFoodName, final int argVendor) {
    this.foodId = argFoodId;
    this.foodName = argFoodName;
    this.vendor = argVendor;
  }
  @Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Menu menu = (Menu) obj;
    if (Objects.equals(foodId, menu.foodId) && Objects.equals(foodName, menu.foodName)
            && Objects.equals(vendor, menu.vendor)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(foodId, foodName, vendor);
  }
    /**
     * @return this food ID.
     */
  public final int getFoodId() {
    return foodId;
  }
    /**
     * @return this food name.
     */
  public final String getFoodName() {
    return foodName;
  }
    /**
     * @return the vendor.
     */
  public final int getVendor() {
    return vendor;
  }
    /**
     * @param argFoodId gets the food id.
     */
  public final void setFoodId(final int argFoodId) {
    this.foodId = argFoodId;
  }
    /**
     * @param argFoodName gets the food name.
     */
  public final void setFoodName(final String argFoodName) {
    this.foodName = argFoodName;
  }
    /**
     * @param argVendor gets the food id.
     */
  public final void setVendor(final int argVendor) {
    this.vendor = argVendor;
  }
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
