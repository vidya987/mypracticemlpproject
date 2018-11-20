package com.hexaware.canteenmanagement.model;

import com.hexaware.canteenmanagement.persistence.MenuDAO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;

import mockit.Expectations;
import mockit.MockUp;
import mockit.Mocked;
import mockit.Mock;
import mockit.integration.junit4.JMockit;
import java.util.ArrayList;

/**
 * Test class for Menu.
 */
@RunWith(JMockit.class)
public class MenuTest {
    /**
   * setup method.
   */
  @Before
  public void initInput() {

  }
  /**
   * Tests the equals/hashcode methods of the employee class.
   */
  @Test
  public final void testMenu() {
    Menu m = new Menu();
    Menu m100 = new Menu(100, "Pizza", 1000);
    Menu m101 = new Menu(101, "Burger", 1001);
    assertNotEquals(m100, null);
    assertNotEquals(m101, null);
    assertEquals(m100.getFoodId(),
        new Menu(100, "Pizza", 1000).getFoodId());
    assertEquals(m100.getFoodName(),
        new Menu(100, "Pizza", 1000).getFoodName());
    assertEquals(m100.getVendor(),
        new Menu(100, "Pizza", 1000).getVendor());
    m101.setFoodId(100);
    assertNotEquals(m101, new Menu(101, "Burger", 1001));
    m101.setFoodName("Burger");
    assertNotEquals(m101, new Menu(101, "Burger", 1001));
    m101.setVendor(1001);
    assertNotEquals(m101, new Menu(101, "Burger", 1001));
    assertEquals(m100.hashCode(),
        new Menu(100, "Pizza", 1000).hashCode());
    assertEquals(m100, new Menu(100, "Pizza", 1000));
  }
  /**
   * tests that empty employee list is handled correctly.
   * @param dao mocking the dao class
   */
  @Test
  public final void testListAllEmpty(@Mocked final MenuDAO dao) {
    new Expectations() {
      {
        dao.show(); result = new ArrayList<Menu>();
      }
    };
    new MockUp<Menu>() {
      @Mock
      MenuDAO dao() {
        return dao;
      }
    };
    Menu[] me = Menu.showMenu();
    assertEquals(0, me.length);
  }
  /**
   * Tests that a list with some employees is handled correctly.
   * @param dao mocking the dao class
   */
  @Test
  public final void testListAllSome(@Mocked final MenuDAO dao) {
    final Menu m100 = new Menu(100, "Pizza", 1000);
    final Menu m101 = new Menu(101, "Burger", 1001);
    final ArrayList<Menu> mn = new ArrayList<Menu>();
    new Expectations() {
      {
        mn.add(m100);
        mn.add(m101);
        dao.show(); result = mn;
      }
    };
    new MockUp<Menu>() {
      @Mock
      MenuDAO dao() {
        return dao;
      }
    };
    Menu[] mn1 = Menu.showMenu();
    assertEquals(2, mn1.length);
    assertEquals(new Menu(100, "Pizza", 1000).getFoodId(),
        mn1[0].getFoodId());
    assertEquals(new Menu(101, "Burger", 1001).getFoodId(),
        mn1[1].getFoodId());
  }
  /**
   * Tests that a fetch of a specific employee works correctly.
   * @param dao mocking the dao class
   */
  @Test
  public final void testListById(@Mocked final MenuDAO dao) {
    final Menu m100 = new Menu(100, "Pizza", 1000);
    new Expectations() {
      {
        dao.findByFoodId(102); result = m100;
        dao.findByFoodId(-1); result = null;
      }
    };
    new MockUp<Menu>() {
      @Mock
      MenuDAO dao() {
        return dao;
      }
    };
    Menu m = Menu.showFoodItem(102);
    assertEquals(m100, m);

    m = Menu.showFoodItem(-1);
    assertNull(m);
  }
}
