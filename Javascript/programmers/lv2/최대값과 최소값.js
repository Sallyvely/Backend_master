function solution(s) {
    let temp=[];
    
    while(s.indexOf(" ")>0){
        temp.push(s.slice(0,s.indexOf(" ")));
        s= s.slice(s.indexOf(" ")+1);

    }
    temp.push(s);
    let maxValue=Math.max(...temp);
    let minValue=Math.min(...temp);
    
    return minValue +' '+ maxValue;
}