function solution(s) {
    let answer = '';
    const temp= [];
    
    while(s.indexOf(" ")> -1) {
        if(s.charAt(0)>='a'&&s.charAt(0)<='z') {
            temp.push(s.charAt(0).toUpperCase()+s.slice(1,s.indexOf(" ")).toLowerCase());
        }
        else if(s.indexOf(" ")!=0) {
            temp.push(s.charAt(0)+s.slice(1,s.indexOf(" ")).toLowerCase());
        }
        s=s.slice(s.indexOf(" ")+1);

    }
    
    if(s.length!==0){
        //temp.push(s.charAt(0).toUpperCase()+s.slice(1).toLowerCase());
        if(s.charAt(0)>='a'&&s.charAt(0)<='z') {
            temp.push(s.charAt(0).toUpperCase()+s.slice(1).toLowerCase());
        }
        else {
            temp.push(s.charAt(0)+s.slice(1).toLowerCase());
        }
    }

    for(let j=0; j<temp.length;j++) {
        if(j == 0) {
            answer=answer+temp[j]
        }
        else if(j==temp.length-1&&temp[j].indexOf(" ")>0) {
            answer = answer + temp[j].slice(0,temp[j].indexOf(" "));
        }
        else if(temp[j].length!==0){
            answer=answer+' '+temp[j];
        }
        

    }
    
    return answer;
}