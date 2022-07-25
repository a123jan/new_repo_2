package SDET36_36L1SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {

	public static void main(String[] args) throws MalformedURLException {
URL url = new URL("http://43.205.143.146/wd/hub");
DesiredCapabilities cap=new DesiredCapabilities();
cap.setBrowserName("firefox");
cap.setPlatform(Platform.WINDOWS);
RemoteWebDriver driver=new RemoteWebDriver(url,cap);
driver.get("https://gmail.com");


	}

}
