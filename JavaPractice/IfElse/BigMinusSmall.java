import java.util.Scanner;

public class BigMinusSmall {

	public static void main(String[] args) {
		// ū������ ���� �� ����
		
		Scanner sc = new Scanner(System.in);
		String strnum = sc.nextLine();// ���� �Է�
		
		String[] numarr = strnum.split(" "); // ����� ������ �迭�� �ֱ�
		String Num1=numarr[0];
		String Num2=numarr[1];
		
		int NumIn1 = Integer.parseInt(Num1);
		int NumIn2 = Integer.parseInt(Num2); // int�� ����ȯ
		
		if(NumIn1>NumIn2) {
			System.out.println(NumIn1-NumIn2);
		}
		else if (NumIn1<NumIn2) {
			System.out.println(NumIn2-NumIn1);
		}
		else System.out.println(NumIn1-NumIn2);
		
		sc.close();
	}

}
