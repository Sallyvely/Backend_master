function solution(record) {
    var answer = [];
    let map = new Map();
    const exCommand = ["Enter","Change"];
    const PRINTCOMMAND = {
        EnterValue: 'Enter',
        LeaveValue: 'Leave'
    };
    const MESSAGE={
        ENTER: '님이 들어왔습니다.',
        LEAVE: '님이 나갔습니다.',
    };


    record.forEach(entry => {
        let [command, uid, nick] = entry.split(" ");
        if(exCommand.includes(command)) map.set(uid,nick);

    })

    record.forEach(entry => {
        let [command, uid]=entry.split(" ");
        if(command==PRINTCOMMAND.EnterValue) answer.push(map.get(uid)+MESSAGE.ENTER);      
        if(command==PRINTCOMMAND.LeaveValue) answer.push(map.get(uid)+MESSAGE.LEAVE);
    })

    return answer;
}
