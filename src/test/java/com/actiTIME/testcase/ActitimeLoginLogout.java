package com.actiTIME.testcase;

import java.io.IOException;
import org.testng.annotations.Test;
import com.actiTIME.generics.BaseTest;
import com.actiTIME.pages.ActitimeLoginPage;

public class ActitimeLoginLogout extends BaseTest
{
	@Test
	public void loginlogout() throws IOException, InterruptedException
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();
	}
}