package Test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.pomIrctcRegistrationPage;

public class TestIrctcRegistration extends BaseTest{

	@Test
	public void Registration() throws IOException, InterruptedException
	{
		pomIrctcRegistrationPage register = new pomIrctcRegistrationPage(driver);
				register.userRegistration();
	}
}
