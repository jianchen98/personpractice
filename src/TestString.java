import java.util.ArrayList;
import java.util.List;


public class TestString {
	public static void main(String[] args) {
//		List<Integer> list = new TestString().f("123abgajgab555ab000ab", "ab");
//		for(Integer i:list){
//			System.out.println(i);
//		}
//		new TestString().test();
		
		List<Integer> list = new TestString().getSpecialPosition("abc123abc34abc","abc");
		for(Integer i:list){
			System.out.println(i);
		}
	}
	
	//abcabc ab
	//方法1
	public List<Integer> f(String str1,String str2){
		List<Integer> list = new ArrayList<Integer>();
		int start_location = 0;
		while(str1.indexOf(str2,start_location)!=-1){
			int c  = str1.indexOf(str2, start_location);
			list.add(c);
			start_location =c+str2.length();
		}
		return list;
	}
	//方法2
	public static void  test(){
		String str="abcd123abcd";
		String str1="abc";
		int num=0;
		for (int i = 0; i < str.length(); i++) {
			int j=str.indexOf(str1);
			if(j!=-1){
				System.out.println(num+j);
				str=str.substring(j+str1.length(),str.length());
				num+=j+str1.length();
			}
		}
	}
	
	public List<Integer> getSpecialPosition(String source, String regStr) {
        int position = source.indexOf(regStr);
        List<Integer> list = new ArrayList<Integer>();
        int last = source.lastIndexOf("abc");
        if (position != -1) {
            list.add(position);
            if (position == last && last == 0) {
                return list;
            }
        } else {
            return list;
        }
        while (true) {
            position = source.indexOf(regStr, position + 1);
         //   System.out.println(position);
            if (position != last) {
                list.add(position);
            } else {
                list.add(position);
                break;
            }
        }
        return list;
    }


}
