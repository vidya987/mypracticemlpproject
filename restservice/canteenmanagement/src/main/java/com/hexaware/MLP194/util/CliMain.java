
<<<<<<< HEAD
package com.hexaware.MLP194.util;
=======
//import java.sql.Date;
//import java.text.SimpleDateFormat;
>>>>>>> 6ac6f3059e7675166f4bea9d75ecb006658295f5
import java.util.Scanner;
import com.hexaware.MLP194.factory.MenuFactory;
import com.hexaware.MLP194.factory.VendorFactory;
import com.hexaware.MLP194.model.Menu;
import com.hexaware.MLP194.model.Vendor;

import com.hexaware.MLP194.factory.CustomerFactory;
import com.hexaware.MLP194.factory.MenuFactory;
import com.hexaware.MLP194.factory.OrdersFactory;
import com.hexaware.MLP194.factory.VendorFactory;
import com.hexaware.MLP194.factory.WalletFactory;
//import com.hexaware.MLP194.factory.MenuFactory;
import com.hexaware.MLP194.model.Customer;
import com.hexaware.MLP194.model.Menu;
import com.hexaware.MLP194.model.Orders;
import com.hexaware.MLP194.model.Vendor;
import com.hexaware.MLP194.model.Wallet;
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
    System.out.println("------Southern Delights------");
    System.out.println("-----------------------");
    System.out.println("1.Customer");
    System.out.println("2.Wallet");
<<<<<<< HEAD
    System.out.println("2.Menu");
    System.out.println("4.Vendor");
    System.out.println("5.Order");
    System.out.println("6. Exit");
    mainMenuDetails();
  }
  private void detailsTable(){ 
    System.out.println("Enter the Table to be viewed");
    final int tableOption = option.nextInt();
    switch(tableOption){
      case 1:
      


    }

  }


    System.out.println("1. Insert into Customer");
    System.out.println("2.  display customer");
    System.out.println("3. Update customer");
    System.out.println("4. Delete a customer");
    System.out.println("5.display vendor details");
    System.out.println("6.add vendor details");
    System.out.println("7.update vendor details");
    System.out.println("8.delete vendor details");
=======
    System.out.println("3.Vendor");
    System.out.println("4.Order");
