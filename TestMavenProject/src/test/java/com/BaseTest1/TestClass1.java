package com.BaseTest1;

import org.testng.annotations.Test;

public class TestClass1 {

@Test(groups= {"SANITY"})

public void testCase1() {
	
	System.out.println("this is Test Case1");
	System.out.println("this is a new comment");
	System.out.println("this is another comment");
	System.out.println("this is my latest comment");
}
@Test(groups= {"SANITY"})	
public void testCase2() {
	
	System.out.println("this is Test Case2");
}
@Test(groups= {"Regression"})
public void testCase3() {
	
	System.out.println("this is Test Case3");
}
	

}
