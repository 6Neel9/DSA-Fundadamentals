let n=5;
let fibSeriesUsingRecursion=(n)=>{
    if(n<=1){
        return n;
    }else{
        return fibSeriesUsingRecursion(n-1) + fibSeriesUsingRecursion(n-2)
    }
}

for(let i=1;i<=n;i++){
    console.log(fibSeriesUsingRecursion(i))
}