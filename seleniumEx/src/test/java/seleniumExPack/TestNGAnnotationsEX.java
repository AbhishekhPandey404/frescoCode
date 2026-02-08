package seleniumExPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationsEX {

    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass: Browser setup started");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("BeforeClass: Browser launched and maximized");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod: Navigating to Google");
        driver.get("https://www.google.com");
    }

    @Test
    public void testCaseOne() throws InterruptedException {
        System.out.println("Test: Test case execution started");
        Thread.sleep(2000);
        System.out.println("Test: Test case execution completed");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod: Test case finished");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass: Closing browser");
        driver.quit();
        System.out.println("AfterClass: Browser closed");
    }
}
