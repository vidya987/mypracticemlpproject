package com.hexaware.MLP194.persistence;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexaware.MLP194.model.Vendor;
/**
 * VendorDAO class used to fetch data from data base.
 * @author hexware
 */
public interface VendorDAO {
    /**
     * @return the all the Vendor record.
     */
  @SqlQuery("Select * from Vendor")
    @Mapper(VendorMapper.class)
    List<Vendor> show();
    /**
     * @param spl for specialisation.
     * @param status for status.
     * @param vdrId for vendor status.
     * @return for vendor required details.
     */
  @SqlUpdate("insert into Vendor(SPL,STATUS,VDR_ID)" + " VALUES (:spl,:status,:vdrId)")
    int insertVendor(@Bind("spl") String spl, @Bind("status") String status, @Bind("vdrId") int vdrId);
    /**
     * @param vdrId for vendor id.
     * @return to return deleted message
     */

  @SqlUpdate("delete from Vendor where VDR_ID= :vdrId")
    int deleteVendor(@Bind("vdrId") int vdrId);
    /**
     * @param spl for specialisation.
     * @param vdrId for vendor id.
     * @return to return vendor updated details.
     */

  @SqlUpdate("Update Vendor set SPL = :spl where VDR_ID = :vdrId")
    int updateVendor(@Bind("spl") String spl, @Bind("vdrId") int vdrId);

}
