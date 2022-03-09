//Program for finding rotation of array

let rotation = function(nums){
    let start = 0 , end = nums.length - 1;
    while(start < end){
        let mid = Math.floor(start + (end - start)/2);
        if(nums[mid] > end){
            start = mid + 1
        }
        else{
            end = start;
        }
        return nums[start];
    }
}

let nums = [3,4,5,1,2]
console.log(rotation(nums));