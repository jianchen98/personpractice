import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class TestCallableAndFeture {
		public static void main(String[] args) {
		 ExecutorService executor = Executors.newCachedThreadPool();//创建可改变任务的线程池
		 
		 Task task = new Task();
		 //提交并执行任务 ，返回一个future对象
		 Future<Integer> result = executor.submit(task);
		 
		 executor.shutdown();//线程池关闭
         
	        try {
	            Thread.sleep(1000);//等待1秒
	        } catch (InterruptedException e1) {
	            e1.printStackTrace();
	        }
	         
	        System.out.println("主线程在执行任务");
	         
	        try {
	            System.out.println("task运行结果"+result.get());
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        } catch (ExecutionException e) {
	            e.printStackTrace();
	        }
	         
	        System.out.println("所有任务执行完毕");
		 
		}
}

//callable和runnable类似，实现了该接口都可以被其他线程执行
class Task implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("子线程在进行计算");
        Thread.sleep(3000);
        int sum = 0;
        for(int i=0;i<100;i++)
            sum += i;
        return sum;
	}
	
}