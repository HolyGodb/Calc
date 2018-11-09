import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalc {
    Calculator calculator = new Calculator();

    //Pass
    @Test
    public void CheckSum() {
        Assert.assertEquals(calculator.Add(10, 15), 25.0);
    }

    @Test
    public void CheckSubstract() {
        Assert.assertNotNull(calculator.Substract(10, 15));
    }

    @Test
    public void CheckDivide() {
        Assert.assertTrue(calculator.Divide(4, 2) == 2.0);
    }

    @Test
    public void CheckMultiply() {
        Assert.assertEquals(calculator.Multiply(10, 15), 150.0);
    }

    //Fail
    @Test
    public void CheckFailAdd() {
        Assert.assertFalse(calculator.Divide(4, 2) == 2.1);
    }

    @Test
    public void CheckFailSubstract()
    {
        //comment
        Assert.assertFalse(calculator.Substract(5,3) == 2.1);
    }
}
