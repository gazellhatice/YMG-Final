/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Hatice
 */
public class UserInfoBeanTest {
    
    public UserInfoBeanTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getName method, of class UserInfoBean.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        UserInfoBean instance = new UserInfoBean();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class UserInfoBean.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        UserInfoBean instance = new UserInfoBean();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class UserInfoBean.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        UserInfoBean instance = new UserInfoBean();
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class UserInfoBean.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        UserInfoBean instance = new UserInfoBean();
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class UserInfoBean.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        UserInfoBean instance = new UserInfoBean();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class UserInfoBean.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        UserInfoBean instance = new UserInfoBean();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhone method, of class UserInfoBean.
     */
    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        UserInfoBean instance = new UserInfoBean();
        String expResult = "";
        String result = instance.getPhone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhone method, of class UserInfoBean.
     */
    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        String phone = "";
        UserInfoBean instance = new UserInfoBean();
        instance.setPhone(phone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
