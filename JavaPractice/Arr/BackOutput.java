import java.util.Scanner;

public class BackOutput {
	public static void main(String[] args) {
		//�̹����� �������� ������ n���� ������, n���� �����͸� �Ųٷ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] BackNum = new int[n];
		
		for(int i=1; i<=n; i++) {
			int arr=sc.nextInt();
			BackNum[i-1] = arr;
		}
		for(int j=n-1;j>=0;j--) {
			System.out.print(BackNum[j]+" ");
		}
		sc.close();

	}

}
