package com.linkedinlearning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;



public class linkedinlearning_01Test 
{
    private WebDriver driver;
    private WebDriverWait wait;
    

    @BeforeEach
    void setupChromeDriver() 
    {
        // Setup Chrome Web Driver.
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Navigate to Google.com to confirm browser launch
        driver.get("https://www.google.com");
    }

    // @Test
    // void linkedinlearning_keypress() throws InterruptedException
    // {
    //     driver.get("https://formy-project.herokuapp.com/keypress");

    //     WebElement nameField = driver.findElement(By.id("name"));
    //     nameField.click();
    //     nameField.sendKeys("Aiman Danial");

    //     WebElement sendBtn = driver.findElement(By.id("button"));
    //     sendBtn.click();
        
    //     System.out.println("Test 1: Simulating Key and Mouse Press Passed.");
    // }

    // @Test
    // void linkedinlearning_autocomplete() throws InterruptedException
    // {
    //     driver.get("https://www.wikipedia.org/");

    //     WebElement inputSearch = driver.findElement(By.id("searchInput"));
    //     inputSearch.click();
    //     inputSearch.sendKeys("Avenged Sevenfold");

    //     Thread.sleep(2000);

    //     WebElement dropdownSearch = driver.findElement(By.xpath("//div[@class='suggestions-dropdown']//h3[text()='Avenged Sevenfold Tour']"));
    //     dropdownSearch.click();

    //     System.out.println("Test 2: Simulating Autocomplete Passed.");
    // }

    // @Test
    // void linkedinlearning_scroll() throws InterruptedException
    // {
    //     driver.get("https://formy-project.herokuapp.com/scroll");

    //     WebElement name = driver.findElement(By.id("name"));

    //     // The actions.moveToElement() method is not guaranteed to scroll the page. 
    //     //Its primary purpose is to move the mouse cursor to the center of a specified element. 

    //     /*Actions actions = new Actions(driver);
    //     actions.moveToElement(name);*/

    //     Thread.sleep(5000);

    //     JavascriptExecutor js = (JavascriptExecutor) driver;
    //     js.executeScript("arguments[0].scrollIntoView(true);", name);
        
    //     name.sendKeys("Aiman Danial");

    //     WebElement date = driver.findElement(By.id("date"));
    //     date.sendKeys("05252025");

    //     System.out.println("Test 3: Simulating Scroll Passed.");
        
    // }

    // @Test
    // void linkedinlearning_switchToActiveWindow() throws InterruptedException
    // {
    //     driver.get("https://formy-project.herokuapp.com/switch-window");

    //     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    //     WebElement switchWindow = driver.findElement(By.id("new-tab-button"));
    //     switchWindow.click();

    //     String currentWindow = driver.getWindowHandle();

    //     for(String handle1:driver.getWindowHandles())
    //     {

    //         if (!handle1.equals(currentWindow)) 
    //         {
    //             driver.switchTo().window(handle1);
    //             System.out.println("Successfully switch to new window.");
    //             break;
    //         }
    //     }

        
    //     // Wait for the "Buttons" link to be clickable on the new page
    //     By modalLink = By.linkText("Modal");
    //     WebElement modalPage = driver.findElement(modalLink);
    //     modalPage.click();
        
    //     System.out.println("Button link clicked successfully.");


    //     driver.switchTo().window(currentWindow);

    //     Thread.sleep(5000);

    //     System.out.println("Return to original window successfully.");
        
    //     System.out.println("Test 4: Simulating Switch to Active Window Passed.");
    // }

    // @Test
    // void linkedinlearning_switchToAlert() throws InterruptedException
    // {
    //     driver.get("https://formy-project.herokuapp.com/switch-window");

    //     WebElement switchToAlertBtn = driver.findElement(By.id("alert-button"));
    //     switchToAlertBtn.click();

        

    //     Alert alert = driver.switchTo().alert();
    //     Thread.sleep(10000);
    //     alert.accept();

    //     System.out.println("Test 5: Simulating Switch to Alert Passed.");

    // }

    // @Test
    // void linkedinlearning_jsExecutor() throws InterruptedException
    // {
    //     driver.get("https://formy-project.herokuapp.com/modal");

    //     WebElement modalBtn = driver.findElement(By.id("modal-button"));
    //     modalBtn.click();

    //     Thread.sleep(5000);

    //     WebElement okBtn = driver.findElement(By.id("ok-button"));

    //     JavascriptExecutor js = (JavascriptExecutor) driver;
    //     js.executeScript("arguments[0].click();", okBtn);
    //     System.out.println("OK button clicked successfully.");

    //     WebElement closeBtn = driver.findElement(By.id("close-button"));
    //     js.executeScript("arguments[0].click();", closeBtn);
    //     System.out.println("Closed button clicked successfully.");
        
    //     System.out.println("Test 6: Simulating JavaScript Executor Passed.");
    // }

    // @Test
    // void linkedinlearning_dragNdrop() throws InterruptedException
    // {
    //     driver.get("https://formy-project.herokuapp.com/dragdrop");

    //     WebElement image = driver.findElement(By.id("image"));
    //     WebElement box = driver.findElement(By.id("box"));

