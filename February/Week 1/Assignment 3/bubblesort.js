// Bubblesort problem

let BubbleSort = function(arr){
    for(let i=0 ; i<arr.length ; i++){
        for(let j=0 ; j<arr.length - 1 - i ; j++){
            if(arr[j] > arr[j+1]){
                let temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    console.log(arr);
}

let arr = [244,45,55,63,5,6,12,1,2,8];
console.log(BubbleSort(arr));
