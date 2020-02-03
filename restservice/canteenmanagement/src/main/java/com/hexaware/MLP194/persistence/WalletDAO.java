package com.hexaware.MLP194.persistence;

import java.util.List;

import com.hexaware.MLP194.model.Wallet;

import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
/**
 * MenuDAO class used to fetch data from data base.
 * @author hexware
 */
public interface WalletDAO {
  /**
   * @return the all the Wallet record.
  */
  @SqlQuery("Select * from Wallet")
    @Mapper(WalletMapper.class)
    List<Wallet> show();
}