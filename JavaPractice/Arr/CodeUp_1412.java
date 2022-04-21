import java.util.Scanner;

public class CodeUp_1412 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String Arr=sc.nextLine();
		int alphabet[] = new int[26];
		
		for(int i=0; i < Arr.length(); i++) {
			int index = Arr.charAt(i)- (int)'a';
			alphabet[index]++;
		}
		for ( int i=0;i<alphabet.length;i++) {
			if(alphabet[i]!=0) {
				System.out.println((char)(i+97)+":"+(alphabet[i]));
			}
		}
		sc.close();
		
		
	}

}
