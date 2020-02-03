package com.hexaware.MLP194.factory;
import com.hexaware.MLP194.persistence.VendorDAO;
import com.hexaware.MLP194.persistence.DbConnection;
import java.util.List;
import com.hexaware.MLP194.model.Vendor;
/**
 * MenuFactory class used to fetch menu data from database.
 * @author hexware
 */
public class VendorFactory {
  /**
   *  Protected constructor.
   */
  protected VendorFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static VendorDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(VendorDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of vendor object.
   */
  public static Vendor[] showMenu() {
    List<Vendor> k = dao().show();
    return k.toArray(new Vendor[k.size()]);
  }
}


