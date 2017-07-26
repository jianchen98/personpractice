import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class TestCallableAndFeture {
		public static void main(String[] args) {
		 ExecutorService executor = Executors.newCachedThreadPool();//�����ɸı�������̳߳�
		 
		 Task task = new Task();
		 //�ύ��ִ������ ������һ��future����
		 Future<Integer> result = executor.submit(task);
		 
		 executor.shutdown();//�̳߳عر�
         
	        try {
	            Thread.sleep(1000);//�ȴ�1��
	        } catch (InterruptedException e1) {
	            e1.printStackTrace();
	        }
	         
	        System.out.println("���߳���ִ������");
	         
	        try {
	            System.out.println("task���н��"+result.get());
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        } catch (ExecutionException e) {
	            e.printStackTrace();
	        }
	         
	        System.out.println("��������ִ�����");
		 
		}
}

//callable��runnable���ƣ�ʵ���˸ýӿڶ����Ա������߳�ִ��
class Task implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("���߳��ڽ��м���");
        Thread.sleep(3000);
        int sum = 0;
        for(int i=0;i<100;i++)
            sum += i;
        return sum;
	}
	
}