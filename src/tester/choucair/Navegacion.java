package tester.choucair;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navegacion {
    static WebDriver driver;

    public static void main(String[] args) {

        String url = "https://www.choucairtesting.com/";
        String chromePath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"menu-item-550\"]/a")).click();
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollBy(0,2700)");
    try{
            driver.manage().deleteAllCookies();
            driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"page\"]/a[2]")).click();
            Thread.sleep(1500);
            System.out.println("PRUEBA EXITOSA");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {
            driver.close();
        }
    }
}