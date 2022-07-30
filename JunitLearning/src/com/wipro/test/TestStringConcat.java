package com.wipro.test;
import static org.junit.Assert.*;
import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestStringConcat {
	
	@Test
	public void testConcate() {
		DailyTasks test =  new DailyTasks();
		String result = test.doStringConcat("Lata" ,"Sharma");
		assertEquals("LataSharma", result);
	}

}
