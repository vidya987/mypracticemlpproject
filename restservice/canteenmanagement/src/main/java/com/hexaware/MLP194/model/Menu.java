package com.hexaware.MLP194.model;
/**
 * Menu class used to display Menu information.
 * @author hexware
 */
public class Menu {
  private int itmId;
  private String itmName;
  private int price;
  private String priDes;
  private int qty;

  /**
   * method for hashcode.
   */

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + itmId;
    //result = prime * result + ((itmName == null) ? 0 : itmName.hashCode());
    //result = prime * result + ((priDes == null) ? 0 : priDes.hashCode());
    result = prime * result + price;
    result = prime * result + qty;
    return result;
  }
/**
 * method for equal.
 */
  @Override
  public boolean equals(final Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Menu other = (Menu) obj;
    if (itmId != other.itmId) {
      return false;
    }
    if (itmName == null) {
      if (other.itmName != null) {
        return false;
      }
    } else if (!itmName.equals(other.itmName)) {
      return false;
    }
    if (priDes == null) {
      if (other.priDes != null) {
        return false;
      }
    } else if (!priDes.equals(other.priDes)) {
      return false;
    }
    if (price != other.price) {
      return false;
    }
    if (qty != other.qty) {
      return false;
    }
    return true;
  }
  /**
   * @return to get item id.
   */

  public int getItmId() {
    return itmId;
  }
  /**
   * @param argitmId to set item Id.
   */

  public final void setItmId(final int argitmId) {
    this.itmId = argitmId;
  }
  /**
   * @return to get Item name.
   */

  public final  String getItmName() {
    return itmName;
  }
  /**
   * @param argitmName to set item name.
   */

  public final void setItmName(final String argitmName) {
    this.itmName = argitmName;
  }
  /**
   * @return to get price.
   */

  public int getPrice() {
    return price;
  }
  /**
   * @param argprice to set price.
   */

  public final void setPrice(final int argprice) {
    this.price = argprice;
  }
  /**
   * @return to get price description.
   */

  public String getPriDes() {
    return priDes;
  }
  /**
   * @param argpriDes to set price description.
   */

  public final void setPriDes(final String argpriDes) {
    this.priDes = argpriDes;
  }
  /**
   * @return to get quantity.
   */

  public int getQty() {
    return qty;
  }
  /**
   * @param argqty to set quantity.
   */

  public final  void setQty(final int argqty) {
    this.qty = argqty;
  }
  /**
   * @param argitmId to initialise item id.
   * @param argitmName to initialise item name.
   * @param argprice to initialise item price.
   * @param argpriDes to initialise item description.
   * @param argqty to initialise item quantity.
   */

  public Menu(final int argitmId, final String argitmName, final int argprice, final String argpriDes, final int argqty) {
    this.itmId = argitmId;
    this.itmName = argitmName;
    this.price = argprice;
    this.priDes = argpriDes;
    this.qty = argqty;
  }
  /**
   * Default Constructor.
   */

  public Menu() {
  }
}
