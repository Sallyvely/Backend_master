import java.util.Scanner;

public class GeometricSequence {

	public static void main(String[] args) {
		//시작 값(a), 등비(r), 몇 번째인지를 나타내는 정수(n)가 입력될 때
		//n번째 수를 출력하는 프로그램을 만들어보자.
		long a=0,r=0,n=0,i=1;
		Scanner sc=new Scanner(System.in);
		String arr=sc.nextLine();
		String[] numarr=arr.split(" ");
		a=Integer.parseInt(numarr[0]);
		r=Integer.parseInt(numarr[1]);
		n=Integer.parseInt(numarr[2]);
		System.out.println(a+""+r+""+n);
		//시작 값(a), 등비의 값(r), 몇 번째 인지를 나타내는 정수(n)가
		//공백을 두고 입력된다.(모두 0 ~ 10)
		while (i<n) {
			a=a*r;
			i++;
			System.out.println(a+""+i);
		}
		System.out.println(a);
		sc.close();
	}

}
