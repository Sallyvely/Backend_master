function solution(str1, str2) {
    var answer = 0;
    str1=str1.toLowerCase();
    str2=str2.toLowerCase();
    const str1Arr=[],
          str2Arr=[],
          intersection=[],
          allSection=[];
    
    for(let i=0; i< str1.length;i++) {
        if(((str1.charAt(i)>='a'&&str1.charAt(i)<='z')) && 
           ((str1.charAt(i+1)>='a'&&str1.charAt(i+1)<='z'))){
           str1Arr.push(str1.slice(i,i+2));
        }
    }
    
    for(let i=0; i< str2.length;i++) {
        if(((str2.charAt(i)>='a'&&str2.charAt(i)<='z')) && 
           ((str2.charAt(i+1)>='a'&&str2.charAt(i+1)<='z'))){
           str2Arr.push(str2.slice(i,i+2));
        }
    }
      
    if(str1Arr.length==0 && str2Arr.length ==0) {
        return 65536
    }

    for(let i=0; i<str2Arr.length; i++) {
        if(str1Arr.indexOf(str2Arr[i]) >=0) {
           intersection.push(str1Arr.splice(str1Arr.indexOf(str2Arr[i]),1));
           }
    }
    
    allSection.push(...str2Arr,...str1Arr)
    
    console.log(str1Arr,str2Arr);
    console.log(allSection, intersection)
    
    return Math.trunc((intersection.length/allSection.length)*65536);
}