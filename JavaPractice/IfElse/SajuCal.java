import java.util.Scanner;

public class SajuCal {

	public static void main(String[] args) {
		// 사주 구하기 연도-월+일 의 끝자리가 0일때는 대박 출력 
		Scanner sc = new Scanner(System.in);
		String saju = sc.next();
		String[] sajuArr = saju.split("\\.");
		String yearstr = sajuArr[0];
		String monthstr = sajuArr[1];
		String daystr = sajuArr[2];
		int year = Integer.parseInt(yearstr);
		int month = Integer.parseInt(monthstr);
		int day = Integer.parseInt(daystr);
		
		
		if((year-month+day)%10==0) System.out.println("대박"); 
		
			else 
				System.out.println("그럭저럭"); 

		
		 

		sc.close();
	}

}
