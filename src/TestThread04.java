
public class TestThread04 extends Thread { 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run'"+this.isAlive()+Thread.currentThread().getId());
		try {
			Thread.sleep(2000);
			System.out.println("�߳����ȼ�"+this.getPriority());
			Thread.interrupted();//����interrupted�̲߳�������ֹͣ
			System.out.println("����interrupet��\n"+this.isAlive());
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("run is  end");
		
	}
	
	public static void main(String[] args) {
		TestThread04 t= new TestThread04();
		t.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.stop();//����stop���߳�����ֹͣ
		System.out.println(t.isAlive());
	}
}
