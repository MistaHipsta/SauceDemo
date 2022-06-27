package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;



    private By userNameInput = By.id("user-name");
    private By passwordInput = By.id("password");
    private By loginButton = By.id("login-button");
    private By error = By.cssSelector("h3[data-test=error]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(){
        driver.get("https://www.saucedemo.com");
    }

    public void login(String username, String password){

        driver.findElement(userNameInput).sendKeys(username);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).submit();
    }


    public String getError(){
       return driver.findElement(error).getText();
    }
}
