
public class TestThrad03 {
	private int value;
	public int getNext(){
		return ++value;
	}
	public static void main(String[] args) {
		final TestThrad03 t = new TestThrad03();
		 final Thread t1 = new Thread(){
			public void run() {	
				for(int i =0;i<20;i++){
					System.out.println(Thread.currentThread().getName()+ " "+t.getNext());
				}
			}
		};
		Thread t2 = new Thread(){
			public void run() {	
				for(int i =0;i<20;i++){
					System.out.println(Thread.currentThread().getName()+" "+t.getNext());
				}
			}
		};
		t1.start();
		t2.start();
		
//		System.out.println(t1.currentThread().getName()+t.value);
//		System.out.println(t2.currentThread().getName()+t.value);
	 }
}
