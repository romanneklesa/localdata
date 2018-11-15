package locals;

import com.helloworld.locals.UserLocalization;
import init.LocaleInitTest;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class UserLocalizationTest {

    private static final Logger LOG = Logger.getLogger(LocaleInitTest.class);


    @Test
    public  void testGetCurrentUserLocale(){
        LOG.debug("Check current user locale for nullable");
        Assert.assertNotNull(UserLocalization.getCurrentUserLocale());
        LOG.debug(String.format("locale detected: "+ UserLocalization.getCurrentUserLocale()));
    }
}
