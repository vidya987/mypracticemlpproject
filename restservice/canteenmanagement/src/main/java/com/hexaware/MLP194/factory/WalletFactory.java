package com.hexaware.MLP194.factory;
import com.hexaware.MLP194.persistence.WalletDAO;
import com.hexaware.MLP194.persistence.DbConnection;
import java.util.List;

import com.hexaware.MLP194.model.Wallet;


/**
 * 
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
}
