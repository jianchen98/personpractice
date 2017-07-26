import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TestWu {
	public static void main(String[] args) {
		String s="1102100002 对公存款时点余额";
		
		//  String r_name3 = "张三 13599998888 000000";
		//一根据汉子查询
	        Pattern pattern = Pattern.compile("[\\d]");
	        Matcher matcher = pattern.matcher(s);
	        String idx_name=matcher.replaceAll("").trim();
	        System.out.println(idx_name);
	        
	       // String string = "毛紫薇 Lagerstroemia villosa Wall. ex Kurz 中国植物图像库";
	        String idx_no = s.replaceAll("(\\s[\u4E00-\u9FA5]+)|([\u4E00-\u9FA5]+\\s)", "");
	        System.out.println(idx_no);
	        if(null!=idx_no&&10==idx_no.length()){
	        	//sql添加
	        }
	        if(null!=idx_no&&10==idx_no.length()){
	        	//sql添加
	        }
	}
}