    //     Thread.sleep(3000);

    //     Actions actions = new Actions(driver);
    //     actions.dragAndDrop(image, box).build().perform();

    //     Thread.sleep(5000);

    //     System.out.println("Test 7: Simulating Drag and Drop Passed.");
    // }

    // @Test
    // void linkedinlearning_radioButton() throws InterruptedException
    // {
    //     driver.get("https://formy-project.herokuapp.com/radiobutton");

    //     WebElement option1 = driver.findElement(By.id("radio-button-1"));
    //     option1.click();
    //     System.out.println("Option 1 clicked successfully.");

    //     WebElement option2 = driver.findElement(By.cssSelector("input[value='option2']"));
    //     option2.click();
    //     System.out.println("Option 2 clicked successfully.");

    //     WebElement option3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
    //     option3.click();
    //     System.out.println("Option 3 clicked successfully.");


    //     System.out.println("Test 8: Simulating Radio Button Passed.");
    // }

    // @Test
    // void linkedinlearning_datePicker() throws InterruptedException
    // {
    //     driver.get("https://formy-project.herokuapp.com/datepicker");

    //     WebElement datePicker = driver.findElement(By.id("datepicker"));
    //     datePicker.sendKeys("03/25/2025");
    //     datePicker.sendKeys(Keys.ENTER);
    //     System.out.println("Date Picker using send-key success.");

    //     Thread.sleep(5000);

    //     System.out.println("Test 9: Simulating Date Picker Passed.");
    // }

    //  @Test
    // void linkedinlearning_dropdownMenus() throws InterruptedException
    // {
    //     driver.get("https://formy-project.herokuapp.com/dropdown");

    //     WebElement dropdownBtn = driver.findElement(By.id("dropdownMenuButton"));
    //     dropdownBtn.click();

    //     //Option 1: ID

    //     // WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));
    //     // autocompleteItem.click();
    //     // System.out.println("Option Autocomplete selected successfully.");

    //     // Thread.sleep(5000);
        
    //     //Option 2: X-Path

    //     // WebElement buttonItem = driver.findElement(By.xpath("/html/body/div/div/div/a[2]"));
    //     // buttonItem.click();

    //     // System.out.println("Option Button selected successfully.");

    //     // Thread.sleep(5000);

    //     //Option 3: Link Text

    //     // WebElement checkBoxItem = driver.findElement(By.linkText("Checkbox"));
    //     // checkBoxItem.click();

    //     // System.out.println("Option Checkbox selected successfully.");

    //     // Thread.sleep(5000);

    //     //Option 4: X-Path


    //     System.out.println("Test 10: Simulating Dropdown Passed.");
    // }


    // @Test
    // void linkedinlearning_fileUpload() throws InterruptedException
    // {
    //     driver.get("https://formy-project.herokuapp.com/fileupload");

    //     String file = "C:\\Users\\Aiman_118256\\Downloads\\TEST PDF 2024.pdf";

    //     WebElement fileUploadInput = driver.findElement(By.id("file-upload-field"));
    //     fileUploadInput.sendKeys(file);

    //     System.out.println("File upload successfully using send key.");
    //     Thread.sleep(3000);

    //     System.out.println("Test 11: Simulating File Upload Passed.");
    // }

    // @Test
    // void linkedinlearning_implicitWait()
    // {
    //     driver.get("https://www.wikipedia.org/");

    //     WebElement inputSearch = driver.findElement(By.id("searchInput"));
    //     inputSearch.click();
    //     inputSearch.sendKeys("Avenged Sevenfold");

    //     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    //     WebElement dropdownSearch = driver.findElement(By.xpath("//div[@class='suggestions-dropdown']//h3[text()='Avenged Sevenfold Tour']"));
    //     dropdownSearch.click();

    //     System.out.println("Test 12: Simulating Implicit Wait Passed.");
        
    // }

    // @Test
    // void linkedinlearning_explicitWait()
    // {
    //     driver.get("https://www.wikipedia.org/");

    //     WebElement inputSearch = driver.findElement(By.id("searchInput"));
    //     inputSearch.click();
    //     inputSearch.sendKeys("Avenged Sevenfold");

    //     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    //     By dropdown =By.xpath("//div[@class='suggestions-dropdown']//h3[text()='Avenged Sevenfold Tour']");
    //     WebElement dropdownSearch = wait.until(ExpectedConditions.elementToBeClickable(dropdown));
    //     dropdownSearch.click();

    //     System.out.println("Test 13: Simulating Explicit Wait Passed.");
        
    // }

    @Test
    void linkedinlearning_form() throws InterruptedException
    {
        driver.get("https://formy-project.herokuapp.com/form");

        submitForm.submitForm(driver);
        successPage(driver);

        assertEquals("The form was successfully submitted!", getSuccess.getSuccess(driver));
        
        
        System.out.println("Test 14: Simulating Forms Passed.");
        
    }

    

    public static void successPage(WebDriver driver) throws InterruptedException
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        By banner = By.className("alert");
        wait.until(ExpectedConditions.visibilityOfElementLocated(banner));
    }







    @AfterEach
    void closeWindows()
    {
        driver.quit();
    }

}



