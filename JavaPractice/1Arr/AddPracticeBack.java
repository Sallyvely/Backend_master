import java.util.Scanner;

public class AddPracticeBack {
	public static void main(String[] args) {
		/*
		 * �л����� �󱼰� �̸��� ���� ������ ���� ��ȣ�� ������(����)���� �θ���.
		 * 
		 * �⼮ ��ȣ�� n�� �������� �ҷ��� ��, �� ��ȣ(1 ~ 23)�� �Ҹ� Ƚ���� ���� ����غ���.
		 */
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] a= new int[24];
		for(int i=1; i<=n; i++ ) {
			int numarr=sc.nextInt();
			System.out.print(numarr+" ");
			arr[i]=numarr;
		}

		
		for(int j=23;j<=1;j--) {
			System.out.print(arr[j]+" ");
		sc.close();
		}

	}

}
