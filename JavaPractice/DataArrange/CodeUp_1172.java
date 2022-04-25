import java.util.Scanner;

public class CodeUp_1172 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a<b||c>a) {
			if(b<c) {
				System.out.println(a+" "+b+" "+c);
			}
			else if((b>c)&(a>c)) {
				System.out.println(c+" "+a+" "+b);
			}
			else if((b>c)&(a<c)) {
				System.out.println(a+" "+c+" "+b);				
			}
		}
		else if(a>b) {
			if((b<c)&(a>c)) {
				System.out.println(b+" "+a+" "+c);
			}
			else if((b<c)&(a<c)) {
				System.out.println(b+" "+c+" "+a);				
			}
			else if(b>c) {
				System.out.println(c+" "+b+" "+a);
			}
		}
		else if(b<c) {
			if(a<b) {
				System.out.println(a+" "+b+" "+c);
			}
			else if((a>b)&(c>a)) {
				System.out.println(b+" "+a+" "+c);
			}
			else if((a>b)&(c<a)) {
				System.out.println(b+" "+c+" "+a);
			}
		}
	}

}
