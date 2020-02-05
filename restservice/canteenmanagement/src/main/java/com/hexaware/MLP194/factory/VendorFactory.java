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
    final DbConnection db = new DbConnection();
    return db.getConnect().onDemand(VendorDAO.class);
  }

  /**
   * Call the data base connection.
   * @return the array of vendor object.
   */
  public static Vendor[] showMenu() {
    final List<Vendor> k = dao().show();
    return k.toArray(new Vendor[k.size()]);
  }
  /**
   * @param spl to get specialisation.
   * @param status to get status.
   * @param vdrId to get vendor id.
   * @param phnNo to get phone number.
   * @param pswd to get password.
   * @return to return details of vendor.
   */

  public static int insertingVendor(final String spl, final String status, final int vdrId, final int phnNo, final String pswd) {
    final int i = dao().insertVendor(spl, status, vdrId, phnNo, pswd);
    return i;
  }
  /**
   * @param spl to get specialisation.
   * @param vdrId to get vendor id.
   * @return to return details of vendor.
   */
  public static int updatingVendor(final String spl, final int vdrId) {
    int i = dao().updateVendor(spl, vdrId);
    return i;
  }
  /**
   * @param vdrId to get vendor id.
   * @return to return details of vendor.
   */
  public static int deletingVendor(final int vdrId) {
    int i = dao().deleteVendor(vdrId);
    return i;
  }
  /**
   * @return to return details of vendor.
   */
  public static Vendor[] showVendor() {
    List<Vendor> m = dao().show();
    return m.toArray(new Vendor[m.size()]);
  }

   /**
   * @param vdrId to validate customer id.
   * @param pswd to valiidate passwword.
   * @return to return validation result.
   */

  public static Vendor validatingVendor(final int vdrId, final String pswd) {
    Vendor vendors = dao().validatingVendors(vdrId, pswd);
    return vendors;
  }
}


