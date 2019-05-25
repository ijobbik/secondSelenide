import com.codeborne.selenide.Configuration;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {
    Logger logger = Logger.getLogger(this.getClass());

    @BeforeClass
    public void start() {
        loggerPropertyLoader();
        Configuration.timeout = 10000;
        Configuration.startMaximized = true;
    }

    private void loggerPropertyLoader() {
        Properties props = new Properties();
        try {
            props.load(new FileInputStream("src/main/resources/log4j.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        PropertyConfigurator.configure(props);
        logger.debug("---LOGGER STARTS---");
    }

    @AfterTest
    public void afterTest() {

    }
}
