var sortColors = function(nums) {
    var counts = [0, 0, 0];
var len = nums.length;
for (var i = 0; i < len; i++) {
  counts[nums[i]]++;
}
for (var j = 0; j < len; j++) {
  nums[j] = j < counts[0] ? 0 : (j < counts[0] + counts[1] ? 1 : 2);
}
  
};

let nums = [2,0,2,1,1,0];
console.log(sortColors(nums));