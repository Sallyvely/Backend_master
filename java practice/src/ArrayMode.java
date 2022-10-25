public class ArrayMode {
        public int solution(int[] array) {
            int answer = 0;
            int count=0;
            for(int i=0;i<array.length;i++){
                for(int j=0; j<array.length;j++){
                    if(array.length==1){
                        answer=array[0];
                    }
                    else if(array[i]==array[j]&&!(i==j)){
                        count=count+1;    
                        if(count==1){
                            answer=array[i];
                            array[i]=0;
                        }
                        if(!((array[i]|array[j])==answer)&&count>1)
                            answer=-1;
                        
                        }
                    
                }
            }
           
            return answer;
        }
}
