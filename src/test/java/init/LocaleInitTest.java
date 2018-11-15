package init;

import com.helloworld.init.LocaleInit;
import currenttime.GreetingTest;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleInitTest {

    private static Logger LOG = Logger.getLogger(GreetingTest.class);

    @Test
    public void  testLocaleInitNotNullResourceBundle(){
        LOG.debug("Check Resource Bundle for nullable");
        Locale locale = Locale.CANADA;
        Assert.assertNotNull(LocaleInit.getCurrentLocalMessages(locale));
        LOG.debug("Resource Bundle not null");
    }


    @Test
    public void testLocaleInitNotSameLocale(){
        LOG.debug("Check locale for not same");
        ResourceBundle resourceBundle = LocaleInit.getCurrentLocalMessages(Locale.CANADA);
        ResourceBundle resourceBundle1 = LocaleInit.getCurrentLocalMessages(Locale.getDefault());
        Assert.assertNotSame(resourceBundle.toString(),resourceBundle1.toString());
        LOG.debug("locale not same");
    }
}
