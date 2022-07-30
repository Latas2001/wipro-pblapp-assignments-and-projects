package com.wipro.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

public class TestSort {
	@Test
	void test() {
		DailyTasks t=new DailyTasks();
		int arr[]= {2,4 ,1, 6,3};
		int arr1[]=t.sortValues(arr);
		assertArrayEquals(arr1,arr);
		
		
		
	}

}
