import java.awt.image.DataBufferInt;
import java.util.Scanner;

public class Numberrotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] numarr=new int[n];
		for(int i=0; i<n; i++) {
			numarr[i]=sc.nextInt();
		}
		int temp=numarr[0];
		for(int i=n-1; i>=1;i--) {
			numarr[i-1]=numarr[i];
		}
		numarr[n-1]=temp;
		for(int i=0; i<n; i++) {
			System.out.print(numarr[i]+" ");
		}
		

		sc.close();
		
	}

}
