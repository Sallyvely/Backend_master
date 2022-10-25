class Solution {
    public int[] solution(int[] numbers) {
        int temp=numbers.length;
        int[] answer= new int[temp];
        for(int i=0;i<=temp;i++){
            answer[i]=numbers[i]*2;
        }
        return answer;
    }
}