package com.linkedinlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class submitForm 
{
    public static void submitForm(WebDriver driver) throws InterruptedException
    {
        WebElement firstName = driver.findElement(By.id("first-name"));
        WebElement lastName = driver.findElement(By.id("last-name"));
        WebElement jobTitle = driver.findElement(By.id("job-title"));
        WebElement education = driver.findElement(By.id("radio-button-2"));
        WebElement gender = driver.findElement(By.id("checkbox-1"));
        WebElement experienceOption = driver.findElement(By.id("select-menu"));
        WebElement experience = driver.findElement(By.cssSelector("option[value='2']"));
        WebElement date = driver.findElement(By.id("datepicker"));
        WebElement submitBtn = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));

        firstName.sendKeys("Aiman");
        lastName.sendKeys("Danial");
        jobTitle.sendKeys("QA Engineer");
        education.click();
        gender.click();
        experienceOption.click();
        experience.click();
        date.sendKeys("15/08/2025");
        date.sendKeys(Keys.ENTER);

        Thread.sleep(5000);
        submitBtn.click();
    }
}
