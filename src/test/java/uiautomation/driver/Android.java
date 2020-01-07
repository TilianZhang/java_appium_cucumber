package uiautomation.driver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.remote.MobileCapabilityType;

@Component
@Profile("android")
public class Android {

    @Bean
    public AppiumDriver<?> setup() throws MalformedURLException {
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "../../../apps/ApiDemos/bin");
        File app = new File(appDir, "ApiDemos-debug.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        capabilities.setCapability(MobileCapabilityType.APP, "../../../apps");
		capabilities.setCapability("newCommandTimeout", 2000);
        AppiumDriver <?> driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        return driver;
    }
}