import java.util.Scanner;
public class CodeUp_1912 {
	static int fac=1;
	public static void Numberre(int n) {


		if(n==0) {
			System.out.println(fac);
			return;
		}
		fac=(n)*fac;
		Numberre(n-1);

	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		Numberre(n);

	}
}
