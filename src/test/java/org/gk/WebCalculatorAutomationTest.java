package org.gk;

import org.testng.Assert;
import org.testng.annotations.Test;
public class WebCalculatorAutomationTest extends BaseWebCalculator
{
    @Test(description = "(10-8)x3. Multiplication works with 'x' as well.")
    public void subtractAndMultiply()
    {
        calculate("(10-8)x3");
        EQUALS.click();
        String result = RESULT.getText();
        sleep();
        Assert.assertEquals(result, "6" );
    }

    @Test(description = "(10+8)*3. Multiplication works with '*' as well.")
    public void addAndMultiply()
    {
        calculate("(10+8)x3");
        EQUALS.click();
        String result = RESULT.getText();
        sleep();
        Assert.assertEquals(result, "54" );
    }

    @Test(description = "(10+2)/3. Division works with '/' as well.")
    public void addAndDivide()
    {
        calculate("(10+2)/3");
        EQUALS.click();
        String result = RESULT.getText();
        sleep();
        Assert.assertEquals(result, "4" );
    }

    @Test(description = "(10-2)÷4. Division works with '÷' as well.")
    public void subtractAndDivide()
    {
        calculate("(10-2)÷4");
        EQUALS.click();
        String result = RESULT.getText();
        sleep();
        Assert.assertEquals(result, "2" );
    }
}
