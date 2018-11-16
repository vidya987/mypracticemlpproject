
package com.hexaware.canteenmanagement.model;

import java.util.Objects;
/**
 * Customer class used for defining details about customer.
 * @author hexware
 */
public class Customer {
/**
 * cusId to store Customer id.
 * cusName to store Customer Name.
 * walletBalance to store Customer walletBalance.
 * role to store Customer role.
 * contactNo to store Customer contactNo.
 */
  private int cusId;
  private String cusName;
  private int walletBalance;
  private String role;
  private String contactNo;
/**
 * @param argCusId to initialize Customer id.
 * @param argCusName to initialize Customer name.
 * @param argWalletBalance to initialize Customer wallet balance.
 * @param argRole to initialize Customer role.
 * @param argContactNo to initialize Customer contact no.
 * used to get user data through constructor.
 */
  public Customer (final int argCusId, final String argCusName, final int argWalletBalance,
      final String argRole, final String argContactNo) {
    this.cusId = argCusId;
    this.cusName = argCusName;
    this.walletBalance = argWalletBalance;
    this.role = argRole;
    this.contactNo = argContactNo;
  }
  @Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Customer cus = (Customer) obj;
    if (Objects.equals(cusId, cus.cusId) && Objects.equals(cusName, cus.cusName)
            && Objects.equals(walletBalance, cus.walletBalance) && Objects.equals(role, cus.role)
            && Objects.equals(contactNo, cus.contactNo)) {
      return true;
    }
    return false;
  }
  @Override
  public final int hashCode() {
    return Objects.hash(cusId, cusName, walletBalance, role, contactNo);
  }
  /**
   * @return this Customer ID.
   */
  public final int getCusId() {
    return this.cusId;
  }
  /**
   * @return this Customer Name.
   */
  public final String getCusName() {
    return this.cusName;
  }
  /**
   * @return this Customer walletBalance.
   */
  public final int getWalletBalance() {
    return this.walletBalance;
  }
  /**
   * @return this Customer IroleD.
   */
  public final String getRole() {
    return this.role;
  }
  /**
   * @return this Customer contactNo.
   */
  public final String getContactNo() {
    return this.contactNo;
  }
  /**
   * @param argCusId gets the CustomerId.
   */
  public final void setCusId(final int argCusId) {
    this.cusId = argCusId;
  }
  /**
   * @param argCusName gets the Customer name.
   */
  public final void setCusName(final String argCusName) {
    this.cusName = argCusName;
  }
  /**
   * @param argWalletBalance gets the Customer wallet balance.
   */
  public final void setWalletBalance(final int argWalletBalance) {
    this.walletBalance = argWalletBalance;
  }
  /**
   * @param argRole gets the Customer argRole.
   */
  public final void setRole(final String argRole) {
    this.role = argRole;
  }
  /**
   * @param argContactNo gets the Customer contact no.
   */
  public final void setContactNo(final String argContactNo) {
    this.contactNo = argContactNo;
  }
}
