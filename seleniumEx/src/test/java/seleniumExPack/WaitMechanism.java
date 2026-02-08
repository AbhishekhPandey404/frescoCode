package seleniumExPack;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMechanism {
    public static void main(String[] args) {

        // Launch Chrome browser
        WebDriver driver=new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();

        // Implicit wait: applies to all elements globally
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open dynamic loading page
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        // Click on Start button
        driver.findElement(By.xpath("//button[text()='Start']")).click();

        // Explicit wait: wait until specific element becomes visible
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

        // Wait for text element to appear
        WebElement text=wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("finish"))
        );

        // Print the loaded text
        System.out.println(text.getText());

        // Close the browser
        driver.quit();
    }
}
