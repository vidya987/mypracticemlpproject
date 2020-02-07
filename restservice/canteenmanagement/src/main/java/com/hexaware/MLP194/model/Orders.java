package com.hexaware.MLP194.model;

import java.sql.Date;

/**
 * Order class used to display wallet information.
 * @author hexware
 */
public class Orders {
  private int ordId;
  private String status;
  private int cusId;
  private int vdrId;
  private int qty;
  private int total;
  private int token;
  private Date ordDate;

  @Override
    public final int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + cusId;
    //result = prime * result + ((ordHty == null) ? 0 : ordHty.hashCode());
    result = prime * result + ordId;
    //result = prime * result + ((status == null) ? 0 : status.hashCode());
    result = prime * result + vdrId;
    result = prime * result + total;
    result = prime * result + token;
    result = prime * result + qty;
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
    if (token != other.token) {
      return false;
    }
    if (total != other.total) {
      return false;
    }
    if (qty != other.qty) {
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
 * @return to get the order id.
 */
  public int gettoken() {
    return token;
  }
/**
* @param argtoken to set the order id
*/

  public  final void settoken(final int argtoken) {
    this.token = argtoken;
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
 * @return to get the total
 */
  public int gettotal() {
    return total;
  }
/**
* @param argtotal to set the total.
*/
  public final void settotal(final int argtotal) {
    this.total = argtotal;
  }
/**
 * @return to get the order history.
 */
  public int getqty() {
    return qty;
  }
/**
 * @param argqty to set the order quantity
 */
  public final void setqty(final int argqty) {
    this.qty = argqty;
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
 * @param argvdrId to  initialise vendor id.
 * @param argtotal to initialise total.
 * @param argtoken to initialise token.
 * @param argordDate to initialise date.
 */

  public Orders(final int argordId, final String argstatus, final int argcusId,
      final int argvdrId, final int argtotal, final int argtoken, final Date argordDate) {
    this.ordId = argordId;
    this.status = argstatus;
    this.cusId = argcusId;
    this.vdrId = argvdrId;
    this.total = argtotal;
    this.token = argtoken;
    this.ordDate = argordDate;
  }

}
