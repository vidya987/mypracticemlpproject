package com.hexaware.MLP194.util;
import java.util.Scanner;
import com.hexaware.MLP194.factory.MenuFactory;
import com.hexaware.MLP194.model.Menu;
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
    System.out.println("2. Exit");
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
          showFullMenu();
          break;
        case 2:
          Runtime.getRuntime().halt(0);
        default:
          System.out.println("Choose either 1 or 2");
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("enter a valid value");
    }
    option.nextLine();
    mainMenu();
  }
/**
 * showFullMenu method  display the menu item stored in database.
 */
  private void showFullMenu() {
    Menu[] menu = MenuFactory.showMenu();
    System.out.println("itmId" + "\t" + "itmName");

    for (Menu m : menu) {
      System.out.println(m.getitmId() + "\t" + m.getitmName());
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
