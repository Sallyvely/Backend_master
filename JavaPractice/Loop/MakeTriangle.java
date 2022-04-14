import java.util.Scanner;

import javax.security.auth.kerberos.KerberosCredMessage;

public class MakeTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		/* Á÷°¢ »ï°¢Çü
		 * for(int i=1; i<=n;i++) { for(int j=1;j<=i;j++) { System.out.print("*"); }
		 * System.out.println(""); }
		 */
		
		for (int i=1; i<n+1; i++) {
			for(int j=n; j>=i;j--) {
				System.out.print("¤±");
				for(int k=1;k<=i;k++) {
				System.out.print("*");
				}
			
			}
			System.out.println("");
		}
		
		sc.close();
	}

}
