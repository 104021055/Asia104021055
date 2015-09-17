import java.util.Scanner;
public class Ex009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String sex=scn.next();
		float h=scn.nextFloat();
		//float w=scn.nextFloat();
		int n=0;
		float w;
		if(sex=="男生"){
			n=1;
		}
		if(sex=="女生"){
			n=2;
		}
		switch(n){
		case 1:
			System.out.print((h-170)*0.6+62);
			break;
		case 2:
			System.out.print((h-158)*0.5+52);
			break;
			default:
				System.out.print("full");
				break;
		}

	}

}
