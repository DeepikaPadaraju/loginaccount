package generic_methods;
import java.time.Duration;
import base.Base;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class GenericMethods extends Base {
	public void explictwait(int time,WebElement button1)
	{
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time)); 
wait.until(ExpectedConditions.elementToBeClickable(button1));
button1.click();
}
}
