/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author pupil
 */
public class SeleniumTest {
    private static WebDriver driver;
    public SeleniumTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:8080/Ptvr16SeleniumTest/");
    }
    
    @AfterClass
    public static void tearDownClass() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void loginTest() {
         WebElement el=driver.findElement(By.id("showLogin"));
         el.click();
         el=driver.findElement(By.id("showRegistration"));
         el.click();
         registration();
         
         el = driver.findElement(By.id("login"));
         el.sendKeys("TestName");
         el = driver.findElement(By.id("password"));
         el.sendKeys("TestPassword1");
         el = driver.findElement(By.id("btnEnter"));
         el.click();
         el = driver.findElement(By.id("info"));
         assertEquals("Кулити, TestName, Вы вошли!",el.getText());
         
         el=driver.findElement(By.id("logout"));
         el.click();
         el = driver.findElement(By.id("info"));
         assertEquals("Вы вышли!",el.getText());
         
     
     }
     
     
     public void registration(){
            WebElement el = driver.findElement(By.name("name"));
            el.sendKeys("TestName");
            el = driver.findElement(By.name("surname"));
            el.sendKeys("TestSurname");
            el = driver.findElement(By.name("email"));
            el.sendKeys("TestEmail");
            el = driver.findElement(By.name("login"));
            el.sendKeys("TestLogin");
            el = driver.findElement(By.name("password1"));
            el.sendKeys("TestPassword1");
            el = driver.findElement(By.name("password2"));
            el.sendKeys("TestPassword2");
            el = driver.findElement(By.id("btnReg"));
            el.click();
            
            
     }
     
     
     
     
     @Test
     public void addTest() {
         WebElement el = driver.findElement(By.id("showAddNewBook"));
         el.click();
         el=driver.findElement(By.name("name"));
         el.sendKeys("JoJo`s Bizzare Adventure");
         el=driver.findElement(By.name("author"));
         el.sendKeys("Araki");
         el=driver.findElement(By.name("isbn"));
         el.sendKeys("TestISBN");
         el=driver.findElement(By.name("count"));
         el.sendKeys("15");
         el = driver.findElement(By.id("btnAdd"));
         el.click();
         el = driver.findElement(By.id("info"));
         assertEquals("Книга добавлена!",el.getText());
     
     }
     
     
     
}
