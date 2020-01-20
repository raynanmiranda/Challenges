package bases;

import net.thucydides.core.pages.PageObject;
import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase extends PageObject {
    //Variaveis globlais
    protected WebDriverWait wait = null;
    protected WebDriver driver = null;
    protected JavascriptExecutor javaScriptExecutor = null;
    protected long timeOutDefault;

    //Construtor
    public PageBase(WebDriver driver){
        super(driver);
        this.driver = driver;
        timeOutDefault = getWaitForTimeout().toMillis();
        this.wait = new WebDriverWait(driver, timeOutDefault);
        javaScriptExecutor = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
    }

    //Custom Actions
/*    private void waitUntilPageReady(){
        StopWatch timeOut = new StopWatch();
        timeOut.start();

        while (timeOut.getTime() <= timeOutDefault){
            if(javaScriptExecutor.executeScript("return document.readyState").toString() == "complete");{
                timeOut.stop();
                break;
            }
        }
    }
*/
    protected WebElement waitForElement(By locator){
        //waitUntilPageReady();
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        WebElement element = driver.findElement(locator);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    protected WebElement waitForElementByTime(By locator, int time){
        WebDriverWait waitTime = new WebDriverWait(driver, time);
        waitTime.until(ExpectedConditions.presenceOfElementLocated(locator));
        WebElement element = driver.findElement(locator);
        waitTime.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    protected WebElement waitForElementDisabled(By locator){
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        WebElement element = driver.findElement(locator);
        return element;
    }

    protected void click(By locator){
        WebDriverException possibleWebDriverException = null;
        StopWatch timeOut = new StopWatch();
        timeOut.start();

        while (timeOut.getTime() <= timeOutDefault)
        {
            WebElement element = null;

            try
            {
                element = waitForElement(locator);
                element.click();
                timeOut.stop();
                return;
            }
            catch (StaleElementReferenceException e){
                continue;
            }
            catch(ElementClickInterceptedException e){
                continue;
            }
            catch (WebDriverException e){
                possibleWebDriverException = e;
                if (e.getMessage().contains("Other element would receive the click"))
                {
                    continue;
                }

                throw e;
            }
        }

        try {
            throw new Exception(possibleWebDriverException);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    protected void sendKeys(By locator, String text){
        waitForElement(locator).sendKeys(text);
    }

    protected void sendKeysWithoutWaitVisible(By locator, String text){
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        WebElement element = driver.findElement(locator);
        element.sendKeys(text);
    }

    protected void clear(By locator){
        WebElement webElement = waitForElement(locator);
        webElement.clear();
    }

    protected void clearAndSendKeys(By locator, String text){
        WebElement webElement = waitForElement(locator);
        webElement.sendKeys(Keys.CONTROL + "a");
        webElement.sendKeys(Keys.DELETE);
        webElement.sendKeys(text);
    }

    protected void comboBoxSelectByVisibleText(By locator, String text){
        Select comboBox = new Select(waitForElement(locator));
        comboBox.selectByVisibleText(text);
    }

    protected void comboBoxSelectByValue(By locator, String value){
        Select comboBox = new Select(driver.findElement(locator));
        comboBox.selectByValue(value);
    }

    protected void mouseOver(By locator){
        Actions action = new Actions(driver);
        action.moveToElement(waitForElement(locator)).build().perform();
    }

    protected String getText(By locator){
        String text = waitForElement(locator).getText();
        return text;
    }

    protected String getValue(By locator){
        String text = waitForElement(locator).getAttribute("value");
        return text;
    }

    protected boolean returnIfElementIsDisplayed(By locator){
        boolean result = waitForElement(locator).isDisplayed();
        return result;
    }

    protected boolean returnIfElementExists(By locator){
        boolean result = false;

        try
        {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            result = true;
        }
        catch (Exception e)
        {

        }

        return result;
    }


    protected boolean returnIfElementIsEnabled(By locator){
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        boolean result = driver.findElement(locator).isEnabled();
        return result;
    }

    protected boolean returnIfElementIsSelected(By locator){
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        boolean result = driver.findElement(locator).isSelected();
        return result;
    }

    //Javascrip actions
    protected void sendKeysJavaScript(By locator, String value){
        WebElement element = waitForElement(locator);
        javaScriptExecutor.executeScript("arguments[0].value='" + value + "';", element);
    }

    protected void clickJavaScript(By locator){
        WebElement element = waitForElement(locator);
        javaScriptExecutor.executeScript("arguments[0].click();", element);
    }

    protected String getTextJavaScript(By locator){
        WebElement element = waitForElement(locator);
        return (String) javaScriptExecutor.executeScript("return arguments[0].text;", element);
    }

    protected void scrollToElementJavaScript(By locator){
        WebElement element = waitForElement(locator);
        javaScriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    protected void scrollToTop(){
        javaScriptExecutor.executeScript("window.scrollTo(0, 0);");
    }

    //Default actions
    public void refresh(){
        driver.navigate().refresh();
    }

    public void navigateTo(String url){
        driver.navigate().to(url);
    }

    public void openNewTab(){
        javaScriptExecutor.executeScript("window.open();");
    }
    public void closeTab(){
        driver.close();
    }

    public String getTitle(){
        String title = driver.getTitle();
        return title;
    }

    public String getURL(){
        String url = driver.getCurrentUrl();
        return url;
    }
}

