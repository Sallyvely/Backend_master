import java.util.Arrays;
import java.util.Scanner;
public class CodeUp_1096 {

	public static void main(String[] args) {
		//�ٵ���(19 * 19)�� n���� �� ���� ���´ٰ� �� ��,
		//n���� �� ���� ���� ��ġ�� ����ϴ� ���α׷��� �ۼ��غ���.

		Scanner sc=new Scanner(System.in);
		String[][] Arr= new String[20][20]; // �迭����
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			Arr[x][y]= "1";
		}
		for(int i=1; i<=19;i++) {
			for(int j=1; j<=19;j++) {
				if (Arr[i][j]==null) { //��������� 0
					Arr[i][j]="0";
				}
				System.out.print(Arr[i][j]+" ");
			}
			System.out.println("");
		}
		sc.close();
	}

}
