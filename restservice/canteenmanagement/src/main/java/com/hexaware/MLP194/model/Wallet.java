package com.hexaware.MLP194.model;
/**
 * Wallet class used to display wallet information.
 * @author hexware
 */
public class Wallet {
  private int wltPt;
  private int wltNo;
  private int cusId;
/**
  * Default constructor .
  */
  public Wallet() {
  }
/**
   * @param argwltPt to initialise wallet point
   * @param argwltNo to initialise wallt number
   * @param argcusId to initialise customer id
   */
  public Wallet(final int argwltPt, final int argwltNo, final int argcusId) {
    this.wltPt = argwltPt;
    this.wltNo = argwltNo;
    this.cusId = argcusId;
  }
  @Override
    public final int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + wltPt;
    result = prime * result + wltNo;
    result = prime * result + cusId;
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
    Wallet other = (Wallet) obj;
    if (cusId != other.wltPt) {
      return false;
    }
    if (wltNo != other.wltNo) {
      return false;
    }
    if (wltPt != other.cusId) {
      return false;
    }
    return true;
  }
/**
* @return to get the wallet point
*/
  public final int getwltPt() {
    return wltPt;
  }
  /**
   * @param argwltPt to set the wallet point.
   */
  public final  void setwltPt(final int argwltPt) {
    wltPt = argwltPt;
  }
 /**
  * @return to get wallet number.
  */
  public final int getwltNo() {
    return wltNo;
  }
 /**
  * @param argwltNo to set the wallet number.
  */
  public final void setargwltNo(final int argwltNo) {
    wltNo = argwltNo;
  }
  /**
   * @return to get customer id.
   */
  public final int getcusId() {
    return cusId;
  }
  /**
   * @param argcusId to set the customer id.
   */
  public final void setcusId(final int argcusId) {
    cusId = argcusId;
  }
}
