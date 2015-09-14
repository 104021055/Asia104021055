import java.util.Scanner;
public class Ex001 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		char data[]=(""+n).toCharArray();
		int len=(""+n).length();
		int sum=0;
		for(int i=0;i<len;i++){
			sum+=(data[i]-48);
		}
		System.out.print((int)+sum);
	}

}

