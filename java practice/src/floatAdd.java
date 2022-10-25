class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer=new int[2];
        int down=1;
        int sum=1;
        int downt=num1*num2;
        int tempa=num2*denum1;
        int tempb=num1*denum2;
        int tempsum=tempa+tempb;

        for(int j=1; j<=tempsum&&j<=downt;j++){
            if((downt%j==0)&&(tempsum%j==0)){
            sum=tempsum/j;
            down=downt/j;
            }
        }
        answer[0]=sum;
        answer[1]=down;
        
        return answer;
        }
}