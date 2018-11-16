package com.hexaware.canteenmanagement.model;

import java.util.Objects;
/**
 * Employee class used for defining details about employee.
 * @author hexware
 */
public class Employee {
/**
 * empId to store employee id.
 * empName to store employee Name.
 * walletBalance to store employee walletBalance.
 * role to store employee role.
 * contactNo to store employee contactNo.
 */
  private int empId;
  private String empName;
  private int walletBalance;
  private String role;
  private String contactNo;
/**
 * @param argEmpId
 * @param argEmpName
 * @param argWalletBalance
 * @param argRole
 * @param argContactNo
 * used to get user data through constructor.
 */
  public Employee(final int argEmpId, final String argEmpName, final int argWalletBalance,
      final String argRole, final String argContactNo) {
    this.empId = argEmpId;
    this.empName = argEmpName;
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
    Employee emp = (Employee) obj;
    if (Objects.equals(empId, emp.empId) && Objects.equals(empName, emp.empName)
            && Objects.equals(walletBalance, emp.walletBalance) && Objects.equals(role, emp.role)
            && Objects.equals(contactNo, emp.contactNo)) {
      return true;
    }
    return false;
  }
  @Override
  public final int hashCode() {
    return Objects.hash(empId, empName, walletBalance, role, contactNo);
  }
  /**
   * @return this Employee's ID.
   */
  public final int getEmpId() {
    return this.empId;
  }
  /**
   * @return this Employee's Name.
   */
  public final String getEmpName() {
    return this.empName;
  }
  /**
   * @return this Employee's walletBalance.
   */
  public final int getWalletBalance() {
    return this.walletBalance;
  }
  /**
   * @return this Employee's IroleD.
   */
  public final String getRole() {
    return this.role;
  }
  /**
   * @return this Employee's contactNo.
   */
  public final String getContactNo() {
    return this.contactNo;
  }
  /**
   * @param argEmpId gets the EmployeeId.
   */
  public final void setEmpId(final int argEmpId) {
    this.empId = argEmpId;
  }
  /**
   * @param argEmpName gets the Employee name.
   */
  public final void setEmpName(final String argEmpName) {
    this.empName = argEmpName;
  }
  /**
   * @param argWalletBalance gets the Employee wallet balance.
   */
  public final void setWalletBalance(final int argWalletBalance) {
    this.walletBalance = argWalletBalance;
  }
  /**
   * @param argRole gets the Employee argRole.
   */
  public final void setRole(final String argRole) {
    this.role = argRole;
  }
  /**
   * @param argContactNo gets the Employee contact no.
   */
  public final void setContactNo(final String argContactNo) {
    this.contactNo = argContactNo;
  }
}