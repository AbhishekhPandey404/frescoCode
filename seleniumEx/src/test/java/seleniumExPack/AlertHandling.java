package seleniumExPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class AlertHandling {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(2000);

        // Simple Alert
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Thread.sleep(1000);
        Alert alert=driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);

        // Confirmation Alert
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Thread.sleep(1000);
        alert=driver.switchTo().alert();
        alert.dismiss();
        Thread.sleep(2000);

        // Prompt Alert
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Thread.sleep(1000);
        alert=driver.switchTo().alert();
        alert.sendKeys("Selenium");
        Thread.sleep(1000);
        alert.accept();

        Thread.sleep(2000);
        driver.quit();
    }
}
