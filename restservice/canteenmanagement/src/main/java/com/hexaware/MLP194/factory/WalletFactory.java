package com.hexaware.MLP194.factory;
import com.hexaware.MLP194.persistence.WalletDAO;
import com.hexaware.MLP194.persistence.DbConnection;
import java.util.List;

import com.hexaware.MLP194.model.Wallet;


/**
 * WalletFactory class used to fetch Wallet data from database.
 * @author hexware
 */
public class WalletFactory {
  /**
   *  Protected constructor.
   */
  protected WalletFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  private static WalletDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(WalletDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of wallet object.
   */
  public static Wallet[] showMenu() {
    List<Wallet> wallets = dao().show();
    return wallets.toArray(new Wallet[wallets.size()]);
  }
  /** Call the data base connection.
  * @param walPt to insert wallet point.
  * @param walNo to insert wallet number.
  * @param cusId to insert customer id.
  * @return to insert wallet details.
  */
  public static int insertingWallet(final int walPt, final int walNo, final int cusId) {
    int i = dao().insertWallet(walPt, walNo, cusId);
    return i;
  }
  /** Call the data base connection.
  * @param walPt to insert wallet point.
  * @param walNo to insert wallet number.
  * @return to insert wallet details.
  */
  public static int updatingWallet(final int walPt, final int walNo) {
    int i = dao().updateWallet(walPt, walNo);
    return i;
  }
  /** Call the data base connection.
  * @param walPt to insert wallet point.
  * @return to insert wallet details.
  */
  public static int deletingWallet(final int walPt) {
    int i = dao().deleteWallet(walPt);
    return i;
  }



}
