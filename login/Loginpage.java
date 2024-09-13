package login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base.Base;
import generic_methods.GenericMethods;

public class Loginpage extends Base {
	public static By EmailId=By.xpath("//input[@id='email']");
	public static By Password=By.xpath("//input[@id='pass']");
	public static By Button=By.xpath("//button[@name='login']");
	
	public static void Enter_emailid(String Email)
	{
	driver.findElement(EmailId).sendKeys(Email);
	}
public static void Enter_password(String Passcode)
{
driver.findElement(Password).sendKeys(Passcode);
}

public static void login()
{
	GenericMethods gm=new GenericMethods();
	WebElement Button1=driver.findElement((By) Button);
	gm.explictwait(6,Button1);
}


}
