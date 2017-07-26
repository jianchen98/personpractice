import java.util.concurrent.locks.ReentrantReadWriteLock;


public class TestReadWriteLock {
	 private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
	    public static void main(String[] args)  {
	        final TestReadWriteLock test = new TestReadWriteLock();
	         
	        new Thread(){
	            public void run() {
	                test.get(Thread.currentThread());
	            };
	        }.start();
	         
	        new Thread(){
	            public void run() {
	                test.get(Thread.currentThread());
	            };
	        }.start();
	         
	    }  
	    //线程0读完了，才开始线程1
	   /* public synchronized void get(Thread thread) {
	        long start = System.currentTimeMillis();
	        while(System.currentTimeMillis() - start <= 1) {
	            System.out.println(thread.getName()+"正在进行读操作");
	        }
	        System.out.println(thread.getName()+"读操作完毕");
	    }*/
	    
	    public  void get(Thread thread) {
	    	rwl.readLock().lock();//改用读写锁，线程可以进行同时读，提升效率
	    	try{
	    		 long start = System.currentTimeMillis();
	 	        while(System.currentTimeMillis() - start <= 1) {
	 	            System.out.println(thread.getName()+"正在进行读操作");
	 	        }
	 	        System.out.println(thread.getName()+"读操作完毕");
	    	}
	        finally {
	            rwl.readLock().unlock();
	        }
	    }
}
