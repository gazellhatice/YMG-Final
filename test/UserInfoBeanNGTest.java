/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Hatice
 */
public class UserInfoBeanNGTest {
    
    public UserInfoBeanNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
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
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
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
        assertEquals(result, expResult);
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
