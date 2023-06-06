package pagefactory;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage {
	@FindBy(xpath="//a[@class='btn btn-warning']")
	public static WebElement signup;
 
	@FindBy(xpath="//input[@id='firstname']")
	public static WebElement firstname;
	
	@FindBy(xpath="//input[@id='middlename']")	
	public static WebElement middlename;	
	
	@FindBy(xpath="//input[@id='lastname']")
	public static WebElement lastname;
	
	@FindBy(xpath="//input[@id='loginname']")
	public static WebElement userId;
	
	@FindBy(xpath="//input[@id='pwd']")
	public static WebElement password;
	
	@FindBy(xpath="select[@id='pwdhintq']")
	public static WebElement secret_code;
	
	@FindBy(xpath="//input[@id='pwdhint']")
	public static WebElement password_hint;
	
	@FindBy(xpath="//input[@id='homephone']")
	public static WebElement home_phone;
	
	@FindBy(xpath="//input[@id='mobilephone']")
	public static WebElement mobile_phone;
	
	@FindBy(xpath="//input[@id='emailaddress']")
	public static WebElement email;
	
	
	public static WebElement business_type;
	
	
	public static WebElement type;
	
	@FindBy(xpath="//input[@id='organizationname1']")
	public static WebElement business_name;
	
	@FindBy(xpath="//input[@id='organizationname2']")
	public static WebElement Inc;
	
	@FindBy(xpath="//input[@id='street1']")
	public static WebElement street;
	
	@FindBy(xpath="//input[@id='street2']")
	public static WebElement suite_building;

	@FindBy(xpath="//input[@id='city']")
	public static WebElement city;
	
	@FindBy(xpath="//input[@id='state']")
	public static WebElement state;
	
	@FindBy(xpath="//input[@id='postalcode']")
	public static WebElement postal_code;
	
	
	public static WebElement country;
	
	@FindBy(xpath="//div[@class='recaptcha-checkbox-border']")
	public static WebElement recaptcha;
	
	@FindBy(xpath="//span[@class='glyphicon glyphicon-save']")
	public static WebElement signup_button;
	

}
