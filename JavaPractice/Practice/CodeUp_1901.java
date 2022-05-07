import java.util.Scanner;
public class CodeUp_1901 {
	public static void Numberre(int arg) {
		if(arg==0) {
			return;
		}
		Numberre(arg-1);
		System.out.println(arg);
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		Numberre(n);
		scanner.close();
	}
	

}
