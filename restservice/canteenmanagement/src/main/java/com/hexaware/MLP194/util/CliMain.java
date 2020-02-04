
package com.hexaware.MLP194.util;

import java.util.Scanner;
import com.hexaware.MLP194.factory.MenuFactory;
import com.hexaware.MLP194.factory.VendorFactory;
import com.hexaware.MLP194.model.Menu;
import com.hexaware.MLP194.model.Vendor;
/**
 * CliMain used as Client interface for java coading.
 * @author hexware
 */
class CliMain {
  private int itmId;
  private String itmName;
  private Scanner option = new Scanner(System.in, "UTF-8");
/**
 * mainMenu method  used to display the option we had in the application.
 */
  private void mainMenu() {
    System.out.println("Canteen Management System");
    System.out.println("-----------------------");
    System.out.println("1. Show Menu");
    System.out.println("2.display vendor details");
    System.out.println("3.add vendor details");
    System.out.println("4.update vendor details");
    System.out.println("5.delete vendor details");
    System.out.println("6. Exit");
    mainMenuDetails();
  }
/**
 * mainMenuDetails method  process the option selected from main menu.
 */
  private void mainMenuDetails() {
    try {
      System.out.println("Enter your choice:");
      final int menuOption = option.nextInt();
      switch (menuOption) {
      case 1:
        showFullMenu();
        break;
        case 2:
        displayVendor();
        break;
        case 3:
        addVendor();
        break;
        case 4:
        updateVendor();
        break;
        case 5:
        deleteVendor();
        break;
      case 6:
        Runtime.getRuntime().halt(0);
      default:
        System.out.println("Choose either 1 or 2");
      }
    } catch (final Exception e) {
      e.printStackTrace();
      System.out.println("enter a valid value");
    }
    option.nextLine();
    mainMenu();
  }

  /**
   * showFullMenu method display the menu item stored in database.
   */
  private void showFullMenu() {
    final Menu[] menu = MenuFactory.showMenu();
    System.out.println("itmId" + "\t" + "itmName");

    for (final Menu m : menu) {
      System.out.println(m.getitmId() + "\t" + m.getitmName());
    }
  }
  private void displayVendor() {
    Vendor[] me = VendorFactory.showVendor();
    System.out.println("vdrId" + "\t" + "spl" + "\t" + "status");

    for (Vendor m : me) {
      System.out.println(m.getVdrId() + "\t" + m.getSpl() + "\t" + "\t" + m.getStatus());
    }
  }


  private void addVendor() {
    System.out.println( "spl" + "\t" + "status" + "\t" + "vdrId");
    final String spl = option.next();
    final String status = option.next();
    final int vdrId = option.nextInt();
    final int i = VendorFactory.insertingVendor(spl, status, vdrId);
    if(i > 0){
      System.out.println("inserted successfully");
    } else {
      System.out.println("Not Inserted");
    }
 }
 private void updateVendor() {
  System.out.println("update spl" + "\t" + "vdrId");
  String spl = option.next();
    int vdrId = option.nextInt();
    int i = VendorFactory.updatingVendor(spl, vdrId);
    if(i >= 0){
      System.out.println("updated successfully");
    } else {
      System.out.println("Not updated");
    }
  }
  private void deleteVendor() {
    System.out.println("delete vdrId");
    int vdrId = option.nextInt();
    int i = VendorFactory.deletingVendor(vdrId);
    if (i > 0) {
      System.out.println("deleted successfully");
    } else {
      System.out.println("not deleted");
    }
  }



/**
 * main method  is the basic entry point for the application.
 * @param args used to get the user input.
 */
  public static void main(final String[] args) {
    final CliMain mainObj = new CliMain();
    mainObj.mainMenu();
  }
  /**
   * @return to get item id.
   */

  public int getItmId() {
    return itmId;
  }
  /**
   * @param argitmId to set id
   */
  public void setItmId(final int argitmId) {
    this.itmId = argitmId;
  }
  /**
   * @return to get item name.
   */
  public String getItmName() {
    return itmName;
  }
  /**
   * @param argitmName to set item name.
   */
  public final void setItmName(final String argitmName) {
    this.itmName = argitmName;
  }
  /**
   * @return get the options.
   */
  public Scanner getOption() {
    return option;
  }
  /**
   * @param argoption to set options.
   */
  public void setOption(final Scanner argoption) {
    this.option = argoption;
  }
}
