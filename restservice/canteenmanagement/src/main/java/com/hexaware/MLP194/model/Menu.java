package com.hexaware.MLP194.model;
import java.util.Objects;

/**
 * Menu class used to display menu information.
 * @author hexware
 */
public class Menu {
  private int itmId;
  private String itmName;
  /**
   * Default Constructor.
   */
  public Menu() {

  }
/**
 * @param argFoodId to initialize food id.
 * used to get details through constructor.
 * @param argFoodname to initialize food id.
 * used to get details through constructor.
 */
  public Menu(final int argFoodId, final String argFoodname) {
    this.itmId = argFoodId;
    this.itmName = argFoodname;
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
    if (Objects.equals(itmId, menu.itmId) || Objects.equals(itmName, menu.itmName))     {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(itmId, itmName);
  }
    /**
     * @return this food ID.
     */
  public final int getitmId() {
    return itmId;
  }
  /**
     * @return this foodname.
     */
  public final String getitmName() {
    return itmName;
  }

    /**
     * @param argFoodId gets the food id.
     */
  public final void setFoodId(final int argFoodId) {
    this.itmId = argFoodId;
  }

 /**
     * @param argFoodname gets the foodname.
     */
  public final void setFoodname(final String argFoodname) {
    this.itmName = argFoodname;
  }
}

