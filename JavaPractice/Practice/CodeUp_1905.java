import java.util.Scanner;
public class CodeUp_1905 {
	static int sum=0;
	public static void Numberre(int n) {


		if(n==0) {
			System.out.println(sum);
			return;
		}
		sum=sum+n;
		Numberre(n-1);
		
	
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		Numberre(n);

	}
}
