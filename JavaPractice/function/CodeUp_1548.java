
import java.util.Scanner;

public class CodeUp_1548 {

	static char grade(int k) {
		if(k>=90) return 'A';
		else if(k>=80&k<90) return 'B';
		else if(k>=70&k<80) return 'C';
		else if(k>=60&k<70) return 'D';
		return 'F';
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		CodeUp_1548 f=new CodeUp_1548();
		System.out.println(f.grade(k));
		sc.close();
	}

}
