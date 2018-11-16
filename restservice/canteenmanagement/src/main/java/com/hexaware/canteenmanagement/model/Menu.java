
package com.hexaware.canteenmanagement.model;

import java.util.Objects;
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
  private int quantity;
  private int price;
/**
 * @param argFoodId to initialize food id.
 * @param argFoodName to initialize food name.
 * @param argQuantity to initialize quantity.
 * @param argPrice to initialize price.
 * used to get details through constructor.
 */
  public Menu(final int argFoodId, final String argFoodName, final int argQuantity, final int argPrice) {
    this.foodId = argFoodId;
    this.foodName = argFoodName;
    this.quantity = argQuantity;
    this.price = argPrice;
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
            && Objects.equals(quantity, menu.quantity) && Objects.equals(price, menu.price)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(foodId, foodName, quantity, price);
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
     * @return the quantity.
     */
  public final int getQuantity() {
    return quantity;
  }
    /**
     * @return the price
     */
  public final int getPrice() {
    return price;
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
     * @param argQuantity gets the food quantity.
     */
  public final void setQuantity(final int argQuantity) {
    this.quantity = argQuantity;
  }
    /**
     * @param argPrice gets the food price.
     */
  public final void setPrice(final int argPrice) {
    this.price = argPrice;
  }
}
