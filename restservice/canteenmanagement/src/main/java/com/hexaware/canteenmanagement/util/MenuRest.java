package com.hexaware.canteenmanagement.util;

import javax.ws.rs.GET;
//import javax.ws.rs.POST;
//import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
//import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
//import java.text.ParseException;
import com.hexaware.canteenmanagement.model.Menu;
import com.hexaware.canteenmanagement.factory.MenuFactory;

/**
 * This class provides a REST interface for the employee entity.
 */
@Path("/menu")
public class MenuRest {
   /*
   /**
   * Returns a specific employee's details.
   * @param ld the id of the employee
   * @param leaveId the id of the employee
   * @param option the id of the employee
   * @throws ParseException the id of the employee
   * @return the employee details
   *//*
  @POST
  @Path("/add/{fname}/{fquant}/{fprice}")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public final String addFood(@PathParam("fname") final int fname,
       final Menu ld, @PathParam("fquant") final int fquant, @PathParam("fprice")
       final int fprice) throws ParseException {
    MenuFactory l = new MenuFactory();
    String s = l.addFood(ld.getFoodName(), ld.getQuantity(), ld.getPrice());
    return s;
  }*/
  /**
   * Returns a specific Menu details.
   * @return the menu details
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public final Menu[] listMenu() {
    final Menu[] menu = MenuFactory.showMenu();
    return menu;
  } 
  /*
  /**
   * Returns a specific Customer details.
   * @param empID the id of the Customer.
   * @return the Customer leavedetails.
   *//*
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("{fId}")
  public final Menu[] foodById(@PathParam("fId") final int fId) {
    Menu ld = new Menu();
    Menu[] l = ld.listById(fId);
    return l;
  }*/
}
