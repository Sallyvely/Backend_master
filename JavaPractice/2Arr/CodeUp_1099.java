import java.util.Scanner;
public class CodeUp_1099 {

	public static void main(String[] args) {

		//왕개미를 유심히 살펴보던 중 특별히 성실해 보이는 개미가 있었는데,
		//그 개미는 개미굴에서 나와 먹이까지 가장 빠른 길로 이동하는 것이었다.

		//개미는 오른쪽으로 움직이다가 벽을 만나면 아래쪽으로 움직여 가장 빠른 길로 움직였다.
		//미로 상자에 넣은 개미는 먹이를 찾았거나, 더 이상 움직일 수 없을 때까지
		//오른쪽 또는 아래쪽으로만 움직였다.

		//미로 상자의 구조가 0(갈 수 있는 곳), 1(벽 또는 장애물)로 주어지고,
		//먹이가 2로 주어질 때, 성실한 개미의 이동 경로를 예상해보자.

		//단, 맨 아래의 가장 오른쪽에 도착한 경우, 더 이상 움직일 수 없는 경우, 먹이를 찾은 경우에는
		//더이상 이동하지 않고 그 곳에 머무른다고 가정한다.


		//미로 상자의 테두리는 모두 벽으로 되어 있으며,
		//개미집은 반드시 (2, 2)에 존재하기 때문에 개미는 (2, 2)에서 출발한다.

		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[11][11];
		
		for(int i=1;i<11;i++) {// 미로 구조 입력
			for(int j=1;j<11;j++) {
				arr[i][j]=sc.nextInt();
			}
		}

		int x = 2,y=2;// 시작 위치 지정
		while(x<11&y<11) {//먹이를 찾는중
			if(arr[x][y]==9) {
				y++;
			}
			else if(arr[x][y]==0) {
				arr[x][y]=9;
				if(arr[x+1][y]==1) {// 벽이 있을경우 아래나 오른쪽으로 이동
					y++;
				}
				else if(arr[x][y+1]==1) {
					x++;
				}
				
			}
			else if(arr[x][y]==1) {// 벽이 있을경우 중지
				break;
			}
			else if(arr[x][y]==2) {// 먹이 발견함
				arr[x][y]=9;
				break;
			}
		}

		for(int k=1;k<11;k++) {
			for(int l=1;l<11;l++) {
				System.out.print(arr[k][l]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
