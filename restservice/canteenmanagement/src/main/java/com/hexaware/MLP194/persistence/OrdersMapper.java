package main.java.com.hexaware.MLP194.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.hexaware.MLP194.model.Orders;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;
/**
 * OrdersMapper class used to fetch menu data from database.
 * @author hexware
 */
public class OrdersMapper implements ResultSetMapper<Order> {
    /**
     * @param idx the index
     * @param rs the resultset
     * @param ctx the context
     * @return the mapped customer object
     * @throws SQLException in case there is an error in fetching data from the resultset
     */
  
  public final Orders map(final int idx, final ResultSet rs, final StatementContext ctx) throws SQLException {
      /**
       * @return Orders
       */
    return new Orders(rs.getInt("wltPt"), rs.getInt("wltNo"), rs.getInt("cusId"));
  }
}