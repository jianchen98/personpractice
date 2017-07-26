
public class TestThree {
	public static void main(String[] args) {
//		int sum = 0;
//		for (int i = 0;i<200;i++){
//			if(i%3==0){
//				System.out.println(i);
//				sum+=i;
//			}
//		}
//		System.out.println(sum);
//		new TestThree().hunder_money_hunder_chikcher();
		new TestThree().threeMultiple();
	}
	public int threeMultiple(){
		int sum = 0;
		for (int i = 0;i<200;i++){
			if(i%3==0){
				System.out.println(i);
//				sum+=i;
				sum+=i;
			}
		}
		System.out.println(sum);
		return sum;
	}
	public boolean isPrime(int n)
	{
	    if(n < 2) return false;

	    for(int i = 2; i < n; ++i)
	        if(n%i == 0) return false;

	    return true;
	}
	public void printprime(){
	 for(int i = 200;i<500;i++){
		 if(isPrime(i)){
			 System.out.println(i);
		 }
	 }
	}
	
	public void hunder_money_hunder_chikcher(){
		 int a,b,c;
	     for(a=1;a<20;a++)
	     {
	         for(b=1;b<33;b++)
	         {
	            for(c=3;c<100;c+=3)
	            {
	                if((a+b+c==100)&&(a*5+b*3+c/3==100)) 
	                    System.out.println(a+":"+b+":"+c);
	            }     
	         }
	      }
		
	}
}
