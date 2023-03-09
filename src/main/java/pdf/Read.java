/*
 * package pdf;
 * 
 * import java.io.FileOutputStream; import java.io.IOException;
 * 
 * import org.apache.poi.xwpf.usermodel.ParagraphAlignment; import
 * org.apache.poi.xwpf.usermodel.XWPFDocument; import
 * org.apache.poi.xwpf.usermodel.XWPFParagraph; import
 * org.apache.poi.xwpf.usermodel.XWPFRun;
 * 
 * public class Read { public static class CreateDocumentSimple {
 * 
 * public static void main(String[] args) throws IOException {
 * 
 * String fileName = "H:\\pdf\\123.docx";
 * 
 * try (XWPFDocument doc = new XWPFDocument()) {
 * 
 * // create a paragraph XWPFParagraph p1 = doc.createParagraph();
 * p1.setAlignment(ParagraphAlignment.CENTER);
 * 
 * // set font XWPFRun r1 = p1.createRun(); r1.setBold(true);
 * r1.setItalic(true); r1.setFontSize(22); r1.setFontFamily("New Roman");
 * r1.setText("I am first paragraph.");
 * 
 * // save it to .docx file try (FileOutputStream out = new
 * FileOutputStream(fileName)) { doc.write(out); }
 * 
 * }
 * 
 * } }
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * }
 * 
 * 
 * 
 * 
 * //public class Searchbox {   // public static void main(String[] args) {
 *       System.setProperty("webdriver.chrome.driver",               
 * "C:\\Users\\prudh\\Downloads\\chromedriver_win32\\chromedriver.exe");
 *       WebDriver driver = new ChromeDriver();       //String url =
 *       //"https://www.ajio.com";
 * 
 *            // Maximize the browser
 *            driver.manage().window().maximize();
 * 
 *            // Launch Website            driver.get("https://www.ajio.com/");
 *       // to verify if a static dropdown is selected with option isSelected()
 *       //boolean drpdwnStatus =
 * driver.findElement(By.xpath("//select[@name=’selType’]"))
 *       //.isSelected();       // to verify if an element is present on page
 * with isDisplayed()       boolean editStatus =
 *               driver.findElement(By.xpath("//div[@class='searchbar-view']")).
 * isDisplayed();
 *               driver.findElement(By.xpath("//div[@class='searchbar-view']")).
 * click();               driver.findElement(By.xpath("//input[@type='text']")).
 * sendKeys("Jeans for men");
 *               driver.findElement(By.xpath("//span[@class='ic-search']")).
 * click();       System.out.println("The edit box display status is " +
 * editStatus);           System.out.println("Able to click the box" +
 * editStatus);           System.out.println("Able to type" + editStatus);
 *           System.out.println("search button" + editStatus);
 *       //driver.close();    } }
 */