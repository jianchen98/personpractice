
public class TestStrman {
	public static void main(String[] args) {
		
		TestStrman t = new TestStrman();
		try {
			TestStrman t2 = (TestStrman) t.clone();
			System.out.println(t.hashCode());
			System.out.println(t2.hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
