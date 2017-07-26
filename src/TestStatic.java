
	public class TestStatic {  
	    public static int k=0;  
	    public static TestStatic s1=new TestStatic("s1");  
	    public static TestStatic s2=new TestStatic("s2");  
	    public static int i=print("i");  
	    public static int n=99;  
	    public int j=print("j");  
	      
	    {  
	        print("¹¹Ôì¿é");  
	    }  
	      
	    static  
	    {  
	        print("¾²Ì¬¿é");  
	    }  
	      
	    public static int print(String s)  
	    {  
	        System.out.println(++k+":"+s+"\ti="+i+"\tn="+n);  
	        ++n;  
	        return ++i;  
	    }  
	      
	    public TestStatic(String s)  
	    {  
	        System.out.println(++k+":"+s+"\ti="+i+"\tn="+n);  
	        ++i;  
	        ++n;  
	    }  
	  
	    public static void main(String[] args) {  
	        new TestStatic("init");  
	    }  
}
