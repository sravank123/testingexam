package stepDefinitions;
/*
 * package testcase;
 * 
 * import java.time.Duration;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.chrome.ChromeOptions; import
 * org.openqa.selenium.support.PageFactory; import
 * org.openqa.selenium.support.ui.ExpectedConditions; import
 * org.openqa.selenium.support.ui.Select; import
 * org.openqa.selenium.support.ui.WebDriverWait;
 * 
 * import cucumber.api.java.en.Given; import cucumber.api.java.en.Then; import
 * cucumber.api.java.en.When; import io.github.bonigarcia.wdm.WebDriverManager;
 * import pagefactory.SignupPage;
 * 
 * public class SignupTest { WebDriver driver; SignupPage signup_Page = new
 * SignupPage();
 * 
 * @Given("user should be in the n-bricks sign up page") public void
 * n_bricks_sign_up_page() throws InterruptedException {
 * WebDriverManager.chromedriver().setup(); ChromeOptions chromeOptions = new
 * ChromeOptions(); chromeOptions.addArguments("--remote-allow-origins=*");
 * driver = new ChromeDriver(chromeOptions);
 * driver.get("http://dev-api.n-bricks.com/home"); Thread.sleep(3000);
 * 
 * }
 * 
 * @When("user should enter first name") public void
 * user_should_enter_first_name() { PageFactory.initElements(driver,
 * SignupPage.class); signup_Page.signup.click();
 * signup_Page.firstname.sendKeys("Sri");
 * 
 * 
 * 
 * 
 * }
 * 
 * @When("user should enter middle name") public void
 * user_should_enter_middle_name() { signup_Page.middlename.sendKeys("sj");
 * 
 * }
 * 
 * @When("user should enter last name") public void
 * user_shouold_enter_last_name() {
 * signup_Page.lastname.sendKeys("Priyadharshini");
 * 
 * }
 * 
 * @When("user should enter user id") public void user_should_enter_user_id() {
 * signup_Page.userId.sendKeys("Priyadharshini1197");
 * 
 * }
 * 
 * @When("user should enter password") public void user_should_enter_password()
 * { signup_Page.password.sendKeys("Sripriya1107");
 * 
 * }
 * 
 * 
 * @When("user should select {string}") public void user_should_select(String
 * string) { Select dropdown=new Select(driver.findElement(By.id("pwdhintq")));
 * dropdown.selectByVisibleText("What is your secret pin?"); }
 * 
 * 
 * @When("user should enter password hint") public void
 * user_should_enter_password_hint() {
 * signup_Page.password_hint.sendKeys("Name");
 * 
 * }
 * 
 * @When("user should enter home phone") public void
 * user_should_enter_home_phone() {
 * signup_Page.home_phone.sendKeys("04633235233");
 * 
 * }
 * 
 * @When("user should enter mobile number") public void
 * user_should_enter_mobile_number() {
 * signup_pf.mobile_phone.sendKeys("9865432057");
 * 
 * }
 * 
 * @When("user should enter email") public void user_should_enter_email() {
 * signup_pf.email.sendKeys("sripriyadharshini@n-bricks.com");
 * 
 * }
 * 
 * @When("user should select business type as {string}") public void
 * user_should_select_business_type(String string) { Select userType=new
 * Select(driver.findElement(By.id("usertype")));
 * userType.selectByVisibleText("Individual");
 * 
 * }
 * 
 * @When("user should select type as {string}") public void
 * user_should_select_type(String string) { Select orgType =new
 * Select(driver.findElement(By.id("organizationtype")));
 * orgType.selectByVisibleText("Manufacturer");
 * 
 * 
 * }
 * 
 * @When("user should enter business name") public void
 * user_should_enter_business_name() {
 * signup_pf.business_name.sendKeys("n-bricks");
 * 
 * }
 * 
 * @When("user should enter Inc") public void user_should_enter_Inc() {
 * signup_pf.Inc.sendKeys("Pvt.Ltd");
 * 
 * }
 * 
 * @When("user should enter street") public void user_should_enter_street() {
 * signup_pf.street.sendKeys("signup_pf");
 * 
 * }
 * 
 * @When("user should enter suite") public void user_should_enter_suite() {
 * signup_pf.suite_building.sendKeys("thoraipakam");
 * 
 * }
 * 
 * @When("user should  enter city") public void user_should_enter_city() {
 * signup_pf.city.sendKeys("Chennai");
 * 
 * }
 * 
 * @When("user should enter state") public void user_should_enter_state() {
 * signup_pf.state.sendKeys("Tamil nadu");
 * 
 * }
 * 
 * @When("user should enter postal code") public void
 * user_should_enter_postal_code() { signup_pf.postal_code.sendKeys("600097");
 * 
 * }
 * 
 * @When("user should select country as {string}") public void
 * user_should_select_country(String string) { Select country =new
 * Select(driver.findElement(By.id("country")));
 * country.selectByVisibleText("India");
 * 
 * }
 * 
 * 
 * @When("user should check the recaptcha") public void
 * user_should_check_the_recaptcha() { // WebDriverWait wait=new
 * WebDriverWait(driver, Duration.ofSeconds(60)); //
 * wait.until(ExpectedConditions.elementToBeClickable(signup_pf.signup_button)).
 * click(); //signup_pf.recaptcha.click();
 * 
 * 
 * 
 * 
 * }
 * 
 * @When("user should click sign up button") public void
 * user_should_click_sign_up_button() { // WebDriverWait wait=new
 * WebDriverWait(driver, Duration.ofSeconds(30));
 * //wait.until(ExpectedConditions.elementToBeClickable(signup_pf.signup_button)
 * ).click(); //signup_pf.signup_button.click();
 * 
 * }
 * 
 * @Then("user should go next page") public void user_should_go_next_page() {
 * 
 * // just like
 * 
 * driver.quit();
 * 
 * }
 * 
 * }
 */