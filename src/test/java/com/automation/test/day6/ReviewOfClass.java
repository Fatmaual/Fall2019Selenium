package com.automation.test.day6;

public class ReviewOfClass {
    public static void main(String[] args) {
        /**
         * March 8, 2020
         * Agenda:
         * Drop-downs
         * Alerts
         *
         * ####################
         *
         * From the selenium perspective, there are 2 types of drop-downs: select and other.
         *
         * To handle select drop-downs, use Select class from selenium. You can select by:
         * - text
         * - value (<option value="smth">)
         * - index
         *
         * In case of any other drop-down, just click on,wait until options becomes visible and click on that option. You need a locator for dropdown and option.

         * There are 2 types of xpath: relative and absolute.
         *
         * Example of absolute:
         *
         * /html/body/div/div[2]/div/div/button[2]
         *
         * never used in automation, because it's not reliable.
         * absolute xpath always starts with root element. In case of html document - it's html.
         *
         * Also, absolute xpath starts with single front slash /
         *
         * You cannot start from anywhere, you must start from the top, and go from child to parent without skipping. Otherwise, locator will not work.
         *
         * ##################################
         * There are two types of XPath:
         * ▪
         * For example: /html/body/div[1]/span
         * ▪
         * Absolute XPath 
         * It is the direct way to find the element, but the disadvantage of the absolute XPath is that, if
         * there are any changes made in the path of the element then that XPath gets failed.
         * Relative XPath 
         * For Relative XPath, the path starts from the middle of the HTML DOM structure. It begins
         * with the double forward slash (//), which means it can search the element anywhere at the
         * webpage.
         * For example: //input[@id=‘btn’]
         * ##################################
         *
         * Remember:
         * / - absolute
         * // - relative
         *
         * it's not a good practice to copy xpath from the browser.
         *
         * <button class="btn btn-primary" onclick="button4()" id="btnbtn_button">Button 4</button>
         * //button[@class='btn btn-primary'] or //*[@class='btn btn-primary']
         *
         * //button[@onclick='button4()'] - find a button with onclick value button4()
         *
         * //button[@id='btnbtn_button'] - find a button, with id btnbtn_button
         *
         * //button[text()='Button 4'] - find a button, with text Button 4
         *
         * //tag[@attribute='value']

         * //button[starts-with(@id,'button_')] - to find a button, where id starts with button_
         * so not exactly equals to button_, just starts with it.
         * //tag[starts-with(@attribute,'value')] -- find element, that has a following value in the beginning only.
         *
         * //tag[starts-with(text(),'text')] -- find element, that has a following text in the beginning only.
         * //tag[contains(@attribute,'value')] -- find element, that partially contains value. Doesn't matter in the beginning, end or in the middle.
         *
         * //tag[contains(text(),'text')] -- find element, that partially contains text. Doesn't matter in the beginning, end or in the middle.
         *
         * If, there are couple elements with the same xpath, use index to specify needed one:
         *
         * //button[index] or (//button)[index]
         *
         * indexes starts with 1 in xpath
         *
         * //button[contains(text(),'5')] - find a button, that contains 5 in the text
         *
         * ####################################################################
         *
         * In Selenium, there is a class Select that is used to handle dropdowns.
         * It works only with <select> based drop-downs.
         * We can select by:
         * - text
         * - value
         * - index
         *
         * In case of other drop-downs, just click on it and click on the option to select. Don't use Select class if there is no <select> tag.
         *
         * getFirstSelctedOption() - get selected option from the drop down
         *
         * alert - javascript popup message that is used to notify user about something.
         * To handle it, use Alert methods in selenium:
         *
         * driver.switchTo().alert().accept() - click ok
         * driver.switchTo().alert().dismiss() - click cancel
         * driver.switchTo().alert().sendKeys() - enter text
         * driver.switchTo().alert().getText() - read popup message
         *
         * Xpath - the most powerful locator. There are 2 xpath's: absolute and relative
         *
         * absolute starts with / and root element, for example: /html/body/div/
         * relative starts with // and any element, like //button or //input
         */


    }
}
