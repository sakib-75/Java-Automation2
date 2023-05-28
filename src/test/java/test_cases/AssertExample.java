package test_cases;

import driver.BaseDrive;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertExample extends BaseDrive {

    @Test
    public void hardAssertTest(){
        Assert.assertEquals(10, 20);
        System.out.println("code after assertion 1");
        System.out.println("code after assertion 2");
    }

    @Test
    public void softAssertTest(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(45 < 7);
        System.out.println("code after soft assertion 1");
        System.out.println("code after soft assertion 2");

        softAssert.assertEquals("hello", "hi");
        System.out.println("code after soft assertion 3");
        System.out.println("code after soft assertion 4");
        softAssert.assertAll();
    }



}
