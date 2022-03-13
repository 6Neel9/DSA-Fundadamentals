const swap=(arr,index1,index2)=>{
    [arr[index1],arr[index2]]=[arr[index2],arr[index1]];
    }
    const bubbleSort=(arr)=>{
    const n=arr.length
    let isSwap;
        for( let i=n;i>0;i--){
            isSwap=true
            for(let j=0;j<i-1;j++){
                if(arr[j]<arr[j+1]){
                    swap(arr,j,j+1)
                    isSwap=false
                }
            }
            if(isSwap){
                break;
            }
        }
        return arr
    
    }

let sortinDecending=(str)=>{
    let arr=[]
    for(let i=0 ;i<str.length;i++){
       arr.push(str.charCodeAt(i))
    }
    let res=String.fromCharCode(...bubbleSort(arr))
    console.log(res)
}
sortinDecending("abhishek")