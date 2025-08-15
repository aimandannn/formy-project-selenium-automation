package com.linkedinlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class getSuccess 
{
    public static String getSuccess(WebDriver driver)
    {
        WebElement successBanner = driver.findElement(By.className("alert"));
        String a = successBanner.getText();
        return a;
    }
}
