
public class TestFloat {
	public static void main(String[] args) {
		java.text.DecimalFormat   df   =new   java.text.DecimalFormat("0.00");
		df.format(14221617084.712200);
//		����new java.text.DecimalFormat(��#.00��).format(3.1415926)
		System.out.println(df.format(14221617084.712200));
	}
}
