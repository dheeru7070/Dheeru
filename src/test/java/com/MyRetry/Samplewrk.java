package com.MyRetry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Samplewrk {
	
	@Test(retryAnalyzer = MyRetryProg.class)
	private void userN() {
		Assert.assertEquals("Raju", "Raj");
	

	}
	
	@Test
	private void passwrdVali() {
		Assert.assertEquals("venkat", "kamal");
		

	}

}
