
import java.util.Scanner;
public class Numberrotation {

	public static void main(String[] args) {
		//n개의 숫자가 입력되면,

		//n개의 숫자를 왼쪽으로 하나씩 돌려서 출력하시오.
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] numarr=new int[n];
		//배열 입력
		for(int i=0; i<n; i++) {
			numarr[i]=sc.nextInt();
		}
		int k=1;
		//입력된 배열 출력
		for(int i=0; i<n; i++) {
			System.out.print(numarr[i]+" ");
		}
		System.out.println("");
		//배열을 왼쪽으로 shift
		while(k<n) {
			
			int temp=numarr[0]; //왼쪽으로 이동해야할 값을 temp에 저장
			for(int i=0; i<n-1;i++) {
				numarr[i]=numarr[i+1];
			} // 왼쪽으로 이동
			numarr[n-1]=temp; // 저장했던 값을 배열 맨 오른쪽에 지정
			for(int i=0; i<n; i++) {
				System.out.print(numarr[i]+" ");
			}
			System.out.println("");
			k++;
		}

		sc.close();
		
	}

}
