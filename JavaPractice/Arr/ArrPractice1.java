import java.util.Scanner;

public class ArrPractice1 {
	public static void main(String[] args) {
		/*
		 * 학생들의 얼굴과 이름을 빨리 익히기 위해 번호를 무작위(랜덤)으로 부른다.
		 * 
		 * 출석 번호를 n번 무작위로 불렀을 때, 각 번호(1 ~ 23)가 불린 횟수를 각각 출력해보자.
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
