package currenttime;

import com.helloworld.currenttime.CurrentTime;
import com.helloworld.greeting.Greeting;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class GreetingTest {

    private static Logger LOG = Logger.getLogger(GreetingTest.class);

    Greeting greeting = new Greeting();
    Date date = new Date();
    ResourceBundle rb = ResourceBundle.getBundle("messagesTest");

    @Test
    public void welcomeUserTest_SameValues(){

        date.setHours(0);
        String res1 = greeting.welcomeUserByLocalization(date, rb);
        date.setHours(1);
        String res2 = greeting.welcomeUserByLocalization(date, rb);
        Assert.assertSame(res1, res2);
        LOG.debug("test success");

    }

    @Test
    public void welcomeUserTest_TruthValues(){

        date.setHours(23);
        LOG.debug(String.format(new SimpleDateFormat("HH").format(date)));
        Assert.assertSame(greeting.welcomeUserByLocalization(date, rb), rb.getString("night.time"));
        LOG.debug("test success");
    }


}
