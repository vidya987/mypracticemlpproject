package com.hexaware.MLP194.persistence;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
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
    @SqlUpdate("insert into Vendor(SPL,STATUS,VDR_ID)"+" VALUES (:spl,:status,:vdrId)")
   // void insertBean(@BindBean Vendor users);
    int insertVendor(@Bind("spl") String spl, @Bind("status") String status, @Bind("vdrId") int vdrId);

    @SqlUpdate("delete from Vendor where VDR_ID= :vdrId")
    int deleteVendor(@Bind("vdrId") int vdrId);

    @SqlUpdate("Update Vendor set SPL = :spl where VDR_ID = :vdrId")
    int updateVendor(@Bind("spl") String spl, @Bind("vdrId") int vdrId);
    




}
