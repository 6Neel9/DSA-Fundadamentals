import java.util.ArrayList;
import java.util.Arrays;

public class arraysort {
     static int findPeak(Integer[] arr) {
          
        //Traverse an array
        for(int i = 0; i < arr.length -1; i++) {

              /*
               If the current element is greater than
               the next element.
               */
               if(arr[i] > arr[i+1]) {
                    return arr[i];
               }
           }

          return arr[arr.length-1];
      }

       public static void main(String[] args) {
        Integer arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Array:" + Arrays.toString(arr));
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));
        arrayList.add(7);
        arrayList.add(8);
        arrayList.remove(5);
        arr = arrayList.toArray(arr);
        System.out.println("Array after adding element: " + Arrays.toString(arr));
        int result = findPeak(arr);
        System.out.println(result);
    }

}
