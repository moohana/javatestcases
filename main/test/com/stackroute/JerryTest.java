
package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;

public class JerryTest {

    Jerry app;
    @BeforeClass
    public static void setUpOnce(){
        System.out.println("Inside setup once");

    }

    @AfterClass
    public static void teardownOnce(){
        System.out.println("Inside teardown once");

    }
    @Before
    public void setUp(){
        System.out.println("Inside setup");
        app=new Jerry();
    }

    @After
    public void tearDown(){
        System.out.println("Inside teardown");
        app=null;
    }
    @Test
    public void test() throws Exception {
        //Arrange
        String expectedValue="Jerry";

        //Act
        String actualValue=app.check(24);

        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);

        //Arrange
        String expectedValue1="Tom";

        //Act
        String actualValue1=app.check(25);

        //Assert
        assertEquals(expectedValue1, actualValue1);
        assertNotNull(actualValue1);
    }


}