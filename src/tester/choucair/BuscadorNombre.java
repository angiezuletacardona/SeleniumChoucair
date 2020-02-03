package tester.choucair;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuscadorNombre {
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
        js.executeScript("window.scrollBy(0,1600)");

        try{
            WebElement txtpalabras=driver.findElement(By.name("search_keywords"));
            txtpalabras.sendKeys("analista");
            driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[12]/div/div/div/div/div/div[2]/div/div/div/form/div[1]/div[4]/input")).click();
            Thread.sleep(1500);
            System.out.println("PRUEBA EXITOSA");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {
            driver.close();
        }
    }
}
