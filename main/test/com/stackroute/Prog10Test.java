package com.stackroute;

import org.junit.*;

import static org.junit.Assert.*;

public class Prog10Test {

    Prog10 app;

    @BeforeClass
    public static void setUpOnce() {
        System.out.println("Inside setup once");

    }

    @AfterClass
    public static void teardownOnce() {
        System.out.println("Inside teardown once");

    }

    @Before
    public void setUp() {
        System.out.println("Inside setup");
        app = new Prog10();
    }

    @After
    public void tearDown() {
        System.out.println("Inside teardown");
        app = null;
    }

    @Test
    public void test() throws Exception {
        //Arrange

        String expectedValue = "priyayaya";

        //Act
        String actualValue = app.check("priya", 2);

        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);

    }
}

