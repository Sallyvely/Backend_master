class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer=new int[2];
        int Gvalue=0;
        
        for(int i=1; i<=num1&&i<=num2; i++){
            if((num1%i==0)&&(num2%i==0)){
                Gvalue=i;
            }
        }
        
        int down=Gvalue*(num1/Gvalue)*(num2/Gvalue);
        int n1=num1/Gvalue;
        int n2=num2/Gvalue;
              
        answer[0]=denum1*n2+denum2*n1;
        answer[1]=down;
        
        return answer;
    }
}