package com.hexaware.MLP194.persistence;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;

import com.hexaware.MLP194.model.Orders;
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
<<<<<<< HEAD
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
=======
     * @param spl to get specialisation.
     * @param status to get status.
     * @param vdrId to get vendor id.
     * @param phnNo to get phone number.
     * @param pswd to get password.
     * @return to return the data.
     */
  @SqlUpdate("insert into Vendor(SPL,STATUS,VDR_ID,PHN_NO,PSWD)" + "VALUES (:spl,:status,:vdrId, :phnNo, :pswd)")
   // void insertBean(@BindBean Vendor users);
    int insertVendor(@Bind("spl") String spl, @Bind("status") String status,
      @Bind("vdrId") int vdrId, @Bind("phnNo") int phnNo, @Bind("pswd") String pswd);
    /**
     * @param vdrId to get the venodr id.
     * @return to return the data.
>>>>>>> 6ac6f3059e7675166f4bea9d75ecb006658295f5
     */

  @SqlUpdate("delete from Vendor where VDR_ID= :vdrId")
    int deleteVendor(@Bind("vdrId") int vdrId);
    /**
<<<<<<< HEAD
     * @param spl for specialisation.
     * @param vdrId for vendor id.
     * @return to return vendor updated details.
=======
     * @param spl to get specailisation
     * @param vdrId to get vendor id.
     * @return to return the data.
>>>>>>> 6ac6f3059e7675166f4bea9d75ecb006658295f5
     */

  @SqlUpdate("Update Vendor set SPL = :spl where VDR_ID = :vdrId")
    int updateVendor(@Bind("spl") String spl, @Bind("vdrId") int vdrId);

<<<<<<< HEAD
=======
      /**
     * @param vdrId to check vendor id.
     * @param pswd to check password.
     * @return to return validation result.
     */

  @SqlQuery("select * from Customer where VDR_ID = :cusId and PSWD = :pswd")
  @Mapper(VendorMapper.class)
  Vendor validatingVendors(@Bind("vdrId") int vdrId, @Bind("pswd") String pswd);

  
>>>>>>> 6ac6f3059e7675166f4bea9d75ecb006658295f5
}
