import java.util.Scanner;

import javax.security.auth.kerberos.KerberosCredMessage;

public class MakeTriangle {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=(n/2)+1;
		/* ���� �ﰢ��
		 * for(int i=1; i<=n;i++) { for(int j=1;j<=i;j++) { System.out.print("*"); }
		 * System.out.println(""); }
		 */
		
		/* �� �ﰢ��
		 * for (int i=1; i<n+1; i++) { for(int j=n; j>=i;j--) { System.out.print("��"); }
		 * System.out.println(""); }
		 */
		/* �������� �� �ﰢ��
		 * for(int i=1; i<=n;i++) { for(int j=2;j<=i;j++) { System.out.print(" "); } for
		 * (int k=n;k>=i;k--) { System.out.print("*"); } System.out.println(""); }
		 */
		/* ��Ī �ﰢ��
		 * for ( int i=1; i<=n;i++) { for(int j=1; j<=i; j++) { System.out.print("*"); }
		 * System.out.println(""); } for (int i=1; i<=n; i++) { for(int j=n-1;j>=i;j--)
		 * { System.out.print("*"); } System.out.println(""); }
		 */
		/* �Ƕ�̵� �ﰢ��
		 * for(int i=1; i<=a;i++) { for(int j=a-1;j>=i;j--) { System.out.print(" "); }
		 * for(int k=1;k<=2*i-1;k++) { System.out.print("*"); } System.out.println("");
		 * }
		 */
		sc.close();
	}

}
