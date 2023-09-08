package Email.java;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue extends OpenBrowser
{
    @Test
    public static void AT(String a, String b )

    {
        Assert.assertEquals(a,b);


    }
}
