import java.util.Scanner;

public class RandomDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1���� n����, 1���� m���� ���ڰ� ����
		//���� �ٸ� �ֻ��� 2���� ������ �� ���� �� �ִ� ��� ��츦 ����غ���.
		Scanner sc=new Scanner(System.in);
		String ij=sc.nextLine();
		String[] ijarr=ij.split(" ");
		//���ڿ� ���������� ����ȯ
		int i=Integer.parseInt(ijarr[0]);
		int j=Integer.parseInt(ijarr[1]);
		for(int a=1; a<=i;a++) {
			for(int b=1; b<=j;b++) {
				System.out.println(a+" "+b);
			}
		
		}
		sc.close();
	}

}
