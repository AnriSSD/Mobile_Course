package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class AppTest {
    public static AndroidDriver driver;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        setUp(); // ვქმნით დრაივერს.
        auth("standard_user","secret_sauce"); // ავტორიზაცია
        tearDown(); //ვხურავთ დრაივერს
    }


    public static void auth(String user, String pass) throws InterruptedException {
        Thread.sleep(3000);
        WebElement usernameField = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Username\"]"));
        WebElement passwordField = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Password\"]"));
        WebElement loginBtn = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]"));

        usernameField.sendKeys(user);
        passwordField.sendKeys(pass);
        loginBtn.click();

        Thread.sleep(3000); //დაველოდოთ 3 წამი აპლიკაციის ჩართვას‹
    }


    WebElement addToCardBtn = driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]"));

    driver.executeScript

    /* Java
((JavascriptExecutor) driver).executeScript("mobile: doubleClickGesture", ImmutableMap.of(
            "elementId", ((RemoteWebElement) element).getId()
));




    /*
       ეს მეთოდი გამოიყენება აპიუმთან კავშირისთვის.
        */
    public static void setUp() throws MalformedURLException {
        System.out.println("დავიწყე კავშირის დამყარება");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("appium:automationName", "UIAutomator2"); // განვსაზღრეთ დრაივერის ტიპი.
        cap.setCapability("appium:udid", "emulator-5554"); // განვსაზღრეთ  მოწყობილობა
        cap.setCapability("appium:appPackage", "com.swaglabsmobileapp"); // განვსაზღრეთ აპლიკაციის ფექიჯის სახელი
        cap.setCapability("appium:appActivity", "com.swaglabsmobileapp.SplashActivity"); // განვსაზღრეთ აპლიკაციის ექთივითი
        cap.setCapability("appium:skipUnlock", true); // მოვხსენით ბლოკი
        cap.setCapability("appium:noReset", true); // რესეთისგან თავის აცილება.
        cap.setCapability("appium:autoGrantPermissions", true); //  წვდომების მიცემა შესაბამის მოთხოვნებზე
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), cap);
        System.out.println("დავასრულე კავშირის დამყარება");
    }


    /*
       აუქმებს დრაივერს თუ ის არსებობს.
        */

    public static void tearDown() {

        System.out.println("დავიწყე დრაივერის შემოწმება");
        if (driver != null) {

            System.out.println("დავიწყე დრივერის გაუქმება");
            driver.quit();

            System.out.println("დრაივერი გაუქმებულია");
        }
    }
}