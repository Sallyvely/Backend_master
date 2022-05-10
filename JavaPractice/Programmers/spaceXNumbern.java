import java.util.Scanner;

public class spaceXNumbern {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int x=scanner.nextInt();
		int n=scanner.nextInt();
        long[] answer =new long[n];
        
        for(int i=0;i<n;i++){
            answer[i]=(long)x*(i+1);
            System.out.print(answer[i]);
        }


	}

}
