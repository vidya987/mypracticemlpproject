package com.hexaware.MLP194.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.hexaware.MLP194.model.Vendor;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;
/**
 * vENDORMapper class used to fetch menu data from database.
 */
public class VendorMapper implements ResultSetMapper<Vendor> {
    /**
     * @param idx the index
     * @param rs the resultset
     * @param ctx the context
     * @return the mapped Vendor object
     * @throws SQLException in case there is an error in fetching data from the resultset
     */
  public final Vendor map(final int idx, final ResultSet rs, final StatementContext ctx) throws SQLException {
      /**
       * @return Vendor
       */
    return new Vendor(rs.getInt("VDR_ID"), rs.getString("STATUS"), rs.getString("SPL"), rs.getInt("PHN_NO"), rs.getString("PSWD"));
  }
}
