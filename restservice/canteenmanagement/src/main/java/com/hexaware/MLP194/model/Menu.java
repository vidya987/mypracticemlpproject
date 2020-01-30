package com.hexaware.MLP194.model;
import java.util.Objects;

/**
 * Menu class used to display menu information.
 * @author hexware
 */
public class Menu {
/**
 * foodId to store foodId.
 */
  public int ITM_ID;
  public String ITM_NAME;
  /**
   * Default Constructor.
   */
  public Menu() {

  }
/**
 * @param argFoodId to initialize food id.
 * used to get details through constructor.
 */
  public Menu(final int argFoodId,final String argFoodname) {
    this.ITM_ID = argFoodId;
     this.ITM_NAME= argFoodname;
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
    if (Objects.equals(ITM_ID, menu.ITM_ID) || Objects.equals(ITM_NAME, menu.ITM_NAME)) 
    {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(ITM_ID);
  }

  @Override
  public final String hashCode() {
  return Objects.hash(ITM_NAME);
}


    /**
     * @return this food ID.
     */
  public final int getFoodId() {
    return ITM_ID;
  }
  public final String getFoodname() {
    return ITM_NAME;
  }

    /**
     * @param argFoodId gets the food id.
     */
  public final void setFoodId(final int argFoodId) {
    this.ITM_ID = argFoodId;
  }

    public final void setFoodname(final String argFoodname) 
    {
      this.ITM_NAME = argFoodname;
  }
}
