let missing_element = function findFirstMissing(array, start, end)
{
    if (start > end)
        return end + 1;

    if (start != array[start])
        return start;
      let mid = Math.floor((start + end) / 2);

    // Left half has all elements from 0 to mid
    if (array[mid] == mid)
         return findFirstMissing(array, mid+1, end);

         return findFirstMissing(array, start, mid);
}
 
  let arr = [0, 1, 2, 6, 9, 11, 15];
  let n = arr.length;

document.write("smallest Missing element is " +
missing_element(arr, 0, n - 1));