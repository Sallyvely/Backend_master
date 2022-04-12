import java.util.Scanner;

public class TunnelPass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] Htunnel = new int[3];
		
		for(int i = 1; i<=3; i++ ) {
			Htunnel[i-1]=sc.nextInt();
		}
		int a=Htunnel[0];
		int b=Htunnel[1];
		int c=Htunnel[2];
		if ((a&b&c)>170) {
			System.out.println("PASS");
		}
		else {
			System.out.println("CRASH");
		}
		sc.close();
		

	}

}
