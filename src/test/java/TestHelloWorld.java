
import com.helloworld.HelloWorld;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class TestHelloWorld {

    private final Locale DEFAULT_LOCALE = new Locale("ru", "RU");
    private final Logger LOG = Logger.getLogger(HelloWorld.class);

    @Test
    public void testDefautLocale() {
        LOG.info("Test for method java.util.Locale.getDefault()");
        Locale defaultLocale = Locale.getDefault();
        assertEquals(DEFAULT_LOCALE, defaultLocale);

    }

    @Test
    public void testProperty() {
        LOG.info("Test for file \"messages.properties\"");
        ResourceBundle bundle = ResourceBundle.getBundle("messages_ru_RU");
        String dayTime = bundle.getString("day.time");
        assertEquals(dayTime, "Доброго дня, мир!");
    }


    @Test
    public void testTime() {


    }

}

