package com.hexaware.MLP194.util;

import java.util.Scanner;

import com.hexaware.MLP194.factory.CustomerFactory;
//import com.hexaware.MLP194.factory.MenuFactory;
import com.hexaware.MLP194.model.Customer;
//import com.hexaware.MLP194.persistence.CustomerDAO;
//import com.hexaware.MLP194.model.Customer;
//import com.hexaware.MLP194.model.Menu;
/**
 * CliMain used as Client interface for java coading.
 * @author hexware
 */
class CliMain {
  private Scanner option = new Scanner(System.in, "UTF-8");
/**
 * mainMenu method  used to display the option we had in the application.
 */
  private void mainMenu() {
    System.out.println("Canteen Management System");
    System.out.println("-----------------------");
    System.out.println("1. Insert into Customer");
    System.out.println("2.  display customer");
    System.out.println("3. Update customer");
    System.out.println("4. Delete a customer");
    System.out.println("5. Exit");

    mainMenuDetails();
  }
/**
 * mainMenuDetails method  process the option selected from main menu.
 */
  private void mainMenuDetails() {
    try {
      System.out.println("Enter your choice:");
      int menuOption = option.nextInt();
      switch (menuOption) {
        case 1:
          addCustomers();
          break;
        case 2:
          displayCustomer();
          break;
        case 3:
          updateCustomer();
          break;
        case 4:
          removeCustomer();
          break;
        case 5:
          Runtime.getRuntime().halt(0);
          break;
        default:
          System.out.println("Choose either 1 or 2 or 3");
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("enter a valid value");
    }
    option.nextLine();
    mainMenu();
  }
  /**
   * showFullMenu method display the menu item stored in database.
   */
  /*private void showFullMenu() {
    Menu[] menu = MenuFactory.showMenu();
    System.out.println("Item Id" + "\t" + "\t" + "Item Name");

    for (Menu m : menu) {
      System.out.println(m.getitmId() + "\t" + "\t" + m.getitmName());
    }
  }*/
  private void addCustomers() {
    System.out.println("cusId" + "\t" + "walNo" + "\t" + "phnNo" + "\t" + "addRess" + "\t" + "crdNo");
    int cusId = option.nextInt();
    int walNo = option.nextInt();
    int phnNo = option.nextInt();
    String addRess = option.next();
    int crdNo = option.nextInt();
    int i = CustomerFactory.insertingCustomer(cusId, walNo, phnNo, addRess, crdNo);
    if (i > 0) {
      System.out.println("inserted successfully");
    } else {
      System.out.println("Not Inserted");
    }
  }

  private void updateCustomer() {
    System.out.println("Enter Customer number");
    int cusId = option.nextInt();
    System.out.println("Address" + "\t" + "phone number");
    int phnNo = option.nextInt();
    String addRess = option.next();
    int check = CustomerFactory.updatingCustomer(phnNo, addRess, cusId);
    if (check > 0) {
      System.out.println("updated successfully");
    } else {
      System.out.println("Sorry ! not updated");
    }
  }
  private void removeCustomer() {
    System.out.println("Enter Customer number");
    int cusId = option.nextInt();
    int checkin = CustomerFactory.deletingCustomer(cusId);
    if (checkin > 0) {
      System.out.println("Deleted successfully");
    } else {
      System.out.println("Sorry ! not Deleted");
    }


  }

  private void displayCustomer() {
    Customer[] me = CustomerFactory.showCustomer();
    System.out.println("id" + "\t" + "wallet number" + "\t" + "phone number" + "\t" + "\t" + "Address" + "\t" + "\t" + "\t" + "card number");

    for (Customer m : me) {
      System.out.println(m.getcusId() + "\t" + m.getwalNo() + "\t" + "\t" + m.getphnNo() + "\t" + "\t" + m.getaddRess() + "\t" + "\t" + m.getcrdNo());
    }
  }
  /**
   * main method is the basic entry point for the application.
   * @param args used to get the user input.
   */
  public static void main(final String[] args) {
    final CliMain mainObj = new CliMain();
    mainObj.mainMenu();

  }
}
