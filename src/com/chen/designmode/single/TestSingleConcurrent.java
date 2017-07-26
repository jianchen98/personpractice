package com.chen.designmode.single;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class TestSingleConcurrent {

	private boolean islock;

	public boolean isIslock() {
		return islock;
	}

	public void setIslock(boolean islock) {
		this.islock = islock;
	}

	public static void main(String[] args) {
		final Set<String> instanceSet = Collections
				.synchronizedSet(new HashSet<String>());

		final TestSingleConcurrent lock = new TestSingleConcurrent();
		lock.setIslock(true);
		ExecutorService executorservice = Executors.newCachedThreadPool();
		for (int i = 0; i < 50; i++) {
			executorservice.execute(new Runnable() {
				@Override
				public void run() {
					while (true) {
						if (!lock.isIslock()) {
							Singletonnew s = Singletonnew.getinstance();
							instanceSet.add(s.toString());
							break;
						}
					}
				}
			});

		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lock.setIslock(false);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("------并发情况下我们取到的实例------");
		for (String instance : instanceSet) {
			System.out.println(instance);
		}
		executorservice.shutdown();
	}

}
