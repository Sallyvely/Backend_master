import java.util.Scanner;

public class GeometricSequence {

	public static void main(String[] args) {
		//���� ��(a), ���(r), �� ��°������ ��Ÿ���� ����(n)�� �Էµ� ��
		//n��° ���� ����ϴ� ���α׷��� ������.
		long a=0,r=0,n=0,i=1;
		Scanner sc=new Scanner(System.in);
		String arr=sc.nextLine();
		String[] numarr=arr.split(" ");
		a=Integer.parseInt(numarr[0]);
		r=Integer.parseInt(numarr[1]);
		n=Integer.parseInt(numarr[2]);
		System.out.println(a+""+r+""+n);
		//���� ��(a), ����� ��(r), �� ��° ������ ��Ÿ���� ����(n)��
		//������ �ΰ� �Էµȴ�.(��� 0 ~ 10)
		while (i<n) {
			a=a*r;
			i++;
			System.out.println(a+""+i);
		}
		System.out.println(a);
		sc.close();
	}

}
