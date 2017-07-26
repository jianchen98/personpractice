import java.util.ArrayList;
import java.util.List;


public class Testlistsort {

	public static void main(String[] args) {
		List accountypeList = new ArrayList();
		accountypeList.add("integrateaccout");
		accountypeList.add("AAA");
		accountypeList.add("BBB");
		accountypeList.add("investfund");
		accountypeList.add("integrateaccout");
		accountypeList.add("CCC");
		accountypeList.add("certifyaccount");
		accountypeList.add("investfund");
		accountypeList.add("certifyaccount");
		
		
		List acctnolist = new ArrayList();
		acctnolist.add("2222-xxxx-01");
		acctnolist.add("123456789");
		acctnolist.add("222222222");
		acctnolist.add("2222-xxxx-02");
		acctnolist.add("3333-yyyy-01");
		acctnolist.add("999999999");
		acctnolist.add("3333-yyyy-02");
		acctnolist.add("3333-zzzz-3");
		acctnolist.add("2222-xxxx-03");
		
		
		List accnotem = new ArrayList();
		List acctindex = new ArrayList();
		for(int i=0;i<acctnolist.size();i++){
			String acctno = (String) acctnolist.get(i);
			for(int j=i;j<acctnolist.size();j++){
				String nexacctno = (String) acctnolist.get(i);
				if(acctno.substring(0, 8).equals(nexacctno.substring(0, 9))){
					accnotem.add(nexacctno);
					acctindex.add(j);
				}
			}
		}
		
		
	}
	
	
}
