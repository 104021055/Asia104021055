import java.util.Scanner;
public class Ex001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String n=scn.next();
		decomp(n);
	}
	public static String decomp(String n){
		char data[]=n.toCharArray();
		int len=n.length();
		String m="";
		for(int i=0;i<len;i++){
			m=""+data[i]+"\t";
			System.out.print(m);
		}
		return m;
	}

}
