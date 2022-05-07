import java.util.Scanner;
public class CodeUp_1904 {
	static int b;
	public static void Numberre(int n) {
		
		
		if(n%2==1) {
			System.out.print(n+" ");

		}
		if(n==b) {
			return;
		}
		n++;
		Numberre(n);
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		b=scanner.nextInt();
		Numberre(a);

	}
}
