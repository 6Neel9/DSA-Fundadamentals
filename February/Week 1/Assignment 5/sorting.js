var sortArray = function(nums) {
    var n = nums.length;
   for (var i = 0; i <n-1; i++) {
       var min = i;
       for (var j = i+1; j < n; j++ ) {
           if (nums[j] < nums[min]) {
               min = j;    
           }
       }
       var temp = nums[i];
       nums[i] = nums[min];
       nums[min] = temp;
   }
   return nums;
};
let nums = [5,2,3,1];
console.log(sortArray(nums));