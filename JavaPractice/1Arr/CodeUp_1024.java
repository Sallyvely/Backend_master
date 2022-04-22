import java.util.Scanner;

public class CodeUp_1024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력받은 단어(영어)의 각 문자를

		//한줄에 한 문자씩 분리해 출력한다.
		Scanner sc=new Scanner(System.in);
		String str=sc.next();

		for( int i=0; i< str.length(); i++) {
			System.out.println("'" + str.charAt(i)+ "'");
		}

		
		sc.close();
	}

}
