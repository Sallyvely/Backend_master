import java.util.Scanner;

public class Until0 {
	public static void main(String[] args) {
		//������ ������� �Էµȴ�.
		//-2147483648 ~ +2147483647, �� ������ �� �� ����.

		//0�� �ƴϸ� �Էµ� ������ ����ϰ�, 0�� �ԷµǸ� ����� �ߴ��غ���.
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) { // �ԷµǴ��� Ȯ��
			int numarr = sc.nextInt();
			//numarr�� 0�̸� �ߴ�, 0�� �ƴϸ� �Էµ� ���� ���
			if(!(numarr==0)) System.out.println(numarr);
			else if(numarr==0) break;
			}
		sc.close();
	}
}