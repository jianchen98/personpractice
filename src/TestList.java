import java.util.ArrayList;
import java.util.List;


public class TestList {
	//java 实现：找出在List A中存在，而不在另一个List B中的所有元素

	public static void main(String[] args) {
		List  a  = new ArrayList();
        a.add("A");
        a.add("B");
        
        
        List  b  = new ArrayList();
        b.add("C");
        b.add("D");
        
        //输入A,C
        
        String [] input_arr = new String[]{"A","C","B","E"};
         for(String s:input_arr){
//        	System.out.println(s);
//        	System.out.println(a.contains(s));
//        	System.out.println(b.contains(s));
        	if(a.contains(s)&&(!b.contains(s))){
        		System.out.println(s);
        	}
        }
         
        StringBuffer sb = new StringBuffer("123,456,789,123,456,123,456,678,89,7,8,9,123,456,789,124,567,789.00") ;
        long time = System.currentTimeMillis();
        while(sb.indexOf(",")>-1){
        	 sb=sb.deleteCharAt(sb.indexOf(","));
             System.out.println(sb.toString());
        }
        System.out.println(System.currentTimeMillis()-time);
       
     /*   sb=new StringBuffer(sb.toString().replace(",", ""));
        System.out.println(sb.toString());
        System.out.println(System.currentTimeMillis()-time);*/
       
	}
}
