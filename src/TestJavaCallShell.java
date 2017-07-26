import java.io.IOException;


public class TestJavaCallShell {
	public static void main(String[] args) {
		   String shpath="/home/infa/etl/aa.sh";   //程序路径

		    Process process =null;

		    String command1 = "chmod 777 " + shpath;
		    try {
				process = Runtime.getRuntime().exec(command1);
				 process.waitFor();
				 System.out.println("执行成功");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//
//		    String var="201102";               //参数
//
//		    String command2 = “/bin/sh ” + shpath + ” ” + var; 
//		    Runtime.getRuntime().exec(command2).waitFor();
	}
}
