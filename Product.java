package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;

import static java.lang.Thread.sleep;

public class Product
{ public static void main(String[] args) throws IOException {
    WebDriver driver;
    WebDriverManager.edgedriver().setup();
    driver=new EdgeDriver();
     driver.get("https://www.gadgets360.com/mobiles/phone-finder#pfrom=home");
   // driver.get("https://www.nngroup.com/articles/comparison-tables/");
//scroll bar

    JavascriptExecutor js=(JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,6000);");
//for screen shots
    TakesScreenshot ts=(TakesScreenshot)driver;
    File file=ts.getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(file, new File("./Screen/Image4.png"));
    System.out.println("* * * * * * * * *");
  }
}