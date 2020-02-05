package com.hexaware.MLP194.persistence;

import java.util.List;
import com.hexaware.MLP194.model.Orders;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
/**
 * OrdersDAO class used to fetch data from data base.
 * @author hexware
 */
public interface OrdersDAO {
/**
   * @return the all the Wallet record.
  */
  @SqlQuery("Select * from Orders")
    @Mapper(OrdersMapper.class)
    List<Orders> show();

/**
 * @param ordId to insert order id.
 * @param status to insert order status.
 * @param cusId to insert customer id.
 * @param vdrId to insert vendor id.
 * @param ordHty to insert order history
 * @param itmId to insert item id.
 * @return to insert values into orders table
 */


  @SqlUpdate("INSERT INTO Orders(ODR_ID, STATUS, CUS_ID,  VDR_ID, ODR_HTY, ITM_ID)" + " VALUES (:ordId, :status, :cusId, :vdrId, :ordHty, :itmId)")
   int insertOrders(@Bind("ordId") int ordId, @Bind("status") String status, @Bind("cusId") int cusId,
      @Bind("vdrId") int vdrId, @Bind("ordHty") String ordHty, @Bind("itmId") int itmId);

/**
 * @param ordId to update order id.
 * @param ordHty to update order history.
 * @return to return the updated order history.
 */
  @SqlUpdate("Update Orders set ODR_HTY = :ordHty where ORD_ID = :ordId")
    int updateOrders(@Bind("ordHty") String ordHty, @Bind("ordId") int ordId);
/**
 * @param ordId to delete order id.
 * @return to return the delete order id.
 */
  @SqlUpdate("Delete from Orders where ORD_ID = :ordId")
    int deleteOrders(@Bind("ordId") int ordId);
}

