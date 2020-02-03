package com.hexaware.MLP194.model;
/**
 * Order class used to display wallet information.
 * @author hexware
 */
public class Orders {
  private int ordId;
  private String status;
  private int cusId;
  private int vdrId;
  private String ordHty;

  @Override
    public final int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + cusId;
    //result = prime * result + ((ordHty == null) ? 0 : ordHty.hashCode());
    result = prime * result + ordId;
    //result = prime * result + ((status == null) ? 0 : status.hashCode());
    result = prime * result + vdrId;
    return result;
  }

  @Override
    public final boolean equals(final Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Orders other = (Orders) obj;
    if (cusId != other.cusId) {
      return false;
    }
    if (ordHty == null) {
      if (other.ordHty != null) {
        return false;
      }
    } else if (!ordHty.equals(other.ordHty)) {
      return false;
    }
    if (ordId != other.ordId) {
      return false;
    }
    if (status == null) {
      if (other.status != null) {
        return false;
      }
    } else if (!status.equals(other.status)) {
      return false;
    }
    if (vdrId != other.vdrId) {
      return false;
    }
    return true;
  }
/**
 * @return to get the order id.
 */
  public int getOrdId() {
    return ordId;
  }
/**
 * @param argordId to set the order id
 */

  public  final void setOrdId(final int argordId) {
    this.ordId = argordId;
  }
/**
 * @return to get the order status
 */
  public String getStatus() {
    return status;
  }
/**
 * @param argstatus to set the order status.
 */

  public final void setStatus(final String argstatus) {
    this.status = argstatus;
  }
/**
 * @return to get the customer id.
 */
  public int getCusId() {
    return cusId;
  }
/**
 * @param argcusId to set the customer id
 */
  public final void setCusId(final int argcusId) {
    this.cusId = argcusId;
  }
/**
 * @return to get the vendor id
 */
  public int getVdrId() {
    return vdrId;
  }
/**
 * @param argvdrId to set the vendor id.
 */
  public final void setVdrId(final int argvdrId) {
    this.vdrId = argvdrId;
  }
/**
 * @return to get the order history.
 */
  public String getOrdHty() {
    return ordHty;
  }
/**
 * @param argordHty to set the order history
 */
  public final void setOrdHty(final String argordHty) {
    this.ordHty = argordHty;
  }
/**
 * Default Constructor .
 */
  public Orders() {
  }
/**
 * @param argordId to initialise order id
 * @param argstatus to  initialise order status
 * @param argcusId to initialise customer id
 * @param argvdrId to  initialise vendor id
 * @param argordHty to initialise order history
 */

  public Orders(final int argordId, final String argstatus, final int argcusId, final int argvdrId, final String argordHty) {
    this.ordId = argordId;
    this.status = argstatus;
    this.cusId = argcusId;
    this.vdrId = argvdrId;
    this.ordHty = argordHty;
  }
}
