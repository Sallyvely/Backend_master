function solution(s) {
    let answer = '';
    let temp= [];
    
    while(s.indexOf(" ")>=0) {
        if(s.charAt(0)>='a'&&s.charAt(0)<='z') {
            temp.push(s.charAt(0).toUpperCase()+s.slice(1,s.indexOf(" ")+1).toLowerCase());
            //console.log(temp)
        }
        else if(s.indexOf(" ")!==0){
            temp.push(s.charAt(0)+s.slice(1,s.indexOf(" ")+1).toLowerCase());
        }
        s=s.slice(s.indexOf(" ")+1);
        console.log(s)
    }
    temp.push(s.charAt(0).toUpperCase()+s.slice(1).toLowerCase());
    for(let j=0; j<temp.length;j++) {
        console.log(temp[j].indexOf(" "))
        if(temp[j].indexOf(" ")>0) {
            answer=answer+temp[j].slice(0,temp[j].length-1)
        }
        if(temp[j].length!==0){
            answer=answer+temp[j];
        }

    }
    return answer;
}