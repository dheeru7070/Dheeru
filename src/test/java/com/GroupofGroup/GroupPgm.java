package com.GroupofGroup;

import org.testng.annotations.Test;

public class GroupPgm {

	@Test (dependsOnGroups = "a")
	private void hello() {
	
		System.out.println("Hai");

	}
	@Test (dependsOnGroups = "b")
	private void Thank() {
	
		System.out.println("you");
		
	}
	@Test (groups = "b")
	private void wel() {
	  
		System.out.println("come");
		
	}
	@Test (groups = "a")
	private void bike() {
		
		System.out.println("racing");

	}
	@Test (groups = "a")
	private void formula() {
	
		System.out.println("racing");
		
	}
	
}
