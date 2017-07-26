
public class TestInteger {
	//Integer缓存机制
	
	public static void main(String[] args) {
		Integer t1 = 3;
		Integer t2 = Integer.valueOf(3);
		System.out.println(t1==t2);//true
		
		//-127到128之间
		Integer t3 = 300;
		Integer t4 = 300;
		System.out.println(t3==t4);//false
	}
}
