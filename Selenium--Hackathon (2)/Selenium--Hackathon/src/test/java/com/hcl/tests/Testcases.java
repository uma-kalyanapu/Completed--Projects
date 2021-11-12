package com.hcl.tests;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hcl.basedata.BaseData;
import com.hcl.data.ExcelReader;
import com.hcl.pages.LoginPage;
import com.hcl.pages.SearchingHpLaptop;
import com.hcl.pages.SearchingaAppleLaptop;
import com.hcl.pages.VerifyingCart;

public class Testcases extends BaseData {
	BaseData base;
	LoginPage loginp;
	SearchingHpLaptop shp;

	SearchingaAppleLaptop sapple;

	VerifyingCart vc;

	@BeforeMethod
	public void SetUp() {
		base = new BaseData();
		base.launchBrowser();
	}

	@Test(priority = 0, enabled = true, dataProvider = "LoginDataa") // Logindataa is just naming convention
	public void Login(String userName, String password) {
		loginp = new LoginPage(driver);

		Actions actions = new Actions(driver);
		actions.moveToElement(loginp.account).build().perform();
		loginp.signIn.click();
		loginp.emaill.sendKeys(userName);
		System.out.println("Username is entred.");
		loginp.continuee.click();
		loginp.passwordd.sendKeys(password);
		System.out.println("User Password is entred.");
		loginp.signInButton.click();
		System.out.println("User is able to login Amazon application Successfully");
	}

	@DataProvider(name = "LoginDataa")
	public String[][] getData() throws IOException { // get the data from excel
		String path = "C:\\Eclipse Inst--Workspace\\Selenium--Hackathon\\src\\main\\java\\com\\hcl\\data\\Amazon-Data.xlsx";

		ExcelReader util = new ExcelReader(path);
		int totalrows = util.getRowCount("Sheet1"); //
		int totalcols = util.getCellCount("Sheet1", 1);
		String loginData[][] = new String[totalrows][totalcols];
		for (int i = 1; i <= totalrows; i++) // 1
		{
			for (int j = 0; j < totalcols; j++) // 0
			{
				loginData[i - 1][j] = util.getCellData("Sheet1", i, j); //
			}
		}
		return loginData;
	}

	@Test(priority = 1, enabled = true, dataProvider = "LoginDataa")

	public void SearchHpLaptop(String userName, String password) throws InterruptedException {

		loginp = new LoginPage(driver);
		Actions actions = new Actions(driver);
		actions.moveToElement(loginp.account).build().perform();
		loginp.signIn.click();
		loginp.emaill.sendKeys(userName);
		loginp.continuee.click();
		loginp.passwordd.sendKeys(password);
		loginp.signInButton.click();
		System.out.println("User Successfully Logged in");
		Thread.sleep(3000);

		shp = new SearchingHpLaptop(driver);
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(shp.Menuall).build().perform();
		shp.Menuall.click();
		shp.computers.click();
		shp.laptops.click();
		// shp.cputype.click();
		shp.checkHP.click();
		shp.selectinglaptop.click();
		System.out.println("Searching Hp laptop is Successful");
	}

	@Test(priority = 2, enabled = true, dataProvider = "LoginDataa")

	public void AddHpLaptopToCart(String userName, String password) throws InterruptedException {

		loginp = new LoginPage(driver);
		Actions actions = new Actions(driver);
		actions.moveToElement(loginp.account).build().perform();
		loginp.signIn.click();
		loginp.emaill.sendKeys(userName);
		loginp.continuee.click();
		loginp.passwordd.sendKeys(password);
		loginp.signInButton.click();
		System.out.println("User Successfully Logged in");
		Thread.sleep(3000);

		shp = new SearchingHpLaptop(driver);
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(shp.Menuall).build().perform();
		shp.Menuall.click();
		shp.computers.click();
		shp.laptops.click();
		// shp.cputype.click();
		shp.checkHP.click();
		shp.selectinglaptop.click();
		// System.out.println("Hp laptop is clicked");

		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				shp.addtocart.click();
				Thread.sleep(5000);
				System.out.println("Hp laptop is successfully added to the cart");

				System.out.println(driver.switchTo().window(child_window).getTitle());

				driver.close();
			}

		} // switch to window
		driver.switchTo().window(parent);
	}

	@Test(priority = 3, enabled = true, dataProvider = "LoginDataa")

	public void SearchAppleLaptop(String userName, String password) throws InterruptedException {

		loginp = new LoginPage(driver);
		Actions actions = new Actions(driver);
		actions.moveToElement(loginp.account).build().perform();
		loginp.signIn.click();
		loginp.emaill.sendKeys(userName);
		loginp.continuee.click();
		loginp.passwordd.sendKeys(password);
		loginp.signInButton.click();
		System.out.println("User Successfully Logged in");
                                                                                                                                                                                     
		Thread.sleep(3000);

		sapple = new SearchingaAppleLaptop(driver);
		//Actions actions1 = new Actions(driver);
		actions.moveToElement(sapple.Menuall).build().perform();
		sapple.Menuall.click();
		sapple.computers.click();
		sapple.laptops.click();
		// sapple.cputype.click();

		sapple.checkApple.click();
		Thread.sleep(2000);
		sapple.selectinglaptop.click();
		System.out.println("Searching Apple laptop is Successful");
	}

	@Test(priority = 4, enabled = true, dataProvider = "LoginDataa")
	public void AddApplelapyToCart(String userName, String password) throws InterruptedException {

		loginp = new LoginPage(driver);
		Actions actions = new Actions(driver);
		actions.moveToElement(loginp.account).build().perform();
		loginp.signIn.click();
		loginp.emaill.sendKeys(userName);
		loginp.continuee.click();
		loginp.passwordd.sendKeys(password);
		loginp.signInButton.click();
		System.out.println("User Successfully Logged in");

		Thread.sleep(3000);

		sapple = new SearchingaAppleLaptop(driver);
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(sapple.Menuall).build().perform();
		sapple.Menuall.click();
		sapple.computers.click();
		sapple.laptops.click();
		// sapple.cputype.click();

		sapple.checkApple.click();
		Thread.sleep(2000);
		sapple.selectinglaptop.click();
		// System.out.println("apple laptop is clicked");

		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				sapple.addtocart.click();
				Thread.sleep(5000);
				System.out.println("Apple laptop is successfully added to the cart");
				System.out.println(driver.switchTo().window(child_window).getTitle());

				driver.close();
			}

		} // switch to window
		driver.switchTo().window(parent);
	}

	@Test(priority = 5, enabled = true, dataProvider = "LoginDataa")

	public void ViewCartDetails(String userName, String password) throws InterruptedException {

		loginp = new LoginPage(driver);
		Actions actions = new Actions(driver);
		actions.moveToElement(loginp.account).build().perform();
		loginp.signIn.click();
		loginp.emaill.sendKeys(userName);
		loginp.continuee.click();
		loginp.passwordd.sendKeys(password);
		loginp.signInButton.click();
		System.out.println("User Successfully Logged in");

		Thread.sleep(3000);

		vc = new VerifyingCart(driver);
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(vc.viewcart).build().perform();
		vc.viewcart.click();
		System.out.println("Cart is viewed Successfully");
	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		base.driver.quit();
	}
}


