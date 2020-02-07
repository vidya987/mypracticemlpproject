package com.hexaware.MLP194.persistence;

//import java.sql.Date;
//import java.sql.Date;
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
 * @param token to insert token number
 * @param total to insert total price.
 * @param ordDate to insert order date.
 * @return to insert values into orders table
 */

  @SqlUpdate("insert into ORDERS(ODR_ID, STATUS, CUS_ID, VDR_ID, TOTAL, ORD_DATE, TKN_NO)"
      + "VALUES (:ordId, :status, :cusId, :vdrId, :total, :ordDate, :token)")
   int insertOrders(@Bind("ordId") int ordId, @Bind("status") String status, @Bind("cusId") int cusId,
      @Bind("vdrId") int vdrId, @Bind("total") int total, @Bind("ordDate") String ordDate, @Bind("token") int token);

/**
 * @param ordId to update order id.
 * @param status to update order status.
 * @return to return the updated order history.
 */
  @SqlUpdate("Update Orders set STATUS = :status where ODR_ID = :ordId")
    int updateOrders(@Bind("status") String status, @Bind("ordId") int ordId);
/**
 * @param ordId to delete order id.
 * @return to return the delete order id.
 */
  @SqlUpdate("Delete from Orders where ODR_ID = :ordId")
    int deleteOrders(@Bind("ordId") int ordId);

/**
 * @param ordId to insert order id.
 * @param cusId to insert customer id.
 * @return to return the delete order id.
 */
  @SqlUpdate("insert into ORDERS(ODR_ID,CUS_ID) VALUES (:ordId,:cusId)")
    int placeOrder(@Bind("ordId") int ordId, @Bind("cusId") int cusId);
/**
 * @param qty to insert quantity.
 * @param price to insert price.
 * @return to return the total details.
 */
  @SqlUpdate("select TOTAL from ORDERS")
  int calculatetotal(@Bind("qty") int qty, @Bind("price") int price);

   /**
     * @param ordId to check order id.
     * @return to return validation result.
     */
  @SqlQuery("select * from ORDERS where ODR_ID = :ordId")
    @Mapper(OrdersMapper.class)
    Orders orderStatus(@Bind("ordId") int ordId);

}


