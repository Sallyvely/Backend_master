import java.util.Scanner;

public class Until0 {
	public static void main(String[] args) {
		//정수가 순서대로 입력된다.
		//-2147483648 ~ +2147483647, 단 개수는 알 수 없다.

		//0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) { // 입력되는지 확인
			int numarr = sc.nextInt();
			//numarr에 0이면 중단, 0이 아니면 입력된 숫자 출력
			if(!(numarr==0)) System.out.println(numarr);
			else if(numarr==0) break;
			}
		sc.close();
	}
}