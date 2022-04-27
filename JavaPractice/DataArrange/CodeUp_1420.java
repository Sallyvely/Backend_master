
import java.util.Scanner;
import java.util.TreeMap;

public class CodeUp_1420 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		TreeMap<Integer, String> map=new TreeMap<>() ;
		for(int i=1; i<=n; i++) {
			String name=sc.next();
			int score=sc.nextInt();
			map.put(score,name);
			//System.out.println(name+" "+score);
			
		}
		System.out.println(map);
		sc.close();

	}

}
