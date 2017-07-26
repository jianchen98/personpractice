package com.chen;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThreadPool {
	public static void main(String[] args) {
		ServerSocket listener = null;
		try {
			listener = new ServerSocket(8080);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//线程池创建对象 4个
//		ExecutorService executor = Executors.newFixedThreadPool(4);
		
		//创建线程池的同时，并创建队列
		ExecutorService executor = newBoundedFixedThreadPool(4, 16);
		try {
		 while (true) {
		   try {
			Socket socket = listener.accept();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		   executor.submit( new HandleRequestRunnable(socket) );
		 }
		} finally {
		  try {
			listener.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	public static ExecutorService newBoundedFixedThreadPool(int nThreads, int capacity) {
		 return new ThreadPoolExecutor(nThreads, nThreads,0L, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>(capacity), new ThreadPoolExecutor.DiscardPolicy());
		}
}
