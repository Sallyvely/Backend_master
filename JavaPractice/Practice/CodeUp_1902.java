import java.util.Scanner;
public class CodeUp_1902 {
	static int a=0;
	public static void Numberre(int arg) {
		
		if(arg==0) {
			return;
		}
		System.out.println(arg);
		Numberre(arg-1);
		
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		Numberre(n);
		scanner.close();
	}
}
