import java.util.Scanner;
import java.util.Random;
public class Ex004 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		Random rnd=new Random();
		int data[]=new int[6];
		boolean flag=false;
		int i=0;
		while(i<6){
			data[i]=rnd.nextInt(43)+1;
			flag=false;
			for(int j=0;j<i;j++){
				if(data[i]==data[j]){
					flag=true;
				}
			}
			if(flag==false){
				System.out.println(data[i]);
				i++;
			}
			
		}

	}

}
