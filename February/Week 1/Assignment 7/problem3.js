let recurEven=(n)=>{
    if(n<0){
        return
    }else{
        if(n%2===0){
            console.log(n)
            recurEven(n-2)
        }else{
            recurEven(n-1)
        }
    }
}

recurEven(76);