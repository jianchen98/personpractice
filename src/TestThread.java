import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class TestThread {
	private ArrayList<Integer> arrayList = new ArrayList<Integer>();
	Lock  lock  = new ReentrantLock();//可重入锁
	public static void main(String[] args) {
		final TestThread test = new TestThread();
		
		new Thread(){
			public void run(){
				test.insert(Thread.currentThread());
			}
		}.start();
		new Thread(){
			public void run(){
				test.insert(Thread.currentThread());
			}
		}.start();
	}
	
	  public void insert(Thread t){
		
	        lock.lock();
//		  if(lock.tryLock()){
			  try {
		            System.out.println(t.getName()+"得到了锁");
		            for(int i=0;i<5;i++) {
		                arrayList.add(i);
		            }
		        } catch (Exception e) {
		            // TODO: handle exception
		        }finally {
		            System.out.println(t.getName()+"释放了锁");
		            lock.unlock();
		        }
		  }
//		  else {
//	            System.out.println(t.getName()+"获取锁失败");
//	        }
	       
//	}
}
