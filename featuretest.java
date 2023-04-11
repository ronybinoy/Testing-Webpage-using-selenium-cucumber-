package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class featuretest {
 WebDriver driver=null;
 @Given("browser is open")
 public void browser_is_open() {
  System.setProperty("webdriver.geckodriver.marionette","C:\\Users\\ronyb\\eclipse-workspace\\new\\src\\test\\resources\\Driver\\chromedriver.exe");
  driver = new FirefoxDriver();
  driver.manage().window().maximize();
 }

 @And("user is on login page")
 public void user_is_on_login_page() throws Exception {
     driver.navigate().to("file:///C:/Users/ronyb/OneDrive/Desktop/login.html");
     Thread.sleep(2000);
 }

 @When("user enters user and password")
 public void user_enters_user_and_password() {
     driver.findElement(By.id("email")).sendKeys("ronybinoy189@gmail.com");
     driver.findElement(By.id("password")).sendKeys("Rony@189");
     
 }

 @And("user clicks on login")
 public void user_clicks_on_login() {
  driver.findElement(By.id("btn")).click();
     
 }

 @Then("user is navigated to the home page")
 public void user_is_navigated_to_the_home_page() throws Exception {
  driver.findElement(By.className("post-title")).isDisplayed();
    Thread.sleep(2000);
    driver.close();
    driver.quit();
 }


}