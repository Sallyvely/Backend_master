import java.util.Scanner;
public class CodeUp_1295 {

	public static void main(String[] args) {
		//주어지는 문장의 대문자를 소문자로, 소문자를 대문자로 변경하는 프로그램을 작성하라.
		Scanner sc = new Scanner(System.in);
		String arr=sc.next();
		for(int i=0; i<arr.length();i++) {
			if((arr.charAt(i) <= 90)&&(arr.charAt(i) >= 65) ) {	//charAt으로 string을 숫자로 변경
				System.out.print((char)(arr.charAt(i)+ 32)); // 아스키코드 십진수 32만큼 더해서 소문자를 대문자로 변경
			}
			else if(arr.charAt(i) >= 97) {
				System.out.print((char)(arr.charAt(i)- 32));// 아스키코드 십진수 32만큼 빼서 대문자를 소문자로 변경
			}
			else
			{
				System.out.print((char)arr.charAt(i)); // 숫자 예외처리
			}
		}
		sc.close();
	}

}
