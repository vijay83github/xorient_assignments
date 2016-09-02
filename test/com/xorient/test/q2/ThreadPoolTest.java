package com.xorient.test.q2;

import org.junit.Test;

import com.xorient.test.TestTask;

public class ThreadPoolTest {

	ThreadPool threadPool;

	@Test
	public void test() throws InterruptedException {
		ThreadPool threadPool = new ThreadPool(3,4);
        //Created 15 Tasks and submit to pool
        for(int taskNumber = 1 ; taskNumber <= 7; taskNumber++) {
            TestTask task = new TestTask(taskNumber);
            threadPool.submitTask(task);
        }
	}

}
