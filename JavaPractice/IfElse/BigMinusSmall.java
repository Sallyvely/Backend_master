import java.util.Scanner;

public class BigMinusSmall {

	public static void main(String[] args) {
		// 큰수에서 작은 수 빼기
		
		Scanner sc = new Scanner(System.in);
		String strnum = sc.nextLine();// 숫자 입력
		
		String[] numarr = strnum.split(" "); // 띄어쓰기로 나누어 배열에 넣기
		String Num1=numarr[0];
		String Num2=numarr[1];
		
		int NumIn1 = Integer.parseInt(Num1);
		int NumIn2 = Integer.parseInt(Num2); // int로 형변환
		
		if(NumIn1>NumIn2) {
			System.out.println(NumIn1-NumIn2);
		}
		else if (NumIn1<NumIn2) {
			System.out.println(NumIn2-NumIn1);
		}
		else System.out.println(NumIn1-NumIn2);
		
		sc.close();
	}

}
