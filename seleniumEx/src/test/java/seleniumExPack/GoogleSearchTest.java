package seleniumExPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        driver.findElement(By.name("q"))
              .sendKeys("india vs nezealand" + Keys.ENTER);
        
        Thread.sleep(2000);
       
        driver.quit();
    }
}