>>>>>>> 6ac6f3059e7675166f4bea9d75ecb006658295f5
    System.out.println("5. Exit");
    //mainMenuDetails();
    //detailsTableCustomer();
    //detailsTableVendor();
    //detailsTableOrders();
    //detailsTableWallet();
    //mainMenu();
    //showFullMenu();
    //deleteOrders();
    //placeOrderCustomer();
    table();

  }
  private void table() {
    System.out.println("Enter the Option to be viewed");
    final int table = option.nextInt();
    switch (table) {
      case 1:
        detailsTableCustomer();
        break;
      case 2:
        detailsTableWallet();
        break;
      case 3:
        detailsTableVendor();
        break;
      case 4:
        detailsTableOrders();
        break;
      case 5:
        Runtime.getRuntime().halt(0);
      default:
        System.out.println("Choose either 1 or 2 or 3 or 4");
    }
  }
  private void detailsTableCustomer() {
    try {
<<<<<<< HEAD
      System.out.println("Enter your choice:");
      final int menuOption = option.nextInt();
      switch (menuOption) {
=======
      System.out.println("change in Customer details? ");
      System.out.println("1. Sign Up");
      System.out.println("2. Login");
      System.out.println("3. add into Customer");
      System.out.println("4. display customer");
      System.out.println("5. Update customer");
      System.out.println("6. Delete a customer");
      System.out.println("7. Exit");
      final int tableOption = option.nextInt();
      switch (tableOption) {
>>>>>>> 6ac6f3059e7675166f4bea9d75ecb006658295f5
        case 1:
          signUp();
          break;
        case 2:
          loginCustomer();
          break;
        case 3:
          addCustomers();
          break;
        case 4:
          showCustomer();
          break;
        case 5:
          editCustomer();
          break;
        case 6:
          removeCustomer();
          break;
        case 7:
          Runtime.getRuntime().halt(0);
        default:
          System.out.println("Choose either 1 or 2 or 3 or 4");
      }
    } catch (final Exception e) {
      e.printStackTrace();
      System.out.println("enter a valid value");
    }
    option.nextLine();
    mainMenu();
  }
  private void detailsTableVendor() {
    try {
      System.out.println("change in Vendor details ? ");
      System.out.println("1. Sign Up");
      System.out.println("2. Login");
      System.out.println("3.add vendor details");
      System.out.println("4.display vendor details");
      System.out.println("5.update vendor details");
      System.out.println("6.delete vendor details");
      System.out.println("7.vendor orders");
      System.out.println("8.Exit");
      final int tableOption = option.nextInt();
      switch (tableOption) {
        case 1:
          signUpVendor();
          break;
        case 2:
          loginVendor();
        case 3:
          addVendor();
          break;
        case 4:
          displayVendor();
          break;
        case 5:
<<<<<<< HEAD
          Runtime.getRuntime().halt(0);  displayVendor();
          break;
      case 6:
        showFullMenu();
        break;
        case 7:
        displayVendor();
        break;
        case 8:
        addVendor();
        break;
        case 9:
        updateVendor();
        break;
        case 10:
        deleteVendor();
        break;
        default:
        System.out.println("Choose either 1 or 2 or 3");
=======
          updateVendor();
          break;
        case 6:
          deleteVendor();
          break;
        case 7:
          vendorOrders();
          break;
        case 8:
          Runtime.getRuntime().halt(0);
        default:
          System.out.println("Choose either 1 or 2 or 3 or 4");
      }
    } catch (final Exception e) {
      e.printStackTrace();
      System.out.println("enter a valid value");
    }
    option.nextLine();
    mainMenu();
  }
  private void detailsTableWallet() {
    try {
      System.out.println("change in Wallet details ? ");
      System.out.println("1.add wallet details");
      System.out.println("2.display wallet details");
      System.out.println("3.update wallet details");
      System.out.println("4.delete wallet details");
      System.out.println("5. Exit");
      final int tableOption = option.nextInt();
      switch (tableOption) {
        case 1:
          addCustomerWallet();
          break;
        case 2:
          displayWallet();
          break;
        case 3:
          updateWallet();
          break;
        case 4:
          deleteWallet();
          break;
        case 5:
          Runtime.getRuntime().halt(0);
        default:
          System.out.println("Choose either 1 or 2 or 3 or 4");
>>>>>>> 6ac6f3059e7675166f4bea9d75ecb006658295f5
      }
    } catch (final Exception e) {
      e.printStackTrace();
      System.out.println("enter a valid value");
    }
    option.nextLine();
    mainMenu();
  }
<<<<<<< HEAD
=======
  private void detailsTableOrders() {
    System.out.println("change in Order  ? ");
    System.out.println("1.add order details");
    System.out.println("2.display order details");
    System.out.println("3.update order details");
    System.out.println("4.delete order details");
    System.out.println("5.placeOrderCustomer");
    System.out.println("6.Exit");
    final int tableOption = option.nextInt();
    switch (tableOption) {
      case 1:
        insertOrders();
        break;
      case 2:
        displayOrders();
        break;
      case 3:
        updateOrders();
        break;
      case 5:
        deleteOrders();
      case 6:
        placeOrderCustomer();
      case 7:
        Runtime.getRuntime().halt(0);
      default:
        System.out.println("Choose either 1 or 2 or 3 or 4");
    }
  }
  private void placeOrderCustomer() {
    System.out.println("1.place order");
    System.out.println("2.calculate total");
    final int tableOption1 = option.nextInt();
    switch (tableOption1) {
      case 1:
        placeOrder();
        break;
      case 2:
        calculateTotal();
        break;
      case 3:
      default:
        System.out.println("invalid");
    }
  }
  private void signUp() {
    System.out.println("Enter your customer details please");
    addCustomers();
    System.out.println("Login into southern delights");
    loginCustomer();
  }
  private void loginCustomer() {
    System.out.println("Enter the Customer id");
    int cusId = option.nextInt();
    System.out.println("Enter the Password");
    String pswd = option.next();
    Customer c = CustomerFactory.validatingCustomer(cusId, pswd);
    if (c.getcusId() == cusId && c.getpswd().equals(pswd)) {
      System.out.println("Welcome to Southern Delights");
    } else {
      System.out.println("Enter valid user id and password");
    }
  }
  private void signUpVendor() {
    System.out.println("Enter your vendor details please");
    addVendor();
    System.out.println("Login into southern delights");
    loginVendor();
  }
  private void loginVendor() {
    System.out.println("Enter the vendor id");
    int vdrId = option.nextInt();
    System.out.println("Enter the Password");
    String pswd = option.next();
    Vendor c = VendorFactory.validatingVendor(vdrId, pswd);
    if (c.getVdrId() == vdrId && c.getpswd().equals(pswd)) {
      System.out.println("Welcome to Southern Delights");
    } else {
      System.out.println("Enter valid user id and password");
    }
  }
>>>>>>> 6ac6f3059e7675166f4bea9d75ecb006658295f5

  /**
   * showFullMenu method display the menu item stored in database.
   */
  private void showFullMenu() {
    final Menu[] menu = MenuFactory.showMenu();
<<<<<<< HEAD
    System.out.println("itmId" + "\t" + "itmName");

    for (final Menu m : menu) {
      System.out.println(m.getitmId() + "\t" + m.getitmName());
=======
    System.out.println("itmId" + "\t" + "itmName" + "\t" + "Price" + "\t" + "Price Description" + "\t" + "Quantity");

    for (final Menu m : menu) {
      System.out.println(m.getItmId() + "\t" + m.getItmName() + "\t" + m.getPrice() + "\t" + m.getPriDes() + "\t" + m.getQty());
>>>>>>> 6ac6f3059e7675166f4bea9d75ecb006658295f5
    }
  }
  /**
   * showFullMenu method display the menu item stored in database.
   */
  private void addCustomers() {
    System.out.println("Enter the passowrd between 8 to 13 characters");
    System.out.println("cusId" + "\t" + "walNo" + "\t" + "phnNo" + "\t" + "addRess" + "\t" + "crdNo" + "\t" + "password");
    int cusId = option.nextInt();
    int walNo = option.nextInt();
    int phnNo = option.nextInt();
    String addRess = option.next();
    int crdNo = option.nextInt();
    String pswd = option.next();
    if (pswd.length() >= 8 && pswd.length() <= 13) {
      System.out.println("Password accepted");
    } else {
      System.out.println("Oops ! Password not accepted");
    }
    int i = CustomerFactory.insertingCustomer(cusId, walNo, phnNo, addRess, crdNo, pswd);
    if (i > 0) {
      System.out.println("inserted successfully");
    } else {
      System.out.println("Not Inserted");
    }
  }
  private void addCustomerWallet() {
    System.out.println("insert walPt" + "\t" + "walNo" + "\t" + "cusId");
    int walPt = option.nextInt();
    int walNo = option.nextInt();
    int cusId = option.nextInt();
    int i = WalletFactory.insertingWallet(walPt, walNo, cusId);
    if (i > 0) {
      System.out.println("inserted successfully");
    } else {
      System.out.println("Not Inserted");
    }
  }
  private void displayVendor() {
    Vendor[] me = VendorFactory.showVendor();
    System.out.println("vdrId" + "\t" + "spl" + "\t" + "status");

    for (Vendor m : me) {
      System.out.println(m.getVdrId() + "\t" + m.getSpl() + "\t" + "\t" + m.getStatus());
    }
  }
<<<<<<< HEAD


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
=======
  private void displayOrders() {
    Orders[] me = OrdersFactory.showMenu();
    System.out.println("orderId" + "\t" + "status" + "\t" + "Custoemr id" + "\t" + "vendor id" + "\t" + "order history");
>>>>>>> 6ac6f3059e7675166f4bea9d75ecb006658295f5

    for (Orders m : me) {
      System.out.println(m.getOrdId() + "\t" + m.getStatus() + "\t" + "\t" + m.getCusId() + "\t" + m.getVdrId());
    }
  }
  private void displayWallet() {
    Wallet[] me = WalletFactory.showMenu();
    System.out.println("point" + "\t" + "wallet number" + "\t" + "Customer id");

    for (Wallet m : me) {
      System.out.println(m.getwltPt() + "\t" + m.getwltNo() + "\t" + "\t" + m.getcusId());
    }
  }


  private void addVendor() {
    System.out.println("spl" + "\t" + "status" + "\t" + "vdrId" + "\t" + "phnNo" + " password");
    final String spl = option.next();
    final String status = option.next();
    final int vdrId = option.nextInt();
    final int phnNo = option.nextInt();
    final String pswd = option.next();
    final int i = VendorFactory.insertingVendor(spl, status, vdrId, phnNo, pswd);
    if (i > 0) {
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
    if (i >= 0) {
      System.out.println("updated successfully");
    } else {
      System.out.println("Not updated");
    }
  }
  private void updateWallet() {
    System.out.println("update walPt" + "\t" + "walNo");
    int walPt = option.nextInt();
    int walNo = option.nextInt();
    int i = WalletFactory.updatingWallet(walPt, walNo);
    if (i >= 0) {
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
      System.out.println("Not deleted");
    }
  }
  private void deleteWallet() {
    System.out.println("delete walPt");
    int walPt = option.nextInt();
    int i = WalletFactory.deletingWallet(walPt);
    if (i > 0) {
      System.out.println("deleted successfully");
    } else {
      System.out.println("not deleted");
    }
  }

  private void editCustomer() {
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

  private void showCustomer() {
    Customer[] me = CustomerFactory.showCustomer();
    System.out.println("id" + "\t" + "wallet number" + "\t" + "\t" + "phone number" + "\t" + "\t"
        + "Address" + "\t" + "\t" + "\t" + "card number" + "\t" + "\t" + "password");

    for (Customer m : me) {
      System.out.println(m.getcusId() + "\t" + m.getwalNo() + "\t" + "\t" + m.getphnNo() + "\t" + "\t"
          + m.getaddRess() + "\t" + "\t" + "\t" + m.getcrdNo() +  "\t" + "\t" + m.getpswd());
    }
  }

  private void insertOrders() {
    System.out.println("insert ordId" + "\t" + "status" + "\t" + "cusId" + "\t" + "vdrId" + "\t" + "total" + "\t" + "token" + "\t" + "ordDate");
    int ordId = option.nextInt();
    String status = option.next();
    int cusId = option.nextInt();
    int vdrId = option.nextInt();
    String ordDate = option.next();
    int token = option.nextInt();
    int total = option.nextInt();
    int i = OrdersFactory.insertingOrders(ordId, status, cusId, vdrId, total, ordDate, token);
    if (i > 0) {
      System.out.println("inserted successfully");
    } else {
      System.out.println("Not Inserted");
    }
  }
  private void deleteOrders() {
    System.out.println("delete ordId");
    int ordId = option.nextInt();
    int i = OrdersFactory.deletingOrders(ordId);
    if (i > 0) {
      System.out.println("deleted successfully");
    } else {
      System.out.println("not deleted");
    }
  }
  private void updateOrders() {
    System.out.println("update ordId" + "\t" + "ordHty");
    int ordId = option.nextInt();
    String status = option.next();
    int i = OrdersFactory.updatingOrders(status, ordId);
    if (i >= 0) {
      System.out.println("updated successfully");
    } else {
      System.out.println("Not updated");
    }
  }
  private void placeOrder() {
    System.out.println("placed ordId" + "\t" + "cusId");
    int ordId = option.nextInt();
    int cusId = option.nextInt();
    int i = OrdersFactory.placingOrder(ordId, cusId);
    if (i > 0) {
      System.out.println("placed successfully");
    } else {
      System.out.println("Not placed");
    }
  }
  private void calculateTotal() {
    System.out.println("calculate total" + "\t" + "total");
    int price = option.nextInt();
    int qty = option.nextInt();
    int i = OrdersFactory.calculatingTotal(qty, price);
    int j = qty * price;
    System.out.println(j);
  }
  private void vendorOrders() {
    System.out.println("vendor Orders" + "\t" + "ordId" + "\t" + "status");
    int ordId = option.nextInt();
    //String status = option.next();
    Orders i = OrdersFactory.orderingStatus(ordId);
    if (i.getStatus().equals("ORDERED")) {
      System.out.println("order accepted");
    } else {
      System.out.println("order denied");
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
/**
 * main method  is the basic entry point for the application.
 * @param args used to get the user input.
 */
}

