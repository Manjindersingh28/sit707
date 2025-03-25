package sit707_tasks;

import java.util.Random;
import org.junit.Assert;
import org.junit.Test;


/**
 * @author Manjinder Singh
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "22329778";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Manjinder Singh";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		// Code here
		DateUtil date = new DateUtil(1,1,2024);
		System.out.println("January1ShouldIncrementToJanuary2 >" + date);
		date.increment();
	    System.out.println(date);
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		// Code here
		DateUtil date = new DateUtil(1, 1, 2024);
        System.out.println("January1ShouldDecrementToDecember31 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(12, date.getMonth());
	}
	
	
	/*
	 * Write tests for rest months of year 2024.
	 */
	
//	Test for February 29 Incrementing to March 1
	@Test
	public void testMaxFebruary29ShouldIncrementToMarch1() {
		DateUtil date = new DateUtil(29, 2, 2024);
        System.out.println("February29ShouldIncrementToMarch1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
//Test for February 1 Decrementing to January 31
	@Test
	public void testFebruary1ShouldDecrementToJanuary31() {
	    DateUtil date = new DateUtil(1, 2, 2024);  
	    System.out.println("February1ShouldDecrementtoJanuary31 > " + date);
	    date.decrement();  
	    System.out.println(date);  
	    Assert.assertEquals(31, date.getDay());  
	    Assert.assertEquals(1, date.getMonth());  
	}

	//Test cases for the table 
	@Test
	public void test3B() {
		DateUtil date = new DateUtil(15, 6, 1994);
        System.out.println("3B > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(16, date.getDay());
	}
	@Test
	public void test4B() {
		DateUtil date = new DateUtil(30, 6, 1994);
        System.out.println("4B > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	@Test
	public void test5B() {
		try {
		DateUtil date = new DateUtil(31, 6, 1994);
        System.out.println("5B > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}catch (RuntimeException e) {
        System.out.println("Error: " + e.getMessage());  // Print the error message to the console
    }

	}
	
	@Test
	public void test6B() {
		DateUtil date = new DateUtil(15, 1, 1994);
        System.out.println("6B > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(16, date.getDay());
	}
	@Test
	public void test7B() {
		DateUtil date = new DateUtil(15, 2, 1994);
        System.out.println("7B > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(16, date.getDay());
	}
	@Test
	public void test8B() {
		DateUtil date = new DateUtil(15, 11, 1994);
        System.out.println("8B > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(11, date.getMonth());
        Assert.assertEquals(16, date.getDay());
	}
	@Test
	public void test9B() {
		DateUtil date = new DateUtil(15, 12, 1994);
        System.out.println("9B > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(16, date.getDay());
	}
	@Test
	public void test10B() {
		DateUtil date = new DateUtil(15, 6, 1700);
        System.out.println("10B > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(16, date.getDay());
	}
	@Test
	public void test11B() {
		DateUtil date = new DateUtil(15, 6, 1701);
        System.out.println("11B > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(16, date.getDay());
	}
	@Test
	public void test12B() {
		DateUtil date = new DateUtil(15, 6, 2024);
        System.out.println("12B > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(16, date.getDay());
	}
	
}
