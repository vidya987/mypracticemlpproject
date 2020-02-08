package com.hexaware.MLP194.persistence;

import java.util.List;

import com.hexaware.MLP194.model.Wallet;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
/**
 * WalletDAO class used to fetch data from data base.
 * @author hexware
 */
public interface WalletDAO {
  /**
   * @return the all the Wallet record.
  */
  @SqlQuery("Select * from Wallet")
    @Mapper(WalletMapper.class)
    List<Wallet> show();
  /**
   * @return to insert wallet details.
   * @param wltPt to insert wallet point.
   * @param wltNo to insert wallet number.
   * @param cusId to insert customer id.
  */
  @SqlUpdate("INSERT INTO Wallet(WLT_PT, WLT_NO, CUS_ID)" + " VALUES (:wltPt, :wltNo, :cusId)")
    int insertWallet(@Bind("wltPt") int wltPt, @Bind("wltNo") int wltNo, @Bind("cusId") int cusId);
  /**
   * @return to insert wallet details.
   * @param wltPt to insert wallet point.
   * @param wltNo to insert wallet number.
  */
  @SqlUpdate("Update Wallet set WLT_NO = :wltNo where WLT_PT = :wltPt")
    int updateWallet(@Bind("wltNo") int wltNo, @Bind("wltPt") int wltPt);
  /**
   * @return to insert wallet details.
   * @param wltPt to insert wallet point.
  */
  @SqlUpdate("Delete from Wallet where WLT_PT = :wltPt")
    int deleteWallet(@Bind("wltPt") int wltPt);
}
