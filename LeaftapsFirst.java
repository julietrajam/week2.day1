package SeleniumTL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeaftapsFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//username:demosalesmanager
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
        System.out.println("Title of webpage: "+title);
        
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		
		WebElement login=driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		login.click();
		
		String title1=driver.getTitle();
        System.out.println("Title of webpage: "+title1);
		
		//WebElement crmSfalink=driver.findElement(By.tagName("a"));
		WebElement crmSfalink=driver.findElement(By.linkText("CRM/SFA"));
		crmSfalink.click();
		
		String title2=driver.getTitle();
        System.out.println("Title of webpage: "+title2);
       
        //Clicking Create Lead
        driver.findElement(By.linkText("Create Lead")).click();
        
        //Entering Company Name
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
        
        //Entering First name
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rohan");
        
        //Entering First name local
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Rohan Local");
        
        //Entering Salutation
        driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
        
        //Entering Title
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Athlete");
        
        //Entering Annual Revenue
        driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("2000000");
        
        //Entering SIC Code
        driver.findElement(By.xpath("//input[@name='sicCode']")).sendKeys("2K9B18");
        
        //Entering Description
        driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Athletes and sports competitors typically do the following: Practice to develop and improve their skills. Maintain their sports equipment in good condition. Train, exercise, and follow special diets to stay in the best physical condition.");
        
        //Entering Importanat notes
        driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Practice to develop and improve their skills.");
        
        //Entering Last Name
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Krishna");
        
        //Entering Last name Local
        driver.findElement(By.xpath("//input[@name='lastNameLocal']")).sendKeys("Krishna Local");
        
        //Entering Birth Date
        driver.findElement(By.xpath("//input[@name='birthDate']")).sendKeys("09/1/91");
        
        //Entering Department
        driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Sports");
        
        //Entering number of employees
        driver.findElement(By.xpath("//input[@name='numberEmployees']")).sendKeys("2089");
        
        //Entering TIcker Symbol
        driver.findElement(By.name("tickerSymbol")).sendKeys("true");
        
        //Moving to Contact Information
        
        //Entering Country Code
        WebElement countryCode=driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
        countryCode.clear();
        countryCode.sendKeys("+91");
        
        //Entering Area Code
        driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("600");
        
        //Entering Extension
        driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("044");
        
        //Entering Email Address
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rohan2019@gmail.com");
        		
        //Entering Phone Number
        driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("98868564657");
        
        //Entering Person to Ask For
        driver.findElement(By.name("primaryPhoneAskForName")).sendKeys("Juliet");
        
        //Enteirng Weburl
        driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://www.linkedin.com/signup");
        
        //Moving to Primary Address
        
        //Entering to name
        driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Seenu");
        
      //Entering Address Line1
        driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Medavakkam");
        
      //Entering to City
        driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
        
        
      //Entering to Zip code
        driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600100");

        //Entering Attendee Name
         driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Juliet");
         
        
       //Entering Address Line2
         driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Indira Nagar");
         
         //Click Create Lead
         driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
         

        
        		
        
		
	}

}
