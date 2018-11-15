package com.hexaware.canteenmanagement.util;
import java.util.Scanner;
import com.hexaware.canteenmanagement.factory.MenuFactory;
import com.hexaware.canteenmanagement.factory.EmployeeFactory;
//import com.hexaware.canteenmanagement.factory.OrderFactory;
import com.hexaware.canteenmanagement.model.Menu;
import com.hexaware.canteenmanagement.model.Employee;
class CliMain {
    private Scanner option = new Scanner(System.in, "UTF-8");
    private void mainMenu() {
    System.out.println("Canteen Management System");
    System.out.println("-----------------------");
    System.out.println("1. Show Menu");
    System.out.println("2. Exit");
    mainMenuDetails();
    }
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
    private void showFullMenu() {
        Menu[] menu = MenuFactory.showMenu();
        System.out.println("Food Id  Food Name  Quantity Price");
        for(Menu m : menu) {
            System.out.println(m.getFoodId() + "\t" + m.getFoodName() + "\t" + m.getQuantity() + "\t" + m.getPrice());
        }
    }
     
    public static void main(final String[] ar) {
        final CliMain mainObj = new CliMain();
        mainObj.mainMenu();
      }            
}
