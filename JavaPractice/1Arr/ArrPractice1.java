import java.util.Scanner;

public class ArrPractice1 {
	public static void main(String[] args) {
		/*
		 * �л����� �󱼰� �̸��� ���� ������ ���� ��ȣ�� ������(����)���� �θ���.
		 * 
		 * �⼮ ��ȣ�� n�� �������� �ҷ��� ��, �� ��ȣ(1 ~ 23)�� �Ҹ� Ƚ���� ���� ����غ���.
		 */
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a= new int[24];
		for(int i=1; i<=n; i++ ) {
			int numarr=sc.nextInt();
			a[numarr]+=1;
		}
		
		for(int j=1;j<=23;j++) {
			System.out.print(a[j]+" ");
		sc.close();
		}

	}

}
