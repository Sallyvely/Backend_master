import java.util.Scanner;

public class BackOutput {
	public static void main(String[] args) {
		//이번에는 데이터의 개수가 n개가 들어오고, n개의 데이터를 거꾸로 출력하는 프로그램을 작성하시오.
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
