package com.stackroute;
import org.junit.*;
import static org.junit.Assert.*;

public class CapitalTest {
    Capital app;
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
        app=new Capital();
    }

    @After
    public void tearDown(){
        System.out.println("Inside teardown");
        app=null;
    }
    @Test
    public void test() throws Exception {
        //Arrange
        String expectedValue="Small Letter";

        //Act
        String actualValue=app.check('a');

        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);

        //Arrange
        String expectedValue1="Capital Letter";

        //Act
        String actualValue1=app.check('P');

        //Assert
        assertEquals(expectedValue1, actualValue1);
        assertNotNull(actualValue1);
        String expectedValue2="Digit";

        //Act
        String actualValue2=app.check('9');

        //Assert
        assertEquals(expectedValue2, actualValue2);
        assertNotNull(actualValue2);

        String expectedValue3="Special symbol";

        //Act
        String actualValue3=app.check('$');

        //Assert
        assertEquals(expectedValue3, actualValue3);
        assertNotNull(actualValue3);


    }


}


