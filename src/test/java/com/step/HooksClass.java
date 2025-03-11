package com.step;

import com.base.BaseClass;

import io.cucumber.java.After;

public class HooksClass extends BaseClass{

	
	@After
	public void afterClass() {
		driver.quit();
		
	}
}
