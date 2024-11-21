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

    @Then("Verify email textbox is displayed")
    public void verifyEmailTextboxIsDisplayed() {
        Assert.assertTrue(driver.findElement(By.id("email")).isDisplayed());
    }

    @And("Verify password textbox is displayed")
    public void verifyPasswordTextboxIsDisplayed() {
        Assert.assertTrue(driver.findElement(By.id("pass")).isDisplayed());
    }

    @And("Close application")
    public void closeApplication() {
        driver.quit();
    }
}
