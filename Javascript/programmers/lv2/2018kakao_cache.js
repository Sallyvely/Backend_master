function solution(cacheSize, cities) {
    var answer = 0;
    const cacheArr = new Array(cacheSize),
          HIT = 1,
          MISS = 5;
    for(let index = 0; index < cities.length; index++){

        if(cacheArr.includes(cities[index].toLowerCase())){
            subArr(cacheArr, cities[index].toLowerCase());
            cacheArr.push(cities[index].toLowerCase());
            answer+=HIT;
        }
        else if (!cacheArr.includes(cities[index].toLowerCase())){
            cacheArr.push(cities[index].toLowerCase());
            answer+=MISS;
        }
        if(cacheArr.length > cacheSize) {
            cacheArr.shift();
        }
       
    }
    return answer;
}
function subArr(cacheArr, cities) {
    for(let i = 0; i < cacheArr.length; i++) {
        if(cacheArr[i] === cities)  {
            cacheArr.splice(i, 1);
                    i--;
        }
    }
}