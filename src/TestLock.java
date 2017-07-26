import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class TestLock extends Thread {
	private Test test = null;
    public TestLock(Test test) {
        this.test = test;
    }
    @Override
    public void run() {
         
        try {
            test.insert(Thread.currentThread());
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+"±»ÖÐ¶Ï");
        }
    }
}
