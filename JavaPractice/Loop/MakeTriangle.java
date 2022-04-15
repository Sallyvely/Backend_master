import java.util.Scanner;

import javax.security.auth.kerberos.KerberosCredMessage;

public class MakeTriangle {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		/* Á÷°¢ »ï°¢Çü
		 * for(int i=1; i<=n;i++) { for(int j=1;j<=i;j++) { System.out.print("*"); }
		 * System.out.println(""); }
		 */
		
		/* ¿ª »ï°¢Çü
		 * for (int i=1; i<n+1; i++) { for(int j=n; j>=i;j--) { System.out.print("¤±"); }
		 * System.out.println(""); }
		 */
		/* ¿ìÃøÁ¤·Ä ¿ª »ï°¢Çü
		 * for(int i=1; i<=n;i++) { for(int j=2;j<=i;j++) { System.out.print(" "); } for
		 * (int k=n;k>=i;k--) { System.out.print("*"); } System.out.println(""); }
		 */
		/* ´ëÄª »ï°¢Çü
		 * for ( int i=1; i<=n;i++) { for(int j=1; j<=i; j++) { System.out.print("*"); }
		 * System.out.println(""); } for (int i=1; i<=n; i++) { for(int j=n-1;j>=i;j--)
		 * { System.out.print("*"); } System.out.println(""); }
		 */
		sc.close();
	}

}
