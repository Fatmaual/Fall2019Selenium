package com.automation.test.day6;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(1);
        Select stateSelect=new Select(driver.findElement(By.id("state")));
        stateSelect.selectByValue("DC");//try with PA

        String expected="District Of Columbia";
        String actual =stateSelect.getFirstSelectedOption().getText();

        if(expected.equals(actual)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
            System.out.println("expected: "+ expected);
            System.out.println("actual: "+actual);
        }



        BrowserUtils.wait(2);
        driver.quit();
    }
}
