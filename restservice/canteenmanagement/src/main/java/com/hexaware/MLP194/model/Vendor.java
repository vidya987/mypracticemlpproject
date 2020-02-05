package com.hexaware.MLP194.model;
/**
 * Vendor class to display vendor information.
 */
public class Vendor {
  private int vdrId;
  private String status;
  private String spl;
  private int phnNo;
  private String pswd;
  /**
   * @return to get vendor id.
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
   * @return to get status.
   */
  public String getStatus() {
    return status;
  }
  /**
   * @param argstatus to get vendor status.
   */
  public final void setStatus(final String argstatus) {
    this.status = argstatus;
  }
  /**
   * @return to get the vendor specialisation.
   */
  public String getSpl() {
    return spl;
  }
  /**
   * @param argspl to set the Specialisation.
   */
  public final void setSpl(final String argspl) {
    spl = argspl;
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
/**
 * @return returns the result of hashcode.
 */
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    //result = prime * result + ((spl == null) ? 0 : spl.hashCode());
    //result = prime * result + ((status == null) ? 0 : status.hashCode());
    result = prime * result + vdrId;
    result = prime * result + phnNo;
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
    Vendor other = (Vendor) obj;
    if (spl == null) {
      if (other.spl != null) {
        return false;
      }
    } else if (!spl.equals(other.spl)) {
      return false;
    }
    if (pswd == null) {
      if (other.pswd != null) {
        return false;
      }
    } else if (!pswd.equals(other.pswd)) {
      return false;
    }
    if (status == null) {
      if (other.status != null) {
        return false;
      }
    } else if (!status.equals(other.status)) {
      return false;
    }
    if (phnNo != other.phnNo) {
      return false;
    }
    if (vdrId != other.vdrId) {
      return false;
    }
    return true;
  }
  /**
   * @param argvdrId to initialise vendor id.
   * @param argstatus to initialise vendor status.
   * @param argspl to initialise vendor specialisation.
   * @param argphnNo to initialise vendor phone number.
   * @param argpswd to initialise vendor password.
   */
  public Vendor(final int argvdrId, final  String argstatus, final String argspl, final int argphnNo, final String argpswd) {
    this.vdrId = argvdrId;
    this.status = argstatus;
    this.spl = argspl;
    this.phnNo = argphnNo;
    this.pswd = argpswd;
  }
  /**
   * Default Constructor.
   */
  Vendor() {

  }
}
