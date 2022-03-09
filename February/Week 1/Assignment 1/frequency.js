let frequency = function (arr, target, flag) {

    let result = -1;
    
    let low = 0, high = arr.length - 1;
    while (low <= high) {
        let mid = Math.floor((low + high) / 2);
      
        if (arr[mid] === target) {
            //we got the answer but storing it in tmp var and doing futher investigation.
            result = mid;
            //futher investagtion
            if (flag === true) {
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        } 
        else if (arr[mid] < target) {
            low = mid + 1;
        } else
            high = mid - 1;

    }
    return result;
}
let arr = [1,1,2,2,4,5,5,6,6,6,6,9,10,11] ;
let target = 6;
let ub = frequency (arr, target, true);
let lb = frequency (arr, target, false);
let result = lb - ub + 1;
console.log(result);


