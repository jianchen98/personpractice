
public class TestThread02  extends Thread{
		public static void main(String[] args) {
			new TestThread02().start();
			new Thread(new jiayoufu()).start();
		}
		@Override
		public void run() {
		// TODO Auto-generated method stub
		   System.out.println("TestThread02 is run ");
		}
}

class jiayoufu implements Runnable{

	@Override
	public void run() {
		System.out.println("jiayoufu  Ïß³ÌÆô¶¯");
		
	}
	
}