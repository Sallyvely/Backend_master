import java.util.Arrays;
import java.util.Scanner;
public class CodeUp_1096 {

	public static void main(String[] args) {
		//바둑판(19 * 19)에 n개의 흰 돌을 놓는다고 할 때,
		//n개의 흰 돌이 놓인 위치를 출력하는 프로그램을 작성해보자.

		Scanner sc=new Scanner(System.in);
		String[][] Arr= new String[20][20]; // 배열선언
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			Arr[x][y]= "1";
		}
		for(int i=1; i<=19;i++) {
			for(int j=1; j<=19;j++) {
				if (Arr[i][j]==null) { //비어있으면 0
					Arr[i][j]="0";
				}
				System.out.print(Arr[i][j]+" ");
			}
			System.out.println("");
		}
		sc.close();
	}

}
