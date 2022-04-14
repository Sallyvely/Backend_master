import java.util.Scanner;

public class RandomDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 n까지, 1부터 m까지 숫자가 적힌
		//서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력해보자.
		Scanner sc=new Scanner(System.in);
		String ij=sc.nextLine();
		String[] ijarr=ij.split(" ");
		//문자열 숫자형으로 형변환
		int i=Integer.parseInt(ijarr[0]);
		int j=Integer.parseInt(ijarr[1]);
		for(int a=1; a<=i;a++) {
			for(int b=1; b<=j;b++) {
				System.out.println(a+" "+b);
			}
		
		}
		sc.close();
	}

}
