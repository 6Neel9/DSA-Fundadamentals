let power=(x,y)=>{
    if(y===0){
        return 1
    }
    return x*power(x,y-1)

}

console.log(power(2,5))