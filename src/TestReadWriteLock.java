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
	    //�߳�0�����ˣ��ſ�ʼ�߳�1
	   /* public synchronized void get(Thread thread) {
	        long start = System.currentTimeMillis();
	        while(System.currentTimeMillis() - start <= 1) {
	            System.out.println(thread.getName()+"���ڽ��ж�����");
	        }
	        System.out.println(thread.getName()+"���������");
	    }*/
	    
	    public  void get(Thread thread) {
	    	rwl.readLock().lock();//���ö�д�����߳̿��Խ���ͬʱ��������Ч��
	    	try{
	    		 long start = System.currentTimeMillis();
	 	        while(System.currentTimeMillis() - start <= 1) {
	 	            System.out.println(thread.getName()+"���ڽ��ж�����");
	 	        }
	 	        System.out.println(thread.getName()+"���������");
	    	}
	        finally {
	            rwl.readLock().unlock();
	        }
	    }
}
