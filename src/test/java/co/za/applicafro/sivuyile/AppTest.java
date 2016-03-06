package co.za.applicafro.sivuyile;


import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    App app = new App();

    @Test
    public void testTruth(){
        Assert.assertTrue(app.isTheSame(1,1));
    }
}
