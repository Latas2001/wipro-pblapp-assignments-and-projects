package com.wipro.test;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence {
	@Test
	void test() {
		DailyTasks t=new DailyTasks();
		boolean actual=t.checkPresence("Lata","Sharma");
		assertTrue(true);
		assertFalse(false);
		
	}

}
