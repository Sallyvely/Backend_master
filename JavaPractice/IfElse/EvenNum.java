import java.util.Scanner;
public class EvenNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String NumInput=sc.nextLine();
	
		String[] NumStrIn=NumInput.split(" ");
		
		String Numstr1=NumStrIn[0];
		String Numstr2=NumStrIn[1];
		String Numstr3=NumStrIn[2];
		
		int Num1=Integer.parseInt(Numstr1);
		int Num2=Integer.parseInt(Numstr2);
		int Num3=Integer.parseInt(Numstr3);
		
		if (Num1%2==0) {
			System.out.println(Num1);
		}
		if(Num2%2==0) {
			System.out.println(Num2);
		}
		if(Num3%2==0) {
			System.out.println(Num3);
		}
		
		sc.close();
	}
}