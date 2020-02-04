package com.hexaware.MLP194.persistence;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexaware.MLP194.model.Customer;
/**
 * MenuDAO class used to fetch data from data base.
 * @author hexware
 */
public interface CustomerDAO {
    /**
     * @return the all the Customer record.
     */
  @SqlQuery("Select * from Customer")
    @Mapper(CustomerMapper.class)
    List<Customer> show();

    /**
     * @param cusId to insert into Customer id.
     * @param walNo to insert into Wallet Number.
     * @param phnNo to insert into Phone Number.
     * @param addRess to insert into Address.
     * @param crdNo to insert into Card Number.
     * @return will return values.
     */

  @SqlUpdate("INSERT INTO Customer(CUS_ID, WAL_NO, PHN_NO, ADDRESS, CRD_NO)" + " VALUES (:cusId, :walNo, :phnNo, :addRess, :crdNo)")
    int insert(@Bind("cusId") int cusId, @Bind("walNo") int walNo, @Bind("phnNo") int phnNo,
      @Bind("addRess") String addRess, @Bind("crdNo") int crdNo);
    /**
     * @param cusId to delete Customer.
     * @return to return deleted value.
     */
  @SqlUpdate("delete from Customer where CUS_ID = :cusId")
    int deleteByCustomerId(@Bind("cusId") int cusId);
    /**
     * @param cusId to update the Customer.
     * @param phnNo to update the Customer.
     * @param addRess to update the Customer.
     * @return cusId to return updated value.
     */
  @SqlUpdate("update Customer set PHN_NO=:phnNo,ADDRESS =:addRess where CUS_ID =:cusId")
    int update(@Bind("phnNo") int phnNo, @Bind("addRess") String addRess, @Bind("cusId") int cusId);
}
