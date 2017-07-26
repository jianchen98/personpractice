
public class TestThread04 extends Thread { 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run'"+this.isAlive()+Thread.currentThread().getId());
		try {
			Thread.sleep(2000);
			System.out.println("线程优先级"+this.getPriority());
			Thread.interrupted();//调用interrupted线程不会马上停止
			System.out.println("调用interrupet后\n"+this.isAlive());
			
			
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
		t.stop();//调用stop后线程立即停止
		System.out.println(t.isAlive());
	}
}
