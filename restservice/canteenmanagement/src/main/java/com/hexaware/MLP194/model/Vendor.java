package com.hexaware.MLP194.model;
/**
 * Vendor class to display vendor information.
 */
class Vendor {
  private int vdrId;
  private String status;
  private String spl;
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
  @Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    //result = prime * result + ((spl == null) ? 0 : spl.hashCode());
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
    Vendor other = (Vendor) obj;
    if (spl == null) {
      if (other.spl != null) {
        return false;
      }
    } else if (!spl.equals(other.spl)) {
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
   * @param argvdrId to initialise vendor id.
   * @param argstatus to initialise vendor status.
   * @param argspl to initialise vendor specialisation.
   */
  Vendor(final int argvdrId, final  String argstatus, final String argspl) {
    this.vdrId = argvdrId;
    this.status = argstatus;
    this.spl = argspl;
  }
  /**
   * Default Constructor.
   */
  Vendor() {

  }
}
