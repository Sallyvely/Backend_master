import java.util.Scanner;

public class InputIDNum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String idnum=sc.next();
		String[] idSplit=idnum.split("-");
		int idchange1=Integer.parseInt(idSplit[0]);
		int idchange2=Integer.parseInt(idSplit[1]);
		System.out.print(String.format("%06d", idchange1));
		System.out.print(String.format("%07d", idchange2));
		sc.close();
	}

}