import java.util.Arrays;
import java.util.Scanner;

public class CodeUp_1098 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int[][] arr=new int[h+1][w+1];//배열 선언,초기화
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			int l=sc.nextInt();
			int d=sc.nextInt();
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(d==1) {
				for(int j=0; j<l;j++) {
					int temp=x+j;
					arr[temp][y]= 1;
					
				}
			}
			else if(d==0) {
				for(int k=0;k<l;k++) {
					int temp=y+k;
					arr[x][temp]= 1;
					
				}
			}
		}
		for(int i=1;i<=h;i++) {//배열 출력
			for(int j=1; j<=w;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
