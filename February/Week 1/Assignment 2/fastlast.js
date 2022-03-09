// Find the first and last position of Element

 let FastOfNumber = function(nums , target){
    let start = -1;
    let end = -1;
    for(let i = 0 ; i< nums.length ; i++){
        if(target != nums[i]) continue
        if(start == -1)
         start = i;
         end = i;
    }
         if(start != -1){
             return[start,end];
         }
         if(nums = []){
            return[start,end];
         }
    }; 
let nums =  [5,7,7,8,8,10];
target = 8;
console.log(FastOfNumber(nums,target));