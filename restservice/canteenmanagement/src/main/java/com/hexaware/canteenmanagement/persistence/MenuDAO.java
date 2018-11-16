package com.hexaware.canteenmanagement.persistence;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexaware.canteenmanagement.model.Menu;
/**
 * MenuDAO class used to fetch data from data base.
 * @author hexware
 */
public interface MenuDAO {
    /**
     * @return the all the Menu record.
     */
  @SqlQuery("Select * from Menu")
    @Mapper(MenuMapper.class)
    List<Menu> show();
/**
   * return details about the Menu for the given food id.
   * @param foodId used to get  data from user
   * @return the menu details for given id.
   */
  @SqlQuery("select * from Menu where food_id = :foodId")
    @Mapper(MenuMapper.class)
    Menu findByFoodId(@Bind("foodId") int foodId);

}