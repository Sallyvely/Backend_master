import java.util.Scanner;

public class CodeUp_1024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Է¹��� �ܾ�(����)�� �� ���ڸ�

		//���ٿ� �� ���ھ� �и��� ����Ѵ�.
		Scanner sc=new Scanner(System.in);
		String str=sc.next();

		for( int i=0; i< str.length(); i++) {
			System.out.println("'" + str.charAt(i)+ "'");
		}

		
		sc.close();
	}

}
