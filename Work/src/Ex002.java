import java.util.Scanner;
public class Ex002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		char data1[]=str.toCharArray();
		int len=str.length();
		char data2[]=new char[len];
		for(int i=0;i<len;i++){
			data2[i]=data1[len-i-1];
		}
		for(int i=0;i<len;i++){
			System.out.print(data2[i]);
		}

	}

}
