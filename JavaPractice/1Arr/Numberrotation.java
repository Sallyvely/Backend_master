
import java.util.Scanner;
public class Numberrotation {

	public static void main(String[] args) {
		//n���� ���ڰ� �ԷµǸ�,

		//n���� ���ڸ� �������� �ϳ��� ������ ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] numarr=new int[n];
		//�迭 �Է�
		for(int i=0; i<n; i++) {
			numarr[i]=sc.nextInt();
		}
		int k=1;
		//�Էµ� �迭 ���
		for(int i=0; i<n; i++) {
			System.out.print(numarr[i]+" ");
		}
		System.out.println("");
		//�迭�� �������� shift
		while(k<n) {
			
			int temp=numarr[0]; //�������� �̵��ؾ��� ���� temp�� ����
			for(int i=0; i<n-1;i++) {
				numarr[i]=numarr[i+1];
			} // �������� �̵�
			numarr[n-1]=temp; // �����ߴ� ���� �迭 �� �����ʿ� ����
			for(int i=0; i<n; i++) {
				System.out.print(numarr[i]+" ");
			}
			System.out.println("");
			k++;
		}

		sc.close();
		
	}

}
