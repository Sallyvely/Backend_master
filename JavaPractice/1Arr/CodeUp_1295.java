import java.util.Scanner;
public class CodeUp_1295 {

	public static void main(String[] args) {
		//�־����� ������ �빮�ڸ� �ҹ��ڷ�, �ҹ��ڸ� �빮�ڷ� �����ϴ� ���α׷��� �ۼ��϶�.
		Scanner sc = new Scanner(System.in);
		String arr=sc.next();
		for(int i=0; i<arr.length();i++) {
			if((arr.charAt(i) <= 90)&&(arr.charAt(i) >= 65) ) {	//charAt���� string�� ���ڷ� ����
				System.out.print((char)(arr.charAt(i)+ 32)); // �ƽ�Ű�ڵ� ������ 32��ŭ ���ؼ� �ҹ��ڸ� �빮�ڷ� ����
			}
			else if(arr.charAt(i) >= 97) {
				System.out.print((char)(arr.charAt(i)- 32));// �ƽ�Ű�ڵ� ������ 32��ŭ ���� �빮�ڸ� �ҹ��ڷ� ����
			}
			else
			{
				System.out.print((char)arr.charAt(i)); // ���� ����ó��
			}
		}
		sc.close();
	}

}
