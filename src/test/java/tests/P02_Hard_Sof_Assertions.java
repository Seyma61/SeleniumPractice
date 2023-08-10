import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.AssertJUnit.assertTrue;

public class P02_Hard_Sof_Assertions {

    @Test
    public void hardAssertion(){

        //ilk method failse diğerini test etmez
        Assert.assertEquals("apple", "app");
        System.out.println("After Assertion failed");

        assertTrue("orange".equals("oranger"));
        System.out.println("After Assertion failed");
    }
    @Test
    public void softAssertion(){
        SoftAssert softAssert = new SoftAssert();

        //ilk method failse diğerini de test eder ve sonucunu verir
        softAssert.assertEquals("apple", "app");
        System.out.println("After Assertion failed");

        softAssert.assertTrue("orange".equals("oranger"));
        System.out.println("After Assertion failed");

        softAssert.assertAll();



    }

}
