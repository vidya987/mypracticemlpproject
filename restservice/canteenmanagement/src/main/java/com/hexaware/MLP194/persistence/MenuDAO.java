package com.hexaware.MLP194.persistence;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexaware.MLP194.model.Menu;
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
}
