import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TestWu {
	public static void main(String[] args) {
		String s="1102100002 �Թ����ʱ�����";
		
		//  String r_name3 = "���� 13599998888 000000";
		//һ���ݺ��Ӳ�ѯ
	        Pattern pattern = Pattern.compile("[\\d]");
	        Matcher matcher = pattern.matcher(s);
	        String idx_name=matcher.replaceAll("").trim();
	        System.out.println(idx_name);
	        
	       // String string = "ë��ޱ Lagerstroemia villosa Wall. ex Kurz �й�ֲ��ͼ���";
	        String idx_no = s.replaceAll("(\\s[\u4E00-\u9FA5]+)|([\u4E00-\u9FA5]+\\s)", "");
	        System.out.println(idx_no);
	        if(null!=idx_no&&10==idx_no.length()){
	        	//sql���
	        }
	        if(null!=idx_no&&10==idx_no.length()){
	        	//sql���
	        }
	}
}
