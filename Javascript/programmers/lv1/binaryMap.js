
function kakaoBinaryTest(n, arr1, arr2) {
    let answer = [];
    let temp = [];
    let answertemp=[];
    for (let i =0; i<n; i++) {
        temp.push(arr1[i]|arr2[i]);
        answertemp.push("")
    }//answertemp 배열 초기화하고 temp에 비트 연산해서 넣기

    for( let i = 0; i < n; i++) {
        answer.push(temp[i].toString(2));
    }// 비트 연산한 결과를 answer배열에 넣기 (이진법)

    for(let i = 0; i < n; i++) {
        for (let j = 0; j < n; j++) {
            let answerResult=answer[i].charAt(j);
            if(answerResult == '1') {
                answertemp[i]=answertemp[i]+"#"
            }
            else if (answerResult == '0') {
                answertemp[i]=answertemp[i]+" "
            }

        }
    }
    
    console.log(answertemp);
    return answer;
}
kakaoBinaryTest(5,[9, 20, 28, 18, 11],[30, 1, 21, 17, 28]);
