// Twosome problem leetcode

let TwoCode = function(nums,target){
    for(let i=0 ; i<nums.length ; i++){
        for(let j=i+1 ; j<nums.length ; j++){
            if(target == nums[i] + nums[j]){
                return [i,j];
            }
        }
    }
}

let nums = [2,7,11,15];
 let target = 17;
 console.log(TwoCode(nums,target));