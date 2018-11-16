package com.hexaware.canteenmanagement.persistence;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexaware.canteenmanagement.model.Employee;
/**
 * EmployeeDAO class used to fetch data from data base.
 * @author hexware
 */
public interface EmployeeDAO {
    /**
   * return details about the employee for the given id.
   * @param empId used to get  data from user
   * @return the employee record.
   */
  @SqlQuery("Select * from employee where emp_id = :empId")
    @Mapper(EmployeeMapper.class)
    Employee listById(@Bind("empId") int empId);
/**
   * return all the details of all the employees.
   * @return the employee array
   */
  @SqlQuery("Select * from employee")
    @Mapper(EmployeeMapper.class)
    List<Employee> list();
}