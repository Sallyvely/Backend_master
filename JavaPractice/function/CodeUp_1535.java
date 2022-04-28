import java.util.Arrays;
import java.util.Scanner;

public class CodeUp_1535 {

	void t() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int max=0;
		for(int i=0;i<5; i++) {
		a[i]=sc.nextInt();
		if(max<a[i]) {
			max=a[i];
			}
		}
		System.out.println(Arrays.asList(a).indexOf(max)+3);
		sc.close();
		
	}
	public static void main(String[] args) {

		CodeUp_1535 ab=new CodeUp_1535();
		ab.t();
	}

}
