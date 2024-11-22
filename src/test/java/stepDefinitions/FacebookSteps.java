package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FacebookSteps {
    WebDriver driver;

    @Given("Open facebook application")
    public void openFacebookApplication() {
        driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @And("Close application")
    public void closeApplication() {
        driver.quit();
    }

    @Then("Input to Username textbox")
    public void inputToUsernameTextbox() {
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("nhu@gmail.com");
    }

    @And("Input to Password textbox")
    public void inputToPasswordTextbox() {
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys("12345");
    }

    @And("Click to Submit button")
    public void clickToSubmitButton() {
        driver.findElement(By.name("login")).click();
    }

    @Then("Input to Username textbox with {string}")
    public void inputToUsernameTextboxWith(String email) {
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(email);
    }

    @And("Input to Password textbox with {string}")
    public void inputToPasswordTextboxWith(String password) {
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(password);
    }

    @Then("Input to Username with {string} and Password with {string}")
    public void inputToUsernameWithAndPasswordWith(String email, String password) {
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(password);
    }
}
