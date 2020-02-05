package com.hexaware.MLP194.model;
/**
 * Customer class used to display customer information.
 * @author hexware
 */
public class Customer {
/**
 * cusId to store customer id.
 * walNo to store wallet number.
 * crdNo to store card number.
 * addRess to store customer address.
 * phnNo to store phone number.
 * pswd to store password.
 */
  private int cusId;
  private int walNo;
  private int phnNo;
  private String addRess;
  private int crdNo;
  private String pswd;
/**
 * @param argcusId to initialise customer id.
 * @param argwalNo to initialise customer id
 * @param argphnNo to initialise customer id
 * @param argaddRess to initialise customer id
 * @param argcrdNo to initialise customer id
 * @param argpswd to initialise customer password
 */

  public Customer(final int argcusId, final int argwalNo, final int argphnNo, final String argaddRess, final int argcrdNo, final String argpswd) {
    this.cusId = argcusId;
    this.walNo = argwalNo;
    this.phnNo = argphnNo;
    this.addRess = argaddRess;
    this.crdNo = argcrdNo;
    this.pswd = argpswd;
  }
/**
 * @return to get customer id
 */
  public final int getcusId() {
    return cusId;
  }
  /**
 * @param argcusId to set customer id.
 */
  public final void setcusId(final int argcusId) {
    this.cusId = argcusId;
  }
/**
 * @return to get wallet number
 */
  public final int getwalNo() {
    return walNo;
  }
  /**
   * @param argwalNo to set wallet number.
   */
  public final void setwalNo(final int argwalNo) {
    this.walNo = argwalNo;
  }
/**
 * @return to get phone number
 */
  public final int getphnNo() {
    return phnNo;
  }
/**
 * @param argphnNo to get phone number.
*/
  public final  void setphnNo(final int argphnNo) {
    this.phnNo = argphnNo;
  }
/**
 * @return to get addRess
 */
  public final String getaddRess() {
    return addRess;
  }
/**
 * @param argaddRess to get customer address.
 */

  public final void setaddRess(final String argaddRess) {
    this.addRess = argaddRess;
  }
  /**
   * @return the card number.
   */

  public final int getcrdNo() {
    return crdNo;
  }
  /**
   * @param argcrdNo to get card number.
   */

  public final  void setcrdNo(final int argcrdNo) {
    this.crdNo = argcrdNo;
  }
  /**
   * @return to return password.
   */
  public final  String getpswd() {
    return pswd;
  }
  /**
   * @param argpswd to set password.
   */
  public final void setpswd(final String argpswd) {
    this.pswd = argpswd;
  }

  @Override
public final int hashCode() {
    final int prime = 31;
    int result = 1;
   // result = prime * result + ((addRess == null) ? 0 : addRess.hashCode() );
    result = prime * result + crdNo;
    result = prime * result + cusId;
    result = prime * result + phnNo;
    result = prime * result + walNo;
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
    Customer other = (Customer) obj;
    if (addRess == null) {
      if (other.addRess != null) {
        return false;
      }
    } else if (!addRess.equals(other.addRess)) {
      return false;
    }
    if (pswd == null) {
      if (other.pswd != null) {
        return false;
      }
    } else if (!pswd.equals(other.pswd)) {
      return false;
    }
    if (crdNo != other.crdNo) {
      return false;
    }
    if (cusId != other.cusId) {
      return false;
    }
    if (phnNo != other.phnNo) {
      return false;
    }
    if (walNo != other.walNo) {
      return false;
    }
    return true;
  }
}
